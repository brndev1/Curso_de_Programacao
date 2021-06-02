package aula06_1;

import java.util.Locale;
import java.util.Scanner;

public class Exec03 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		double a = 0, b = 0, c = 0, media;

		for (int i = 0; i < N; i++) {
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();

			media = (a * 2 + b * 3 + c * 5) / 10;
			System.out.printf("%.1f%n", media);

		}

		sc.close();

	}

}
