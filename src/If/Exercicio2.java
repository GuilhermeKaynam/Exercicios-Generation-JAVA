package If;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		   Scanner positivo = new Scanner(System.in);
	        int numero = positivo.nextInt();
	        System.out.print("Digite um número: ");
	        
	        if (numero % 2 == 0) {
	            System.out.print("O Número " + numero + " é par e ");
	        } else {
	            System.out.print("O Número " + numero + " é ímpar e ");
	        }
	        if (numero >= 0) {
	            System.out.println("positivo!");
	        } else {
	            System.out.println("negativo!");
	        }

	        positivo.close();

	}

}
