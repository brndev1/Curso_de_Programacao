package aula06;

import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tipo, alc = 0, gas = 0, die = 0;

		tipo = sc.nextInt();

		while (tipo != 4) {

			switch (tipo) {

			case 1:
				alc += 1;
				break;

			case 2:
				gas += 1;
				break;

			case 3:
				die += 1;
			}

			tipo = sc.nextInt();

		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alc);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " + die);

		sc.close();
	}

}
