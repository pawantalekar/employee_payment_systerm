package employee_payment_systerm;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Part_time_employee pte = new Part_time_employee(1, "Aboli", 5, 500);
		pte.addEmployee(pte);
		pte.calculateSalary();
		pte.displayEmployees();
		System.out.println("-----------------------------------------");
		System.out.println("Full Time Employeee Details ");
		System.out.println("-----------------------------------------");
		
		
		Full_time_employee fte = new Full_time_employee(1, "john", 5, 60000);
		fte.calculateSalary();
		fte.addEmployee(fte);
		fte.displayEmployee();
		
		System.out.println("----------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice : 1: Part Time Employee & 2 : Full Time Employee : ");
		int choice =sc.nextInt();
		while(true) {
			switch(choice) {
			case 1:
				System.out.println("Enter your choice : 1 : Add Employee 2: display Employee List");
				System.out.println("Add employee : ");
			}
		}

	}

}
