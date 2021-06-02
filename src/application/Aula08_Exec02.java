package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Aula08_Exec02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();
		double percentage;

		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();

		System.out.printf("Employee: %s, $ %.2f%n", employee.name, employee.netSalary());
		System.out.println();

		System.out.print("Which percentage to increase salary? ");
		percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println();
		
		System.out.println("Updated data: "+ employee);

	

		sc.close();

	}

}
