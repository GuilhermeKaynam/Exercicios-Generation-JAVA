package variaveisOperadores;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int salario = 10000;
		int abono = 1000;
		int resultado;

		salario += abono;

		resultado = salario + abono;

		System.out.println("O salario é:" + salario);
		System.out.println("O abono é:" + abono);
		System.out.println("Novo salario é:" + resultado);

	}

}
