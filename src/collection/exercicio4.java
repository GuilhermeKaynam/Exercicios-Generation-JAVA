package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercicio4 {

	public static void main(String[] args) {

		Set<Integer> integerSet = new HashSet<>();
		integerSet.add(2);
		integerSet.add(5);
		integerSet.add(1);
		integerSet.add(3);
		integerSet.add(4);
		integerSet.add(9);
		integerSet.add(7);
		integerSet.add(8);
		integerSet.add(10);
		integerSet.add(6);

		System.out.println("Elementos do Set: " + integerSet);

		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número que você deseja encontrar: ");
		int numberToFind = scanner.nextInt();

		if (integerSet.contains(numberToFind)) {
			System.out.println("O número " + numberToFind + " foi encontrado!");
		} else {
			System.out.println("O número " + numberToFind + " não foi encontrado!");
		}

		scanner.close();

	}

}
