package com.examples;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	
	// fetch all the employees
	public List<Employee> findAll() {
		try { 
			List<Employee> list = new ArrayList<Employee>();
			Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from employee");
			ResultSet result = statement.executeQuery();
			while(result.next()) {
				Employee employee = new Employee(result.getInt("id"), result.getString("name"), result.getDouble("salary"));
				list.add(employee);
			}
			result.close();
			statement.close();
			connection.close();
			return list;
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	// store
	public int save(Employee employee) {
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("insert into employee(name, salary) values(?,?)");
			// set values to the ?, Note:- ? position and column position is not always same
			statement.setString(1, employee.getName()); // 1 means question mark position it's not 1st column
			statement.setDouble(2, employee.getSalary()); // 2 means question mark position it's not 2nd column
			int count = statement.executeUpdate(); // notice executeUpdate doesn't take query
			statement.close();
			connection.close();
			return count;
		} catch(Exception e) {
			e.printStackTrace();
			return -1;
		}
	}
	// fetch the Employee based on id
	public Employee findById(int id) {
		try {
			Connection connection = DBUtil.getConnection();
			PreparedStatement statement = connection.prepareStatement("select * from employee where id = ?");
			// set values to the ?, Note:- ? position and column position is not always same
			statement.setInt(1, id); // 1 means question mark position it's not 1st column
			ResultSet result = statement.executeQuery();
			if(result.next()) {
				int id2 = result.getInt("id");
				String name = result.getString("name");
				double salary = result.getDouble("salary");
				Employee employee = new Employee(id2, name, salary);
				result.close();
				statement.close();
				connection.close();
				return employee;
			} else {
				return null;
			}
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
