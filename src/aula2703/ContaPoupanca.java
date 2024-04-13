package aula2703;

public class ContaPoupanca extends ContaBancaria{

    private int diaDeRendimento;
    public ContaPoupanca(String cliente, int numConta,  float saldo, int diaDeRendimento ) {
        super(cliente, numConta,saldo );
        this.diaDeRendimento = diaDeRendimento;
    }

    public int getDiaDeRendimento() {
        return diaDeRendimento;
    }

    public void setDiaDeRendimento(int diaDeRendimento) {
        this.diaDeRendimento = diaDeRendimento;
    }

    public void calcularNovoSaldo(float taxaDeRendimento){
        float novoSaldo = getSaldo();
        novoSaldo = novoSaldo  * (1 + taxaDeRendimento/100);
        setSaldo(novoSaldo);
        System.out.println("Seu saldo com o rendimento é: " + novoSaldo);
    }
}
