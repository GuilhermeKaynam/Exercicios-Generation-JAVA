package variaveisOperadores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		float nota1, nota2, nota3, nota4, media;

		System.out.println("nota1: ");
		nota1 = scanner.nextFloat();

		System.out.println("nota2: ");
		nota2 = scanner.nextFloat();

		System.out.println("nota3: ");
		nota3 = scanner.nextFloat();

		System.out.println("nota4: ");
		nota4 = scanner.nextFloat();

		media = (nota1 + nota2 + nota3 + nota4) / 4;

		System.out.printf("Média final: %.1f%n", media);
	}

}
