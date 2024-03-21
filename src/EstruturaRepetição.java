import java.util.Scanner;

public class EstruturaRepetição {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        for (int i = 0 ; i <=10 ; i++){
//            System.out.println(i);
//        }
//
//        for (int i = 100 ; i >= 1; i--){
//            System.out.println(i);
//        }

        System.out.println("Escreva um numero inteiro");
        int numero = scanner.nextInt();

        for (int i = numero ; i >= 0 ; i--){
            System.out.println(i);
        }
    }
}