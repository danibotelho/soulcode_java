package Encapsulamento.Colaborador;

public class Colaborador {
    private String primeiroNome;
    private String segundoNome;
    private double salarioMensal;

    public Colaborador(String primeiroNome, String segundoNome, double salarioMensal) {
        if (salarioMensal < 0) {
            salarioMensal = 0.0;
        }
        this.primeiroNome = primeiroNome;
        this.segundoNome = segundoNome;
        this.salarioMensal = salarioMensal;
    }

    public double salarioAnual(double salarioMensal) {
       return  salarioMensal *  12;

    }

    public double aumentoDeSalario(double salarioMensal ) {
      return  this.salarioMensal =  salarioMensal *  1.1;
   }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getSegundoNome() {
        return segundoNome;
    }

    public void setSegundoNome(String segundoNome) {
        this.segundoNome = segundoNome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {

        if (salarioMensal < 0) {
            salarioMensal = 0.0;
        }
        this.salarioMensal = salarioMensal;
    }
}
