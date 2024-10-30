package While;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		  int contMenor21 = 0;
	        int contMaior50 = 0;
	        int idade;

	        while (true) {
	            System.out.print("Digite uma idade: ");
	            idade = scanner.nextInt();

	            if (idade < 0) {
	                break;
	            }

	            if (idade < 21) {
	                contMenor21++;
	            }
	            if (idade > 50) {
	                contMaior50++;
	            }
	        }

	        System.out.println("Total de pessoas menores de 21 anos: " + contMenor21);
	        System.out.println("Total de pessoas maiores de 50 anos: " + contMaior50);
	    scanner.close();
		
	}

}
