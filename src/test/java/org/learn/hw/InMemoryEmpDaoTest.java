package org.learn.hw;

import junit.framework.TestCase;

import org.junit.Test;

public class InMemoryEmpDaoTest extends TestCase {
	IEmpDao employeeDao = new InMemoryEmpDao();
	
	@Test
	public void testAddEmployee() {
		employeeDao.addEmployee(new Employee("Vijay", 6, 2));
		
		assertTrue("One employee should be available in the repo", employeeDao.getEmployees().size() == 1);
	}
	
}
