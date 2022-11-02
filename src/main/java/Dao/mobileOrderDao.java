package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import Model.Shoppingcart;
import Model.mobileOrder;


public class mobileOrderDao implements implmobileOrderDao{

	public static void main(String[] args) {
		
		//mobileOrder m=new mobileOrder("asd",1,1,1,1,1);
		
		//new mobileOrderDao().shoppingcart(m);
		new mobileOrderDao().update1();
		new mobileOrderDao().update2();
		new mobileOrderDao().update3();
		new mobileOrderDao().update4();
		new mobileOrderDao().update5();
		List<Object> l=new mobileOrderDao().queryShoppingcart();
		Shoppingcart[] sc=l.toArray(new Shoppingcart[l.size()]);
		for(int i=0;i<sc.length;i++)
		{
			System.out.println(
					sc[i].getSciphome13()+""+
					sc[i].getScairpads()+""+
					sc[i].getScphonecable()+""+
					sc[i].getScphonecase()+""+
					sc[i].getScprotector());
		}
		
	}

	@Override
	public void add(Object o) {
		mobileOrder m=(mobileOrder) o;
		Connection conn=implDbConnection.getDb();
		LocalDateTime now=LocalDateTime.now();
        DateTimeFormatter f=null;
        f=DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG);
        m.setTime(now.format(f));
		String SQL="insert into hw.mobileorder(name,iphome13,airpads,phonecable,phonecase,protector,sum,time) values(?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,m.getName());
			ps.setInt(2,m.getIphome13());
			ps.setInt(3,m.getAirpads());
			ps.setInt(4,m.getPhonecable());
			ps.setInt(5,m.getPhonecase());
			ps.setInt(6,m.getProtector());
			ps.setInt(7,m.getSum());
			ps.setString(8,now.format(f));
			
			
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public List<Object> queryAll() {
		List<Object> l=new ArrayList();
		Connection conn=implDbConnection.getDb();
		String SQL="select*from hw.mobileorder";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				mobileOrder m=new mobileOrder();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setIphome13(rs.getInt("iphome13"));
				m.setAirpads(rs.getInt("airpads"));
				m.setPhonecable(rs.getInt("phonecable"));
				m.setPhonecase(rs.getInt("phonecase"));
				m.setProtector(rs.getInt("protector"));
				m.setSum(rs.getInt("sum"));
				m.setTime(rs.getString("time"));
				l.add(m);
			}
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		return l;
	}

	@Override
	public List<Object> queryname(String name) {
		Connection conn=implDbConnection.getDb();
		String SQL="select*from hw.mobileorder where name=?";
		List<Object> l=new ArrayList();
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				mobileOrder m=new mobileOrder();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setIphome13(rs.getInt("iphome13"));
				m.setAirpads(rs.getInt("airpads"));
				m.setPhonecable(rs.getInt("phonecable"));
				m.setPhonecase(rs.getInt("phonecase"));
				m.setProtector(rs.getInt("protector"));
				m.setSum(rs.getInt("sum"));
				m.setTime(rs.getString("time"));
				m.setStatus(rs.getString("status"));
				
				l.add(m);
			}
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
		return l;
	}
	
	@Override
	public void update(Object o) {
		mobileOrder m=(mobileOrder) o;
		List<Object> l=new ArrayList();
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.mobileorder set name=?,iphome13=?,airpads=?,phonecable=?,phonecase=?,protector=?,sum=?,time=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setString(1,m.getName());
			ps.setInt(2,m.getIphome13());
			ps.setInt(3,m.getAirpads());
			ps.setInt(4,m.getPhonecable());
			ps.setInt(5,m.getPhonecase());
			ps.setInt(6,m.getProtector());
			ps.setInt(7,m.getSum());
			ps.setString(8,m.getTime());
			ps.setInt(9,m.getId());
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public void remove(int id) {
		
		Connection conn=implDbConnection.getDb();
		String SQL="delete from hw.mobileorder where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,id);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
	}

	@Override
	public mobileOrder queryId(int id) {
		Connection conn=implDbConnection.getDb();
		String SQL="select*from hw.mobileorder where id=?";
		mobileOrder m=null;
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1, id);
			ResultSet rs=ps.executeQuery();
			
			if(rs.next())
			{
				m=new mobileOrder();
				m.setId(rs.getInt("id"));
				m.setName(rs.getString("name"));
				m.setIphome13(rs.getInt("iphome13"));
				m.setAirpads(rs.getInt("airpads"));
				m.setPhonecable(rs.getInt("phonecable"));
				m.setPhonecase(rs.getInt("phonecase"));
				m.setProtector(rs.getInt("protector"));
				m.setSum(rs.getInt("sum"));
				m.setStatus(rs.getString("status"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return m;
	
	}

	@Override
	public void shoppingcart(Object o) {
		mobileOrder m=(mobileOrder) o;
		List<Object> l=new ArrayList();
		Connection conn=implDbConnection.getDb();
		String SQL1="SELECT * FROM hw.shoppingcart";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL1);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
			m.setScphone(rs.getInt("phone"));
			m.setScairpads(rs.getInt("airpads"));
			m.setScphonecable(rs.getInt("phonecable"));
			m.setScphonecase(rs.getInt("phonecase"));
			m.setScprotector(rs.getInt("protector"));
			l.add(m);
			}
		}catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
		String SQL="update hw.shoppingcart set phone=?,airpads=?,phonecable=?,phonecase=?,protector=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,m.getIphome13()+m.getScphone());
			ps.setInt(2,m.getAirpads()+m.getScairpads());
			ps.setInt(3,m.getPhonecable()+m.getScphonecable());
			ps.setInt(4,m.getPhonecase()+m.getScphonecase());
			ps.setInt(5,m.getProtector()+m.getScprotector());
			ps.setInt(6,1);
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public List<Object> queryShoppingcart() {
		List<Object> l=new ArrayList();
		Connection conn=implDbConnection.getDb();
		String SQL="select*from hw.shoppingcart";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				Shoppingcart sc=new Shoppingcart();
				sc.setSciphome13(rs.getInt("phone"));
				sc.setScairpads(rs.getInt("airpads"));
				sc.setScphonecable(rs.getInt("phonecable"));
				sc.setScphonecase(rs.getInt("phonecase"));
				sc.setScprotector(rs.getInt("protector"));
				l.add(sc);
			}
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		return l;
	}

	@Override
	public void update1() {
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.shoppingcart set phone=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,0);
			ps.setInt(2,1);
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public void update2() {
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.shoppingcart set airpads=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,0);
			ps.setInt(2,1);
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public void update3() {
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.shoppingcart set phonecable=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,0);
			ps.setInt(2,1);
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public void update4() {
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.shoppingcart set phonecase=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,0);
			ps.setInt(2,1);
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public void update5() {
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.shoppingcart set protector=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,0);
			ps.setInt(2,1);
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
		
	}

	@Override
	public void updateStatus(int id) {
		Connection conn=implDbConnection.getDb();
		String SQL="update hw.shoppingcart set status=? where id=?";
		try {
			PreparedStatement ps=conn.prepareStatement(SQL);
			ps.setInt(1,0);
			ps.setString(2,"已出貨");
			ps.executeUpdate();
		} catch (SQLException e) {
			Logger.getLogger(mobileOrderDao.class.getName()).log(Level.SEVERE, null, e);
		}
	}



}
