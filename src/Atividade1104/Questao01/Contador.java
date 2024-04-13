package Atividade1104.Questao01;


//1) Escreva em Java uma classe Contador, que encapsule um valor usado para contagem de
//itens ou eventos. A classe deve oferecer métodos que devem:
//a) Zerar;
//b) Incrementar;
//c) Retornar o valor do contador.
public class Contador {
    private int valor;

    public Contador(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void Zerar(){
        this.valor = 0;
    }

    public void Incrementar(){
        this.valor++;
    }

}
