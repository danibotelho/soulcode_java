import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioBruto, salarioLiquido, valorHora, horasTrabalhadas;
        double impostoDeRenda, inss, fgts, totalDesc, sindicato;

        System.out.println("Quanto custa a sua hora de trabalho? ");
        valorHora = scanner.nextDouble();

        System.out.println("Quantas horas você trabalha no mês? ");
        horasTrabalhadas = scanner.nextDouble();

        salarioBruto = valorHora * horasTrabalhadas;

        if (salarioBruto <= 900.0) {
            impostoDeRenda = 0;
        } else if (salarioBruto <= 1500.0) {
            impostoDeRenda = salarioBruto * 0.05;

        } else if (salarioBruto <= 2500.0) {
            impostoDeRenda = salarioBruto * 0.01;
        } else {
            impostoDeRenda = salarioBruto * 0.2;
        }

        sindicato = salarioBruto * 0.03;
        inss = salarioBruto * 0.10;
        fgts = salarioBruto * 0.11;
        totalDesc = sindicato + inss + impostoDeRenda;
        salarioLiquido = salarioBruto - totalDesc;

        System.out.println("Salario Bruto: " + salarioBruto);
        System.out.println("Imposto de Renda: " + impostoDeRenda);
        System.out.println("Desconto Sindicato: " + sindicato);
        System.out.println("Desconto Inss: " + inss);
        System.out.println("FGTS: " + fgts);
        System.out.println("Total de Descontos: " + totalDesc);
        System.out.println("Salario liquido: " + salarioLiquido);


    }
}
