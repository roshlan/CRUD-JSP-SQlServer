package com.crudjsp.Dao;

import java.sql.*; 
import java.util.*;

import com.crudjsp.user.User;

public class UserDao {
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		
			Class.forName("com.mysql.jdbc.Driver");
			Connection  con = DriverManager.getConnection("jdbc:mysql://localhost:3306/DataBase-name", "Username", "password");
		
		return con;
	}

	public static int save(User u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("insert into user123(id,name,password,email,city) values(?,?,?,?,?)");
			ps.setString(1,u.getId());
			ps.setString(2,u.getName());
			ps.setString(3,u.getPassword());
			ps.setString(4,u.getEmail());
			ps.setString(5,u.getCity());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int update(User u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con
					.prepareStatement("update user123 set name=?,password=?,email=?,city=? where id=?");
			
			ps.setString(1,u.getName());
			ps.setString(2,u.getPassword());
			ps.setString(3,u.getEmail());
			ps.setString(4,u.getCity());
			ps.setString(5,u.getId());
			status = ps.executeUpdate();
		 
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static int delete(User u) {
		int status = 0;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("delete from user123 where id=?");
			ps.setString(1, u.getId());
			status = ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		return status;
	}

	public static List<User> getAllRecords(){
    	  List<User> List1=new ArrayList<User>();
    	  
    	  try {
    		  Connection con=getConnection();
    	
    			  PreparedStatement ps=con.prepareStatement("select * from user123");
    			  ResultSet rs=ps.executeQuery();
    			  while(rs.next()) {
    				 User u=new User(); 
    				 u.setId(rs.getString("id"));
    				 u.setName(rs.getString("name"));
    				 u.setPassword(rs.getString("password"));
    				 u.setEmail(rs.getString("email"));
    				 u.setCity(rs.getString("city"));
    				 List1.add(u);
    			  }
    			  System.out.println(List1.size());
    	  }catch(Exception e) 
    			  {
    				  System.out.println(e);
    				  
    			  }
    	  return List1;
	}

	public static User getRecordById(int id) {
		User u = null;
		try {
			Connection con = getConnection();
			PreparedStatement ps = con.prepareStatement("select * from user123 where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				u = new User();
				u.setId(rs.getString("id"));
				u.setName(rs.getString("name"));
				u.setPassword(rs.getString("Password"));
				u.setEmail(rs.getString("email"));
				u.setCity(rs.getString("city"));
			}

		} catch (Exception e) {
			System.out.println(e);
		}
		return u;
	}
}