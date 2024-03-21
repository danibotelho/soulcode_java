import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


//        1 -Crie um programa que realize uma contagem regressiva de 10 até 1, mostrando cada número na tela.

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


//        2 - Escreva um programa que solicite um número ao usuário e exiba a tabuada desse número de 1 a 10.

        System.out.print("Digite um numero: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

//        3 - Desenvolva um algoritmo que calcule a soma dos números pares de 1 a 100.

        int soma = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);


//       4 - Escreva um programa que verifique se um número digitado pelo usuário é primo ou não.

        System.out.print("Digite um número inteiro positivo: ");
        int numeroInteiro = scanner.nextInt();

        boolean primo = true;

        if (numeroInteiro <= 1) {
            primo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(numeroInteiro); i++) {
                if (numeroInteiro % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(numeroInteiro + " é um número primo.");
        } else {
            System.out.println(numeroInteiro + " não é um número primo.");
        }

//       5 - Implemente um algoritmo que exiba os primeiros 20 números da sequência de Fibonacci.

        int ant = 0;
        int atual = 1;

        System.out.println(ant  + "\n" + atual);

        for(int i = 20; i>0 ; i--){
            int proximoAtual = ant + atual;
            System.out.println(proximoAtual + " ");
            ant = atual;
            atual = proximoAtual;
        }


//       6 - Faça um programa que solicite ao usuário números inteiros positivos. Quando o usuário digitar um número negativo, o programa deve exibir a média dos números inseridos até aquele momento.
        int somaNumeros = 0;
        int contador = 0;

        System.out.println("Digite números inteiros positivos (digite um número negativo para encerrar):");

        while (true) {
            System.out.print("Digite um número: ");
            int numeroPositivoNegativo = scanner.nextInt();

            if (numeroPositivoNegativo < 0) {
                break;
            }

            somaNumeros += numeroPositivoNegativo;
            contador++;
        }

        if (contador > 0) {
            double media = (double) somaNumeros / contador;
            System.out.println("A média dos números inseridos é: " + media);
        } else {
            System.out.println("Nenhum número foi inserido.");
        }

//       7 - Crie uma calculadora simples que permita ao usuário realizar operações de soma, subtração, multiplicação e divisão entre dois             números, utilizando um laço de repetição para continuar operando até que o usuário decida sair.

        char opcao;

        do {
            System.out.println("Selecione a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("5. Sair");

            System.out.print("Opção: ");
            opcao = scanner.next().charAt(0);

            switch (opcao) {
                case '1':
                    System.out.print("Digite o primeiro número: ");
                    double numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double numero2 = scanner.nextDouble();
                    double somaNumerosCalculadora = numero1 + numero2;
                    System.out.println("Resultado da soma: " + somaNumerosCalculadora);
                    break;
                case '2':
                    System.out.print("Digite o primeiro número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = scanner.nextDouble();
                    double subtracao = numero1 - numero2;
                    System.out.println("Resultado da subtração: " + subtracao);
                    break;
                case '3':
                    System.out.print("Digite o primeiro número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = scanner.nextDouble();
                    double multiplicacao = numero1 * numero2;
                    System.out.println("Resultado da multiplicação: " + multiplicacao);
                    break;
                case '4':
                    System.out.print("Digite o primeiro número: ");
                    numero1 = scanner.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    numero2 = scanner.nextDouble();
                    if (numero2 != 0) {
                        double divisao = numero1 / numero2;
                        System.out.println("Resultado da divisão: " + divisao);
                    } else {
                        System.out.println("Erro: Divisão por zero!");
                    }
                    break;
                case '5':
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != '5');


//        8 - Implemente um jogo no qual o programa escolhe um número aleatório entre 1 e 100, e o jogador deve tentar adivinhá-lo. O programa deve fornecer dicas do tipo "maior" ou "menor" conforme necessário.
        Random random = new Random();
        int chances = 5, palpite = 0, numerodasorte = random.nextInt(20) + 1;
        ;
        System.out.println(" Vamos iniciar o jogo");
        System.out.println(" Voce deve acertar o numero que o robo esta pensando");

        while (chances > 0 && palpite != numerodasorte) {
            System.out.println("Digite um numero, vamos ver se voce acerta");
            palpite = scanner.nextInt();
            if (palpite == numerodasorte) {
                System.out.println("Parabenssssss voce acertou");
            } else {
                System.out.println("Tente novamente");
                chances--;
                if (chances > 0) {
                    System.out.println("Voce ainda tem " + chances + " para acertar");
                    if(palpite < numerodasorte){
                        System.out.println("O numero da sorte é maior do que o informado");
                    }else {
                        System.out.println(" O numero da sorte é menor do que o informado");
                    }
                } else {
                    System.out.println("Voce nao conseguiu suas chances acabaram!!");
                    System.out.println("o numero era: " + numerodasorte);
                }
            }
        }

        System.out.println("saiu do while");


//        9 -  Escreva um programa que converta a temperatura de Celsius para Fahrenheit ou vice-versa, solicitando ao usuário qual conversão deseja fazer. O programa deve continuar executando até que o usuário decida sair.
        char opcaoSelecionada;

        do {
            System.out.println("Selecione a conversão desejada:");
            System.out.println("1. Celsius para Fahrenheit");
            System.out.println("2. Fahrenheit para Celsius");
            System.out.println("3. Sair");

            System.out.print("Opção: ");
            opcaoSelecionada = scanner.next().charAt(0);

            switch (opcaoSelecionada) {
                case '1':
                    System.out.print("Digite a temperatura em Celsius: ");
                    double celsius = scanner.nextDouble();
                    double fahrenheit = (celsius * 9 / 5) + 32;
                    System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
                    break;
                case '2':
                    System.out.print("Digite a temperatura em Fahrenheit: ");
                    double fahr = scanner.nextDouble();
                    double cels = (fahr - 32) * 5 / 9;
                    System.out.println("A temperatura em Celsius é: " + cels);
                    break;
                case '3':
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoSelecionada != '3');


//        10 - Desenvolva um programa que permita ao usuário inserir itens em uma lista de compras. O programa deve exibir a lista de compras atualizada após cada inserção e perguntar se o usuário deseja adicionar mais itens. O programa deve continuar executando até que o usuário decida sair.
        ArrayList<String> listaCompras = new ArrayList<>();

        char continuar;

        do {
            System.out.print("Digite o item a ser adicionado à lista de compras: ");
            String item = scanner.nextLine();
            listaCompras.add(item);

            System.out.println("Lista de compras atualizada:");
            for (String listItem : listaCompras) {
                System.out.println(listItem);
            }

            System.out.print("Deseja adicionar mais itens? (S/N): ");
            continuar = scanner.next().charAt(0);
            scanner.nextLine();

        } while (continuar == 'S' || continuar == 's');

        System.out.println("Lista de compras final:");
        for (String listItem : listaCompras) {
            System.out.println(listItem);
        }

        System.out.println("Encerrando o programa...");
    }
}
