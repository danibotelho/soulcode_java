package Encapsulamento.Colaborador;

public class Main {
    public static void main(String[] args) {

        Colaborador colaborador = new Colaborador("Dani", "Botelho", -2800.00);

        Colaborador colaborador1 = new Colaborador("Lara", "Tavares", 7500.50);


        System.out.println("Salário Inicial");
        System.out.println("Nome: " + colaborador.getPrimeiroNome() + " Salario: "+ colaborador.getSalarioMensal());
        System.out.println("Nome: " + colaborador1.getPrimeiroNome() + " Salario: "+colaborador1.getSalarioMensal());

        System.out.println("\n");

        System.out.println("Salário Anual");
        System.out.println(colaborador.salarioAnual(colaborador.getSalarioMensal()));

        System.out.println(colaborador1.salarioAnual(colaborador1.getSalarioMensal()));
        double novoSalarioColaborador = colaborador.aumentoDeSalario(colaborador.getSalarioMensal());
        double novoSalarioColaborador1 = colaborador1.aumentoDeSalario(colaborador1.getSalarioMensal());

        System.out.println("\n");

        System.out.println("Salário com aumento");

        System.out.printf("Novo salário com aumento: %.2f\n", novoSalarioColaborador);

        System.out.printf("Novo salário com aumento: %.2f\n", novoSalarioColaborador1);

        System.out.println("\n");

        System.out.println("Salário após o aumento");

        System.out.printf("Salário de %s: %.2f\n", colaborador.getPrimeiroNome(), colaborador.getSalarioMensal());

        System.out.printf("Salário de %s: %.2f\n", colaborador1.getPrimeiroNome(), colaborador1.getSalarioMensal());




    }

}