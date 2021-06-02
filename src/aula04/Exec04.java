package aula04;

import java.util.Locale;
import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int num, hora;
		double valor, salario;
		num = sc.nextInt();
		hora = sc.nextInt();
		valor = sc.nextDouble();

		salario = hora * valor;

		System.out.println("NUMBER = " + num);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		sc.close();

	}

}
