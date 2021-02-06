package model;

import model.Employee;

public class EmployeeHourlyPayroll {
	final double OVT_RATE = 1.5;
	
	public double calculateRegPay(Employee employee) {
		double weeklyRegPay = 0;
		weeklyRegPay = employee.getRegHours() * employee.getHourlyRate();
		return weeklyRegPay;
	}
	
	public double calculateOvtPay(Employee employee) {
		double weeklyOvtPay = 0;
		weeklyOvtPay = employee.getOvtHours() * OVT_RATE * employee.getHourlyRate();
		return weeklyOvtPay;
	}
	
	public boolean isTaxExempt(Employee employee) {
		boolean exempt = false;
		
		if (employee.getStudent() == "Y") {
			exempt = true;
		}
		
		return exempt;
	}
}
