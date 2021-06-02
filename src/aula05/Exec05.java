package aula05;

import java.util.Locale;
import java.util.Scanner;

public class Exec05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int cod, quant;
		double preco;
		
		cod = sc.nextInt();
		quant = sc.nextInt();

		if (cod == 1) {
			preco = 4 * quant;
		} else if (cod == 2) {
			preco = 4.5 * quant;
		} else if (cod == 3) {
			preco = 5 * quant;
		} else if (cod == 4) {
			preco = 2 * quant;
		} else {
			preco = 1.5 * quant;
		}

		System.out.printf("Total: R$ %.2f%n", preco);

		sc.close();
	}

}
