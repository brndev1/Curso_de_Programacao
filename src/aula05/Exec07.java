package aula05;

import java.util.Locale;
import java.util.Scanner;

public class Exec07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x, y;
		String result;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			result = "Origem";
		} else if (x == 0) {
			result = "Eixo Y";
		} else if (y == 0) {
			result = "Eixo X";
		} else if (x > 0 && y > 0) {
			result = "Q1";
		} else if (x > 0 && y < 0) {
			result = "Q4";
		} else if (x < 0 && y < 0) {
			result = "Q3";
		} else {
			result = "Q2";
		}

		System.out.println(result);

		sc.close();
	}

}
