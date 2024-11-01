package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Set<Integer> unicoNumero = new TreeSet<>();
		Set<Integer> repetirNumero = new TreeSet<>();
		Set<Integer> tempSet = new HashSet<>();

		System.out.println("Digite 10 valores inteiros:");

		for (int indice = 0; indice < 10; indice++) {
			System.out.print("Digite um número: ");
			int numero = scanner.nextInt();

			if (!tempSet.add(numero)) {
				repetirNumero.add(numero);
			} else {
				unicoNumero.add(numero);
			}
		}

		System.out.println("\nListar dados do Set (números únicos):");
		Iterator<Integer> uniqueIterator = unicoNumero.iterator();
		while (uniqueIterator.hasNext()) {
			System.out.println(uniqueIterator.next());
		}

		System.out.println("\nListar dados do Set (números repetidos):");
		Iterator<Integer> repeatedIterator = repetirNumero.iterator();
		while (repeatedIterator.hasNext()) {
			System.out.println(repeatedIterator.next());
		}

		scanner.close();
	}

}
