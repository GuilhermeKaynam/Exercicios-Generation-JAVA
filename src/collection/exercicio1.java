package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores = new ArrayList<>();

		System.out.println("Digite 5 cores:");
		for (int indice = 0; indice < 5; indice++) {
			System.out.print("Cor " + (indice + 1) + ": ");
			String cor = scanner.nextLine();
			cores.add(cor);
		}

		System.out.println("\nListar todas as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}

		Collections.sort(cores);
		System.out.println("\nOrdenar as cores:");
		for (String cor : cores) {
			System.out.println(cor);
		}
		scanner.close();
	}

}
