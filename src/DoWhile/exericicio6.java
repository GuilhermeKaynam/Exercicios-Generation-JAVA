package DoWhile;

import java.util.Scanner;

public class exericicio6 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
	        int numero;
	        int somaMultiplosDeTres = 0;
	        int contadorMultiplosDeTres = 0;

	        do {
	            System.out.print("Digite um número: ");
	            numero = scanner.nextInt();

	            if (numero % 3 == 0 && numero != 0) {
	                somaMultiplosDeTres += numero;
	                contadorMultiplosDeTres++;
	            }
	        } while (numero != 0);

	        if (contadorMultiplosDeTres > 0) {
	            double media = (double) somaMultiplosDeTres / contadorMultiplosDeTres;
	            System.out.println("A média de todos os números múltiplos de 3 é: " + media);
	        } else {
	            System.out.println("Nenhum múltiplo de 3 foi digitado.");

	}
   }
}
