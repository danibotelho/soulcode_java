package Atividade1104.Questao01;


public class Main {
    public static void main(String[] args) {
        Contador contador = new Contador(5);

        System.out.println("Valor inicial: " + contador.getValor());
        contador.Incrementar();

        System.out.println("Valor Incrementado: " + contador.getValor());
        contador.Zerar();

        System.out.println("Valor Zerado: " + contador.getValor());

    }
}