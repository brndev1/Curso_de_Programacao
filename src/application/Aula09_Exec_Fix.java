package application;

import java.util.Locale;
import java.util.Scanner;

import entities.BankAccount;

public class Aula09_Exec_Fix {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		BankAccount bankAccount;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		String choice = sc.nextLine();
		if (choice.equals("y")) {
			System.out.print("Enter initial deposit value: ");
			double deposity = sc.nextDouble();
			bankAccount = new BankAccount(number, name, deposity);
		} else {
			bankAccount = new BankAccount(number, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(bankAccount);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		bankAccount.deposity(value);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);

		System.out.println();
		System.out.print("Enter a whitdraw value: ");
		value = sc.nextDouble();
		bankAccount.whitdraw(value);
		System.out.println("Updated account data: ");
		System.out.println(bankAccount);

		sc.close();

	}

}
