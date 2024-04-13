package aula2503.Transporte;

public class Main {

    public static void main(String[] args) {
        Cor_ano ca_v1 = new Cor_ano("Prata", 2023);
        Veiculo v1 = new Veiculo("Volks", "Gol");
        v1.mostrarDadosV();
        ca_v1.mostrarDadosCA();

        Carro c1 = new Carro("Ford", "Ka", 4);
        Cor_ano ca_c1 = new Cor_ano("Vermelho", 2022);
        c1.mostrarDadosV();
        c1.mostrarDadosC();
        ca_c1.mostrarDadosCA();

        Moto m1 = new Moto("Honda", "Modelo de moto da Honda", 100);
        Cor_ano ca_m1 = new Cor_ano("Preto", 2024);
        m1.mostrarDadosV();
        m1.mostrarDadosM();
        ca_m1.mostrarDadosCA();
    }
}
