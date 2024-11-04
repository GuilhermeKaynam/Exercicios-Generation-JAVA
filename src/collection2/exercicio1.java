package collection2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Queue<String> filaClientes = new LinkedList<>();
		int opcao;

		do {
			System.out.println("\nDigite uma opção:");
			System.out.println("***************************************");
			System.out.println("1: Adicionar um novo Cliente na fila");
			System.out.println("2: Listar todos os Clientes na fila");
			System.out.println("3: Retirar um Cliente da fila");
			System.out.println("0: Finalizar o programa");
			
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do Cliente:");
				String nomeCliente = scanner.nextLine();
				filaClientes.add(nomeCliente);
				System.out.println("\nCliente Adicionado!");
				exibirFila(filaClientes);
				break;

			case 2:
				System.out.println("\nLista de Clientes na Fila:");
				if (filaClientes.isEmpty()) {
					System.out.println("A Fila está vazia!");
				} else {
					exibirFila(filaClientes);
				}
				break;

			case 3:
				if (filaClientes.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					filaClientes.poll();
					System.out.println("\nO Cliente foi Chamado!");
					exibirFila(filaClientes);
				}
				break;

			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;

			default:
				System.out.println("\nOpção inválida! Tente novamente.");
			}
		} while (opcao != 0);

		scanner.close();
	}

	public static void exibirFila(Queue<String> fila) {
		if (fila.isEmpty()) {
			System.out.println("Fila: ");
		} else {
			System.out.println("Fila:");
			for (String cliente : fila) {
				System.out.println(cliente);
			}
		}
	}
}