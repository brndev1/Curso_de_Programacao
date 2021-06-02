package aula06_1;

import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int a = 0, b = 0;
		double div = 0;

		for (int i = 0; i < N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			if (a == 0) {
				System.out.println("divisao impossivel");
			} else {
				div = (double) a / b;
				System.out.printf("%.1f%n", div);
			}
			

		}

		sc.close();

	}

}
