package variaveisOperadores;

import java.util.Scanner;

public class exericio4 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Número 1");
		float numero1 = scanner.nextFloat();

		System.out.println("Número 2");
		float numero2 = scanner.nextFloat();

		System.out.println("Número 3");
		float numero3 = scanner.nextFloat();

		System.out.println("Número 4");
		float numero4 = scanner.nextFloat();

		float diferenca = (numero1 * numero2) - (numero3 * numero4);

		System.out.printf("Diferença: %.1f\n", diferenca);

	}

}
