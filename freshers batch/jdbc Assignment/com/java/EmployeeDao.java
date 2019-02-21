package com.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;

import com.java.pojo.Employee;

import jdbccom.jdbc.ConnectionFactory;

public class EmployeeDao {
	public int insert(Employee emp) throws SQLException 
	{
		String query="insert into emp values(?,?,?,?,?,?,?,?)";
    Connection		 conn =ConnectionFactory.getconnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, emp.getEmpNo());
		pStatement.setString(2, emp.getEname());
		pStatement.setString(3, emp.getJob());
		pStatement.setInt(4, emp.getMgr());
		pStatement.setDate(5, emp.getHiredate());
		pStatement.setDouble(6, emp.getSal());
		pStatement.setDouble(7, emp.getComm());
		pStatement.setInt(8, emp.getDeptNo());
		int output=pStatement.executeUpdate();
		return output;
		
	}
	
		public int update(int empNo,String empName)throws Exception 
		{
		  String query1="update emp SET ENAME=? where empNo=?";
		Connection conn=ConnectionFactory.getconnection();
	      PreparedStatement ps=conn.prepareStatement(query1);
			  ps.setString(1,empName);
			  ps.setInt(2,empNo);
			  int x=ps.executeUpdate();
			  return x;
			  }
	public int delete(int empNo)throws Exception {
		  Connection conn=ConnectionFactory.getconnection();
		  String sql="delete from emp  where empno=?";
		  PreparedStatement ps=conn.prepareStatement(sql);
		  ps.setInt(1,empNo);
		  int x=ps.executeUpdate();
		  return x;
		  }
	public Employee read(int empNo) throws SQLException {
		String query="select * from emp where empNo= ?";
		Employee emp=null;
		Connection conn = ConnectionFactory.getconnection();
		PreparedStatement pStatement= conn.prepareStatement(query);
		pStatement.setInt(1, empNo);
		ResultSet resultSet=pStatement.executeQuery();
		while(resultSet.next()) {
			emp=new Employee();
			emp.setEname(resultSet.getString("ename"));
		}
		return emp;

	}
	
}
