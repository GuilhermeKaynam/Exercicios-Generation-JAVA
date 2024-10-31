package vetores;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		
		int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números inteiros:");
        for (int indice = 0; indice < vetor.length; indice++) {
            vetor[indice] = scanner.nextInt();
        }

        System.out.println("Elementos nos índices ímpares:");
        for (int indice = 1; indice < vetor.length; indice += 2) {
            System.out.print(vetor[indice] + " ");
        }
        System.out.println();
        
        System.out.println("Elementos pares:");
        for (int indice = 0; indice < vetor.length; indice++) {
            if (vetor[indice] % 2 == 0) {
                System.out.print(vetor[indice] + " ");
            }
        }
        System.out.println();
        int soma = 0;
        for (int numero : vetor) {
            soma += numero;
        }
        System.out.println("Soma: " + soma);

        double media = soma / 10.0; // Usando 10.0 para ter um resultado em ponto flutuante
        System.out.printf("Média: %.2f%n", media);
        scanner.close();
		
		
	}

}
