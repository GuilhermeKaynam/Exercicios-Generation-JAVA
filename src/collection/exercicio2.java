package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);

		int[] valoresIniciais = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		for (int valor : valoresIniciais) {
			numeros.add(valor);
		}

		System.out.println("List");
		for (Integer numero : numeros) {
			System.out.print(numero + " ");
		}
		System.out.println("\n");

		System.out.print("Digite o número que você deseja encontrar: ");
		int numeroProcurado = scanner.nextInt();

		int posicao = numeros.indexOf(numeroProcurado);

		if (posicao != -1) {
			System.out.println("\nO número " + numeroProcurado + " está localizado na posição: " + posicao + "\n");
		} else {
			System.out.println("\nO número " + numeroProcurado + " não foi encontrado!\n");
		}

		scanner.close();

	}

}
