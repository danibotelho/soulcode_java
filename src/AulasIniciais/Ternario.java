package AulasIniciais;

import java.util.Scanner;

public class Ternario {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();
        System.out.println((idade >= 18) ? "Voce é maior de idade" : "Voce é menor de idade");

    }
}