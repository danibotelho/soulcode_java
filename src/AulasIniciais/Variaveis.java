package AulasIniciais;

import java.util.Scanner;

public class Variaveis {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("========= Cadastro =========");

        System.out.println("Qual a sua idade?");
        int idade = scanner.nextInt();

        System.out.println("Qual o seu nome? ");
        String nome = scanner.nextLine();

        System.out.println("ok, qual sua altura?");
        float altura = scanner.nextFloat();
        System.out.printf(nome+ "..." + "\nSua idade é: " + idade + "\nSua altura é: " + altura) ;
    }
}