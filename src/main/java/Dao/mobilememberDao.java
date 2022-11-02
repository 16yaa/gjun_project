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

import Model.mobileOrder;
import Model.mobilemember;

public class mobilememberDao implements implmobilememberDao{

	public static void main(String[] args) {
		List<Object> l=new mobilememberDao().query("asd");
		mobilemember[] mo=l.toArray(new mobilemember[l.size()]);
		System.out.println(mo[0].getTime());
	}

	@Override
	public void addmember(Object o) {
		mobilemember m=(mobilemember) o;
		Connection conn=implDbConnection.getDb();
		LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=null;
        f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
		String SQL="insert into hw.member(name,username,password,address,mobile,registertime) values(?,?,?,?,?,?) ";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,m.getName());
            ps.setString(2,m.getUsername());
            ps.setString(3,m.getPassword());
            ps.setString(4,m.getAddress());
            ps.setString(5,m.getMobile());
            ps.setString(7,now.format(f));
            
            ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public List<Object> query(String username, String password) {
		List<Object> l=new ArrayList();
		Connection conn= implDbConnection.getDb();
        String SQL="SELECT * FROM hw.member where username = '"+ username + "' and password = '" + password + "' ";
        
        try {       
        	Statement statement = conn.createStatement();
        	//PreparedStatement ps=conn.prepareStatement(SQL);
        	//ps.setString(1,username);
        	//ps.setString(2,password);
        
        	//ResultSet rs=ps.executeQuery();
        	ResultSet rs=statement.executeQuery(SQL);
        	if(rs.next())
        	{
        		mobilemember m=new mobilemember();
        		m.setId(rs.getInt("id"));
        		m.setName(rs.getString("name"));
        		m.setUsername(rs.getString("username"));
        		m.setPassword(rs.getString("password"));
        		m.setAddress(rs.getString("address"));
        		m.setMobile(rs.getString("mobile"));
        		m.setTime(rs.getString("registertime"));
            
        		l.add(m);
            
        	}
        
        
       
    } catch (SQLException ex) {
        Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     return l;
}

	@Override
	public List<Object> query(String username) {
        List<Object> l=new ArrayList();
        Connection conn= implDbConnection.getDb();
        String SQL="select * from hw.member where username=? ";
    try {       
        
        PreparedStatement ps=conn.prepareStatement(SQL);
        ps.setString(1, username);
        
        
        ResultSet rs=ps.executeQuery();
        
        if(rs.next())
        {
            mobilemember m=new mobilemember();
            m.setId(rs.getInt("id"));
            m.setName(rs.getString("name"));
            m.setPassword(rs.getString("password"));
            m.setUsername(rs.getString("username"));
            m.setAddress(rs.getString("address"));
            m.setAddress(rs.getString("address"));
            m.setMobile(rs.getString("mobile"));
            m.setTime(rs.getString("registertime"));
            
            l.add(m);
            
        }
        
        
       
    } catch (SQLException ex) {
        Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     return l;
}

	@Override
	public boolean queryUsername(String username) {
		Connection conn= implDbConnection.getDb();
        String SQL="select * from hw.member where username=? ";
        Boolean x=null;
    try {
       
        PreparedStatement ps=conn.prepareStatement(SQL);
        ps.setString(1, username);   
        
        ResultSet rs=ps.executeQuery();
        x=rs.next();
        
    } catch (SQLException ex) {
        Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
    }
        return x;
}

	@Override
	public List<Object> queryId(int id) {
		Connection conn=implDbConnection.getDb();
	      String SQL="select * from member where id=?";
	      List l=new ArrayList();
	        try 
	        {
	            PreparedStatement ps=conn.prepareStatement(SQL);
	            ps.setInt(1, id);
	            ResultSet rs=ps.executeQuery();
	            if(rs.next())
	            {
	            	mobilemember m=new mobilemember();
	            	m.setId(rs.getInt("id"));
	                m.setName(rs.getString("name"));
	                m.setPassword(rs.getString("password"));
	                m.setUsername(rs.getString("username"));
	                m.setAddress(rs.getString("address"));
	                m.setAddress(rs.getString("address"));
	                m.setMobile(rs.getString("mobile"));
	                
	                l.add(m);
	                
	            }
	            
	        } catch (SQLException ex) {
	            Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
	        }
	        return l;
	    }


	@Override
	public void update(Object o) {
		mobilemember m=(mobilemember) o;
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.member set name=?,username=?,password=?,address=?,mobile=?,registertime=? where id=?";
		try {
            PreparedStatement ps=conn.prepareStatement(SQL);
            ps.setString(1, m.getName());
            ps.setString(2, m.getUsername());
            ps.setString(3, m.getPassword());
            ps.setString(4, m.getAddress());
            ps.setString(5, m.getMobile());
            ps.setString(6, m.getTime());
            ps.setInt(7, m.getId());
            
            ps.executeUpdate();
                    
            
        } catch (SQLException ex) {
            Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
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
            	
            	mobilemember m=new mobilemember();
                m.setId(rs.getInt("id"));
                m.setName(rs.getString("name"));
                m.setUsername(rs.getString("username"));
                m.setPassword(rs.getString("password"));
                m.setAddress(rs.getString("address"));
                m.setMobile(rs.getString("mobile"));
                m.setTime(rs.getString("registertime"));
                
                l.add(m);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(mobilememberDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return l;
	}

}
