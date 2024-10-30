package For;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
	      Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número do intervalo: ");
	        int primeiroNumero = scanner.nextInt();

	        System.out.print("Digite o último número do intervalo: ");
	        int ultimoNumero = scanner.nextInt();

	        if (primeiroNumero >= ultimoNumero) {
	            System.out.println("Intervalo inválido!");
	        } else {
	            System.out.println("No Intervalo entre " + primeiroNumero + " e " + ultimoNumero + ":");
	            for (int numero = primeiroNumero; numero <= ultimoNumero; numero++) {
	                if (numero % 3 == 0 && numero % 5 == 0) {
	                    System.out.println(numero + " é múltiplo de 3 e 5");
	                }
	            }
	        }
	    scanner.close();

	}
	
}
