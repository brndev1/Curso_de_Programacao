package aula06_1;

import java.util.Scanner;

public class Exec07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int quad, cubo;

		for (int i = 1; i <= N; i++) {
			quad = i * i;
			cubo = i * i * i;
			System.out.print(i + " ");
			System.out.print(quad + " ");
			System.out.print(cubo + " ");
			System.out.println();

		}

		sc.close();

	}

}
