package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Aula08_Exec03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		System.out.print("Insert student name: ");
		student.name = sc.nextLine();
		System.out.print("Insert first value: ");
		student.n1 = sc.nextDouble();
		System.out.print("Insert second value: ");
		student.n2 = sc.nextDouble();
		System.out.print("Insert third value: ");
		student.n3 = sc.nextDouble();

		System.out.printf("FINAL GRADE = %.2f%n", student.total());
		if (student.missingpoints() == 0) {
			System.out.println("PASS");

		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", student.missingpoints());
		}

		sc.close();

	}

}
