package org.learn.hw;

import java.util.List;

public interface IEmpDao {
	public void addEmployee(Employee e);
	public Employee getById(int empId);
	public List<Employee> getEmployees();
}	
