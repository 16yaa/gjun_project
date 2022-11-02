package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class implDbConnection {
	 public static void main(String[] args) {
		 System.out.println(implDbConnection.getDb());
	    }
	 public static Connection getDb()
	 {
		 String url="jdbc:mysql://localhost:3306/hw?useUnicode=true&characterEncoding=UTF-8";
	        String user="root";
	        String password="1234";
	        Connection conn=null;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            conn=DriverManager.getConnection(url, user, password);           
	        } catch (ClassNotFoundException ex) {
	            Logger.getLogger(implmobileOrderDao.class.getName()).log(Level.SEVERE, null, ex);
	        } catch (SQLException ex) {
	            Logger.getLogger(implmobileOrderDao.class.getName()).log(Level.SEVERE, null, ex);
	        }     
	          return conn;
	 }
}
