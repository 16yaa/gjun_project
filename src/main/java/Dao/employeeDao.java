package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Employee;
import Model.mobilemember;

public class employeeDao implements implemployeeDao{
	
	public static void main(String[] args) {
		Employee emp=new Employee("qwe","qwe");
		new employeeDao().addemployee(emp);
		
	}
	
	
	@Override
	public void addemployee(Object o) {
		Employee emp=(Employee) o;
		Connection conn=implDbConnection.getDb();
		LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=null;
        f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		String sql="insert into hw.employee(username,password,createtime) values(?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1,emp.getUsername());
			ps.setString(2,emp.getPassword());
			ps.setString(3,now.format(f));
			
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(employeeDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public List<Object> query(String username, String password) {
		List<Object> l=new ArrayList();
		Connection conn= implDbConnection.getDb();
        String SQL="SELECT * FROM hw.employee where username = '"+ username + "' and password = '" + password + "' ";
        try {
        	Statement statement = conn.createStatement();
        	ResultSet rs=statement.executeQuery(SQL);
        	if(rs.next())
        	{
        		Employee emp=new Employee();
        		emp.setId(rs.getInt("id"));
        		emp.setUsername(rs.getString("username"));
        		emp.setPassword(rs.getString("password"));
        		emp.setCreatetime(rs.getString("createtime"));
            
        		l.add(emp);
            
        	}
		} catch (SQLException e) {
			Logger.getLogger(employeeDao.class.getName()).log(Level.SEVERE, null, e);
		}
		return l;
	}

	@Override
	public void update(Object o) {
		Employee emp=(Employee) o;
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.employee set username=?,password=?,createtime=? where id=?";
		try {
            PreparedStatement ps=conn.prepareStatement(SQL);            
            ps.setString(1, emp.getUsername());
            ps.setString(2, emp.getPassword());
            ps.setString(3, emp.getCreatetime());
            ps.setInt(4, emp.getId());
            
            ps.executeUpdate();
                    
            
        } catch (SQLException ex) {
            Logger.getLogger(employeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
	}
		
	

	@Override
	public void delete(int id) {
		Connection conn=implDbConnection.getDb();
        String Sql="delete from member where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(Sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(employeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
		
	}

	@Override
	public List<Object> queryAll() {
		Connection conn=implDbConnection.getDb();
        String SQL="select * from hw.member";
        List<Object> l=new ArrayList();
        try {
            PreparedStatement ps=conn.prepareStatement(SQL);
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
            	
            	Employee emp=new Employee();
                emp.setId(rs.getInt("id"));
                emp.setUsername(rs.getString("username"));
                emp.setPassword(rs.getString("password"));
                emp.setCreatetime(rs.getString("createtime"));
                
                l.add(emp);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(employeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
		return null;
	}

	@Override
	public List<Object> query(String username) {
		List<Object> l=new ArrayList();
        Connection conn= implDbConnection.getDb();
        String SQL="select * from hw.employee where username=? ";
    try {       
        
        PreparedStatement ps=conn.prepareStatement(SQL);
        ps.setString(1, username);
        
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next())
        {
            Employee emp=new Employee();
            emp.setId(rs.getInt("id"));
            emp.setPassword(rs.getString("password"));
            emp.setUsername(rs.getString("username"));
            emp.setCreatetime(rs.getString("createtime"));
            
            l.add(emp);
            
        }
        
        
       
    } catch (SQLException ex) {
        Logger.getLogger(employeeDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     return l;
	}
	

}
