package model;

public class Employee {

	private String name;
	private double hourlyRate;
	private double hours;
	private String student;
	
	
	
	public Employee() {
	}
	public Employee(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHourlyRate() {
		return hourlyRate;
	}
	public void setHourlyRate(double hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	public double getHours() {
		return hours;
	}
	public double getRegHours() {
		double regHours = hours;
		if (regHours > 40.0) {regHours = 40;}
		return regHours;
	}
	public double getOvtHours() {
		double ovtHours = 0;
		if (hours > 40.0) {ovtHours = hours - 40;}
		return ovtHours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}
	public String getStudent() {
		return student;
	}
	public void setStudent(String student) {
		this.student = student;
	}
	
	
}
