package aula06;

import java.util.Scanner;

public class Exec02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, y;
		String result;

		x = sc.nextDouble();
		y = sc.nextDouble();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				result = "primeiro";
			} else if (x > 0 && y < 0) {
				result = "quarto";
			} else if (x < 0 && y < 0) {
				result = "terceiro";
			} else {
				result = "segundo";
			}

			System.out.println(result);
			x = sc.nextDouble();
			y = sc.nextDouble();

		}

		sc.close();

	}

}
