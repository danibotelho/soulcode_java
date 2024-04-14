package Atividade1104.Questao02;

public class Pais {
    private String nomePais;
    private double dimensao;
    private long populacao;

    public Pais(String nomePais, double dimensao, int populacao) {
        this.nomePais = nomePais;
        this.dimensao = dimensao;
        this.populacao = populacao;
    }

    public String getNomePais() {
        return nomePais;
    }

    public double getDimensao() {
        return dimensao;
    }

    public long getPopulacao() {
        return populacao;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
}
