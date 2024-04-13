package aula2703;

import org.w3c.dom.ls.LSOutput;

public class ContaBancaria {
    private String cliente;
    private int numConta;
    private float saldo;

    public ContaBancaria(String cliente, int num_conta, float saldo) {
        this.cliente = cliente;
        this.numConta = num_conta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void sacar(float valor) {
        if (valor > saldo) {
            System.out.println("Saldo Insuficiente");
        } else {
            saldo -= valor;
            System.out.println("Valor do saque: " + valor);
            System.out.println("Saldo em conta:  " + saldo);
        }
    }

    public void depositar(float valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Deposito no valor de : " + valor + "\n"+ "Saldo da conta: " + saldo);
        } else {
            System.out.println("Valor de deposito inválido");
        }
    }
}
