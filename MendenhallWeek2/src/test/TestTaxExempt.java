package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Employee;
import model.EmployeeHourlyPayroll;

public class TestTaxExempt {
	EmployeeHourlyPayroll empPR = new EmployeeHourlyPayroll();
	Employee employee = new Employee("Rick");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testTaxExempt() {
		employee.setStudent("Y");
		System.out.println("Inside testTaxExempt()");
		assertTrue(empPR.isTaxExempt(employee));
	}
	
	@Test
	public void testNotTaxExempt() {
		employee.setStudent("N");
		System.out.println("Inside testNotTaxExempt()");
		assertFalse(empPR.isTaxExempt(employee));
	}

}
