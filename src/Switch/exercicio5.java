package Switch;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
	     Scanner lanche = new Scanner(System.in);
	     
	     System.out.println("codigo do produto #### produto  ########## preço unitario");

	        System.out.print("Digite o código do produto (1 a 6): ");
	        int codigo = lanche.nextInt();

	        System.out.print("Digite a quantidade comprada: ");
	        int quantidade = lanche.nextInt();

	        String produto = "";
	        double preco = 0;

	        if (codigo == 1) {
	            produto = "Cachorro Quente";
	            preco = 10.00;
	        } else if (codigo == 2) {
	            produto = "X-Salada";
	            preco = 15.00;
	        } else if (codigo == 3) {
	            produto = "X-Bacon";
	            preco = 18.00;
	        } else if (codigo == 4) {
	            produto = "Bauru";
	            preco = 12.00;
	        } else if (codigo == 5) {
	            produto = "Refrigerante";
	            preco = 8.00;
	        } else if (codigo == 6) {
	            produto = "Suco de Laranja";
	            preco = 13.00;
	        } else {
	            System.out.println("Código do produto inválido!");
	            lanche.close();
	            return;
	        }

	        double valorTotal = quantidade * preco;
        
	        System.out.println("Produto: " + produto);
	        System.out.printf("Valor total: R$ %.2f\n", valorTotal);

	        lanche.close();
	
		
	}

}

