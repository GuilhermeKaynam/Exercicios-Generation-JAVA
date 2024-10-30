package While;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		  Scanner scanner = new Scanner(System.in);
	        
	        int totalBackend = 0;
	        int totalMulheresFrontend = 0;
	        int totalHomensMobileMaior40 = 0;
	        int totalNaoBinariosFullStackMenor30 = 0;
	        int totalPessoas = 0;
	        int somaIdades = 0;

	        while (true) {
	            System.out.print("Idade: ");
	            int idade = scanner.nextInt();

	            System.out.print("Identidade de Gênero (1 – Mulher Cis, 2 – Homem Cis, 3 – Não Binário, 4 – Mulher Trans, 5 – Homem Trans, 6 – Outros): ");
	            int genero = scanner.nextInt();

	            System.out.print("Pessoa Desenvolvedora (1 – Backend, 2 – Frontend, 3 – Mobile, 4 – FullStack): ");
	            int desenvolvedor = scanner.nextInt();

	            totalPessoas++;
	            somaIdades += idade;

	            if (desenvolvedor == 1) {
	                totalBackend++;
	            }
	            if ((genero == 1 || genero == 4) && desenvolvedor == 2) {
	                totalMulheresFrontend++;
	            }
	            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
	                totalHomensMobileMaior40++;
	            }
	            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
	                totalNaoBinariosFullStackMenor30++;
	            }

	            System.out.print("Deseja continuar (S/N): ");
	            String continuar = scanner.next().toUpperCase();

	            if (continuar.equals("N")) {
	                break;
	            }
	        }
	        
	        double mediaIdade = totalPessoas > 0 ? (double) somaIdades / totalPessoas : 0;
	        
	        System.out.println("Total de pessoas desenvolvedoras Backend: " + totalBackend);
	        System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalMulheresFrontend);
	        System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalHomensMobileMaior40);
	        System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + totalNaoBinariosFullStackMenor30);
	        System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
	        System.out.printf("A média de idade das pessoas que responderam à pesquisa:%.2f%n anos", mediaIdade);

	        scanner.close();

        scanner.close();
		
	}

}
