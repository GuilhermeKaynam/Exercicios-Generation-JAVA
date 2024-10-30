package If;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);

        System.out.print("Digite a primeira palavra (vertebrado/invertebrado): ");
        String palavra1 = animal.nextLine().toLowerCase();

        System.out.print("Digite a segunda palavra (ave/mamifero/inseto/anelideo): ");
        String palavra2 = animal.nextLine().toLowerCase();

        System.out.print("Digite a terceira palavra (carnivoro/onivoro/herbivoro/hematofago): ");
        String palavra3 = animal.nextLine().toLowerCase();
        
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("Águia");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("Pomba");
                } else {
                    System.out.println("Esse animal não existe");
                }
            } else if (palavra2.equals("mamifero")) {
                if (palavra3.equals("onivoro")) {
                    System.out.println("Homem");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("Vaca");
                } else {
                    System.out.println("Esse animal não existe");
                }
            } else {
                System.out.println("Esse animal não existe");
            }
        } else if (palavra1.equals("invertebrado")) {
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("Pulga");
                } else if (palavra3.equals("herbivoro")) {
                    System.out.println("Lagarta");
                } else {
                    System.out.println("Esse animal não existe");
                }
            } else if (palavra2.equals("anelideo")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("Sanguessuga");
                } else if (palavra3.equals("onivoro")) {
                    System.out.println("Minhoca");
                } else {
                    System.out.println("Esse animal não existe");
                }
            } else {
                System.out.println("Esse animal não existe");
            }
        } else {
            System.out.println("Esse animal não existe");
        }

        animal.close();
		
	}

}
