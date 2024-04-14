package Atividade1104.Questao02;

public class Pais {
    private String nomePais;
    private double dimensaoTerritorial;
    private long populacao;

    public Pais(String nomePais, double dimensaoTerritorial, int populacao) {
        this.nomePais = nomePais;
        this.dimensaoTerritorial = dimensaoTerritorial;
        this.populacao = populacao;
    }

    public String getNomePais() {
        return nomePais;
    }

    public double getDimensaoTerritorial() {
        return dimensaoTerritorial;
    }

    public long getPopulacao() {
        return populacao;
    }
}
