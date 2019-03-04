package com.java.Dao.support;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jdbc.connection.ConnectionFactory;
import com.jdbc.support.Shopping;

public class ShoppingDao {

	public int insert(Shopping shop) throws SQLException {
		String query = "insert into OnlineShop values(?,?,?,?)";
		Connection conn = ConnectionFactory.getConnection();
		System.out.println(conn);
		PreparedStatement pstatement = conn.prepareStatement(query);
		pstatement.setString(1, shop.getName());
		pstatement.setString(2, shop.getEmail());
		pstatement.setString(3, shop.getPassword());
		pstatement.setLong(4, shop.getphone());
		int output = pstatement.executeUpdate();
		return output;
	}

	public boolean login(String username, String password) throws SQLException {
		String query = "select name,password from OnlineShop";
		Connection conn = ConnectionFactory.getConnection();
		Statement stmt = conn.createStatement();
		ResultSet result = stmt.executeQuery(query);
		while (result.next()) {
			//System.out.println("Hello from while");
			String userName = result.getString("username");
			String pass = result.getString("password");
			//System.out.println(userName);
			//System.out.println(pass);
			if (userName.equals(username) && pass.equals(password)) {
				System.out.println("Hello from if");
				return true;
			} else {
				System.out.println("Hello from else");
				return false;
			}
		}
		return false;
	}

	/*public static void main(String[] args) {
		ShoppingDao dao = new ShoppingDao();
		try {
			System.out.println(dao.login("harshitha", "1234"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/

}
