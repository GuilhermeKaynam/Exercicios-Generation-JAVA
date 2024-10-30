package Switch;

import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		  Scanner trabalho = new Scanner(System.in);

	        System.out.print("Nome do colaborador: ");
	        String nomeColaborador = trabalho.nextLine();

	        System.out.print("Código do cargo (1 a 6): ");
	        int codigoCargo = trabalho.nextInt();

	        System.out.print("Salário: R$ ");
	        float salario = trabalho.nextFloat();
	        
	        String cargo = "";
	        float percentualReajuste = 0;
	        if (codigoCargo == 1) {
	            cargo = "Gerente";
	            percentualReajuste = 10;
	        } else if (codigoCargo == 2) {
	            cargo = "Vendedor";
	            percentualReajuste = 7;
	        } else if (codigoCargo == 3) {
	            cargo = "Supervisor";
	            percentualReajuste = 9;
	        } else if (codigoCargo == 4) {
	            cargo = "Motorista";
	            percentualReajuste = 6;
	        } else if (codigoCargo == 5) {
	            cargo = "Estoquista";
	            percentualReajuste = 5;
	        } else if (codigoCargo == 6) {
	            cargo = "Técnico de TI";
	            percentualReajuste = 8;
	        } else {
	            System.out.println("Código do cargo inválido!");
	            trabalho.close();
	            return;
	        }

	        float novoSalario = salario + (salario * percentualReajuste / 100);

	        System.out.println("\nNome do colaborador: " + nomeColaborador);
	        System.out.println("Cargo: " + cargo);
	        System.out.printf("Salário reajustado: R$ %.2f\n", novoSalario);
	        trabalho.close();

	}

}
