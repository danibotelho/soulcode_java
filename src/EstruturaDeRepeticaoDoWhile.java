


import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EstruturaDeRepeticaoDoWhile {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Random random = new Random();
        int chances = 5, palpite = 0, numerodasorte = random.nextInt(20) + 1;
        ;
        System.out.println(" Vamos iniciar o jogo");
        System.out.println(" Voce deve acertar o numero que o robo esta pensando");

        while (chances > 0 && palpite != numerodasorte) {
            System.out.println("Digite um numero, vamos ver se voce acerta");
            palpite = leitura.nextInt();
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

    }
}

