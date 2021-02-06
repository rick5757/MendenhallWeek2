package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.Employee;
import model.EmployeeHourlyPayroll;

public class TestWeeklyPay {

	EmployeeHourlyPayroll empPR = new EmployeeHourlyPayroll();
	Employee employee = new Employee("Rick");
	
	@Before
	public void setUp() throws Exception {
	}

	@Test
		public void calculateRegPay() {
			employee.setHours(45);
			employee.setHourlyRate(10.0);
			System.out.println("Inside calculateRegPay()");
			double weeklyRegPay = empPR.calculateRegPay(employee);
			assertEquals(400, weeklyRegPay, 0.0);
		}
	
	@Test
	public void calculateOvtPay() {
		employee.setHours(45);
		employee.setHourlyRate(10.0);
		System.out.println("Inside calculateOvtPay()");
		double weeklyOvtPay = empPR.calculateOvtPay(employee);
		assertEquals(75, weeklyOvtPay, 0.0);
	}
	
}
