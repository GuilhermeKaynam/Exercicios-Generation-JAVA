package vetores;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int[] vetor = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };

		System.out.println("Vetor:");
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.print(vetor[indice] + " ");
		}
		System.out.println(); // para quebrar a linha

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = scanner.nextInt();

		boolean encontrado = false;

		for (int indice = 0; indice < vetor.length; indice++) {

			if (vetor[indice] == numeroProcurado) {
				System.out.println("O número " + numeroProcurado + " está localizado na posição: " + indice);
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("O número " + numeroProcurado + " não foi encontrado!");
		}

		scanner.close();
	}
}
