package AulasIniciais;

import java.util.Scanner;

public class ElseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextDouble();

        if(nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota < 6.0) {
            System.out.println("Reprovado");
        } else  {
            System.out.println("Recuperação");
        }
    }
}
