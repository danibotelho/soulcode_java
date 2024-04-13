package aula2503.Transporte;
public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public void mostrarDadosM(){
        System.out.println("--------------------------------------");
        System.out.println("Moto");
        System.out.println("Cilindradas: "+ cilindradas);
    }
}
