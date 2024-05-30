package employee_payment_systerm;

import java.util.ArrayList;
import java.util.List;

public class Full_time_employee {
	private int id;
	private String name;
	private int holidays;
	private double salary;
	@Override
	public String toString() {
		return "Full_time_employee [id=" + id + ", name=" + name + ", holidays=" + holidays + ", salary=" + salary
				+ "]";
	}
	public Full_time_employee(int id, String name, int holidays, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.holidays = holidays;
		this.salary = salary;
	}
	List<Full_time_employee> list = new ArrayList<>();

	public void addEmployee(Full_time_employee fte) {
		list.add(fte);
	}
	public void displayEmployee()
	{
		System.out.println(list);
	}
	public void calculateSalary()
	{
		salary=salary-((salary/30)*holidays);
		System.out.println(salary);
	}
}
