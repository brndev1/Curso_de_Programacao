package aula05;

import java.util.Locale;
import java.util.Scanner;

public class Exec08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double sal, imp = 0;

		sal = sc.nextDouble();

		if (sal <= 2000) {
			imp = 0;
		} else if (sal <= 3000) {
			imp = ((sal - 2000) * 0.08);
		} else if (sal <= 4500) {
			imp = ((sal - 3000) * 0.18) + (1000 * 0.08);
		} else {
			imp = ((sal - 4500) * 0.28) + (1500 * 0.18) + (1000 * 0.08);
		}
		

		if (imp == 0) {
			System.out.println("Isento");
		} else {
			System.out.printf("R$ %.2f%n", imp);
		}

		sc.close();

	}

}
