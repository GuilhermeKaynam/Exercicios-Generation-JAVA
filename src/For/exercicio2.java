package For;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        
		        int contPares = 0; 
		        int contImpares = 0;

		        for (int i = 1; i <= 10; i++) {
		            System.out.print("Digite o " + i + "° número: ");
		            int numero = scanner.nextInt();

		            if (numero % 2 == 0) {
		                contPares++;
		            } else {
		                contImpares++;
		            }
		        }

		        System.out.println("Total de números pares: " + contPares);
		        System.out.println("Total de números ímpares: " + contImpares);

		        scanner.close();
	}

}
