package variaveisOperadores;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;

		System.out.println("Salario Bruto: ");
		salarioBruto = scanner.nextFloat();

		System.out.println("Adicional Noturno: ");
		adicionalNoturno = scanner.nextFloat();

		System.out.println("Horas Extras: ");
		horasExtras = scanner.nextFloat();

		System.out.println("Descontos: ");
		descontos = scanner.nextFloat();

		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;

		System.out.printf("Salario Liquido: %.2f%n", salarioLiquido);
		scanner.close();

	}

}
