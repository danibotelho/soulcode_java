import java.util.Scanner;

public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1- Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma das duas médias. A média das médias.
        System.out.println("1 questão.");
        double media1;
        double media2;
        double mediaDasMedias;


        media1 = (double) (8 + 9 + 7) / 3;
        System.out.println("Média 1: " + media1);

        media2 = (double) (4 + 5 + 6) / 3;
        System.out.println("Média 2: " + media2);

        mediaDasMedias = (media1 + media2) / 2;
        System.out.println("Media final: " + mediaDasMedias);

        //2 - Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu
        //antecessor e seu sucessor.

        System.out.println("2 questão.");
        int numero;

        System.out.println("Digite um numero: ");
        numero = scanner.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Numero informado: " + numero);
        System.out.println("Antecessor: " + antecessor);
        System.out.println("Sucessor: " + sucessor);

        //
        //3 - Crie um codigo que contenha 3 operações matematicas de sua escolha.
        //
        System.out.println("3 questão.");
        int n1, n2, soma, multi, sub;

        n1 = 5;
        n2 = 50;

        soma = n1 + n2;
        System.out.println("O resultado da soma: " + soma);

        multi = n1 * n2;
        System.out.println("O resultado da multiplicação: " + multi);

        sub = n2 - n1;
        System.out.println("O resultado da subtração: " + sub);

        //4 - Desenvolva um codigo que solicite ao usuario seu Nome, Sobrenome, Idade, Endereço e ao final mostre todos os dados informados
        //
        System.out.println("4 questão.");
        String nome, sobrenome, endereco;
        int idade;

        System.out.println("Qual o seu primeiro nome? ");
        nome = scanner.next();

        System.out.println("Qual o seu sobrenome? ");
        sobrenome = scanner.next();

        System.out.println("Você tem quantos anos? ");
        idade = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Qual o seu endereço? ");
        endereco = scanner.nextLine();

        System.out.println("Seu nome e sobrenome é: " + nome + " " + sobrenome + "\n" + "Você tem: " + idade + " anos." + "\n" + "Você mora no endereço: " + endereco);

        //5 - Crie um algoritmo que cadastra o nome e a idade de um usuario, após o cadastro mostre em que ano esse usuario nasceu.
        System.out.println("5 questão.");
        String nome5;
        int idade5, anoAtual, anoNascimento;

        System.out.println("Qaul o seu nome? ");
        nome5 = scanner.nextLine();

        System.out.println("Qauntos anos você tem? ");
        idade5 = scanner.nextInt();

        System.out.println("Em que ano estamos? ");
        anoAtual = scanner.nextInt();

        anoNascimento = anoAtual - idade5;

        System.out.println(nome5 + " nasceu no ano de : " + anoNascimento);

    }
}
