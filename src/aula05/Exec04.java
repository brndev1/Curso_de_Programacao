package aula05;

import java.util.Scanner;

public class Exec04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int hora1, hora2;
		hora1 = sc.nextInt();
		hora2 = sc.nextInt();

		if (hora1 > hora2) {
			System.out.printf("O JOGO DUROU %d HORA(S)%n", (24 - hora1 + hora2));
		} else if (hora1 < hora2) {
			System.out.printf("O JOGO DUROU %d HORA(S)%n", (hora2 - hora1));
		} else {
			System.out.println("O JOGO DUROU 24 HORA(S)");
		}

		sc.close();

	}

}
