package If;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner Calculo = new Scanner(System.in);

		  System.out.print("Digite o número A: ");
	        int A = Calculo.nextInt();

	        System.out.print("Digite o número B: ");
	        int B = Calculo.nextInt();

	        System.out.print("Digite o número C: ");
	        int C = Calculo.nextInt();

	        int soma = A + B;

	        System.out.println(A + " + " + B + " = " + soma);

	        if (soma > C) {
	            System.out.println("A Soma de A + B é Maior do que C");
	        } else if (soma < C) {
	            System.out.println("A Soma de A + B é Menor do que C");
	        } else {
	            System.out.println("A Soma de A + B é Igual a C");
	        }

	        Calculo.close();
	        }

	}
