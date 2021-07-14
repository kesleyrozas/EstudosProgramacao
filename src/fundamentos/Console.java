package fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Difite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Difite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %d", nome, idade);

        entrada.close();

    }
}
