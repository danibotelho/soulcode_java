import java.util.Scanner;

public class elseIf {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double nota;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextDouble();

        if(nota >= 7) {
            System.out.println("aprovado");
        } else if (nota < 6.0) {
            System.out.println("reprovado");
        } else  {
            System.out.println("recuperação");
        }
    }
}
