package employee_payment_systerm;

import java.util.ArrayList;
import java.util.List;

public class Part_time_employee {
	private int id;
	private String name;
	private int hoursWorked;
	private int hourlyPay;
	private double salary;
	
	public Part_time_employee(int id, String name, int hoursWorked, int hourlyPay) {
		super();
		this.id = id;
		this.name = name;
		this.hoursWorked = hoursWorked;
		this.hourlyPay = hourlyPay;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Part_time_employee [id=" + id + ", name=" + name +", Salary="+salary+ "]";
	}
	public Part_time_employee() {
		super();
		
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getHourlyPay() {
		return hourlyPay;
	}
	public void setHourlyPay(int hourlyPay) {
		this.hourlyPay = hourlyPay;
	}
	List<Part_time_employee> list = new ArrayList<>();
	public void addEmployee(Part_time_employee pte)
	{
		list.add(pte);
		System.out.println("Employee added successFully ");
	}
	public void calculateSalary()
	{
		 salary = hourlyPay*hoursWorked; 
		System.out.println(salary);
	}
	public void displayEmployees() {
		System.out.println(list);
	}
}
