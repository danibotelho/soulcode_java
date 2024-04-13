package aula2703;

public class ContaEspecial extends ContaBancaria {
    private float limite;

    public ContaEspecial(String cliente, int num_conta, float saldo, float limite) {
        super(cliente, num_conta, saldo);
        this.limite = limite;
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public void sacar(float valor) {
        double saldo = getSaldo();
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Valor sacado: " + valor);
            System.out.println("Saldo atual: " + (saldo + limite));
        } else {
            System.out.println("Saldo Insuficiente");
        }
    }
}
