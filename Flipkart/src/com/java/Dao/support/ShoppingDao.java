package com.java.Dao.support;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.connection.ConnectionFactory;
import com.jdbc.support.Shopping;

public class ShoppingDao {

	public int insert(Shopping shop)throws SQLException{
		System.out.println(shop);
		String query="insert into OnlineShop values(?,?,?,?)";
		Connection conn=ConnectionFactory.getConnection();
		System.out.println(conn);
		PreparedStatement pstatement=conn.prepareStatement(query);
	
		pstatement .setString(1, shop.getName());
		pstatement.setString(2,shop.getEmail());
		pstatement.setInt(3,shop.getPassword());
		pstatement.setLong(4,shop.getphone());
		int output=pstatement.executeUpdate();
		return output;
		
	}
	public boolean login(String username,String password) throws SQLException {
		
	String query="select username,password from OnlineShop";
	Connection conn=ConnectionFactory.getConnection();
	Statement stmt=conn.createStatement();
	ResultSet result=stmt.executeQuery(query);
	while(result.next()) {
		String userName=result.getString("username");
		String pass=result.getString("password");
		if(userName.equals("username")&&pass.equals("password")) {
		return true;	
		}
		else {
			return false;
		}
		}
	return false;
	}
	
	
	
	
}
