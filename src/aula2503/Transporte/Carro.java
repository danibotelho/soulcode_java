package aula2503.Transporte;

public class Carro extends Veiculo{
    private int numero_portas;

    public Carro(String marca, String modelo, int numero_portas) {
        super(marca, modelo);
        this.numero_portas = numero_portas;
    }

    public int getNumero_portas() {
        return numero_portas;
    }

    public void setNumero_portas(int numero_portas) {

        this.numero_portas = numero_portas;
    }

    public void mostrarDadosC(){
        System.out.println("--------------------------------------");
        System.out.println("Carro");
        System.out.println("Número de portas: "+ numero_portas);
    }
}
