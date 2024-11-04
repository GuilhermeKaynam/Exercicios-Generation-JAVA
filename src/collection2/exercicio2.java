package collection2;

import java.util.Scanner;
import java.util.Stack;

public class exercicio2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<String> livros = new Stack<>();
		int opcao;

		do {
			System.out.println("\nDigite uma opção:");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros da pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Finalizar o programa");
			opcao = scanner.nextInt();
			scanner.nextLine();

			switch (opcao) {
			case 1:
				System.out.println("Digite o nome do livro:");
				String nomeLivro = scanner.nextLine();
				livros.push(nomeLivro);
				System.out.println("\nLivro adicionado!");
				exibirPilha(livros);
				break;

			case 2:
				System.out.println("\nLista de Livros na Pilha:");
				if (livros.isEmpty()) {
					System.out.println("A Pilha está vazia!");
				} else {
					exibirPilha(livros);
				}
				break;

			case 3:
				if (livros.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					livros.pop();
					System.out.println("\nUm Livro foi retirado da pilha!");
					exibirPilha(livros);
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

	public static void exibirPilha(Stack<String> pilha) {
		if (pilha.isEmpty()) {
			System.out.println("Pilha: ");
		} else {
			System.out.println("Pilha:");
			for (String livro : pilha) {
				System.out.println(livro);
			}
		}
	}

}
