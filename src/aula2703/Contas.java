package aula2703;

public class Contas {
    public static void main(String[] args) {
//        ContaBancaria conta = new ContaBancaria("Daniela", 123, 1590);
//        conta.depositar(500);
//        conta.sacar(2000);

//        ContaPoupanca contaPoupanca1 = new ContaPoupanca("Daniela", 123, 1000, 5);
//        contaPoupanca1.sacar(10);
//        contaPoupanca1.depositar(10);
//
//        contaPoupanca1.calcularNovoSaldo(10);
//        System.out.println("-----------------------------");
//        System.out.println("Nome Cliente: " + contaPoupanca1.getCliente() + "\n" + "Numero da conta: " + contaPoupanca1.getNumConta() + "\n" + "Saldo da conta: " + contaPoupanca1.getSaldo());

        ContaEspecial contaEspecial = new ContaEspecial("Daniela", 123, 1000, 200);

        contaEspecial.sacar(200);
        contaEspecial.depositar(100);
        System.out.println("-----------------------------");
        System.out.println("Nome Cliente: " + contaEspecial.getCliente() + "\n" + "Numero da conta: " + contaEspecial.getNumConta() + "\n" + "Saldo da conta: " + contaEspecial.getSaldo());

    }
}
