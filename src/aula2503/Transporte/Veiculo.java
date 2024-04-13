package aula2503.Transporte;
public class Veiculo {
    private String marca;
    private String modelo;
    private Cor_ano cor_ano;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void mostrarDadosV(){
        System.out.println("--------------------------------------");
        System.out.println("Veículo");
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: " + modelo);

    }
}
