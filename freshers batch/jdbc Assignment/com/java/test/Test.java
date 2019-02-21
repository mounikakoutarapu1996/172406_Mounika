package com.java.test;

import java.sql.SQLException;
import java.util.Calendar;

import com.java.pojo.Employee;
import com.jdbc.dao.EmployeeDao;

public class Test {

	public static void main(String[] args) {
		try 
		{
			//System.out.println(new EmployeeDao().insert(new Employee(1007,"sachin","manager",7369,new java.sql.Date(Calendar.getInstance().getTime().getTime()),5000.00,500.00,20)));
			//System.out.println(new EmployeeDao().read(1007));
			System.out.println(new EmployeeDao().delete(1007)+"row deleted successfully");
			//System.out.println(new EmployeeDao().update(1007,"mounika")+"row update succesfully");
			
		} 
		catch (Exception e) {
	
			e.printStackTrace();
		}
	}

}
