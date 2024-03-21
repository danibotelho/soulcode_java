import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {

        int n1, n2, soma, multi, sub;
        double div;

        n1 = 15;
        n2 = 30;

        soma = n1 + n2;
        System.out.println("O resultado da soma: " + soma);

        multi = n1 * n2;
        System.out.println("O resultado da multiplicação: " + multi);

        sub = n1 - n2;
        System.out.println("O resultado da subtração: " + sub);

        div = (double)  n1 / n2;
        System.out.println("O resultado da divisão : " + div);

        div = (double) n1%n2;
        System.out.printf("O resultado do resto : " + div);
    }
}