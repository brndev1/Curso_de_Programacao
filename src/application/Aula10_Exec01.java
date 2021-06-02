package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee2;

public class Aula10_Exec01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Employee2> list = new ArrayList<>();

		System.out.print("How many employess will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Emplyoee #%d%n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			System.out.println();

			list.add(new Employee2(id, name, salary));
		}

		System.out.print("Enter the employee id that will have salary increase : ");
		int id = sc.nextInt();
		Employee2 emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("This id does not exist!");

		} else {
			System.out.print("Enter the percentage: ");
			int percentage = sc.nextInt();
			emp.increaseSalary(percentage);
		}

		System.out.println();
		System.out.println("List of Employees:");

		for (Employee2 x : list) {
			System.out.println(x);
		}

		sc.close();
	}

}
