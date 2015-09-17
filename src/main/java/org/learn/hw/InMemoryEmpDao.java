package org.learn.hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InMemoryEmpDao implements IEmpDao {
	
	Map<Integer, Employee> employeesDB  = new HashMap<Integer, Employee>();

	public void addEmployee(Employee e) {
		employeesDB.put(e.getEmpId(), e);		
	}

	public Employee getById(int empId) {
		return employeesDB.get(empId);
	}

	public List<Employee> getEmployees() {
		return new ArrayList<Employee>(employeesDB.values());
	}

}
