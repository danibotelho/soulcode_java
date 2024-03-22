package Encapsulamento.Suprimento;

public class Suprimentos {

    private String descrItem;
    private int numeroItem;
    private int quantidadeItemComprada;
    private double precoItem;
    private double valorFatura;

    public Suprimentos(String descrItem, int numeroItem, int quantidadeItemComprada, double precoItem) {

        if (quantidadeItemComprada < 0) {
            quantidadeItemComprada = 0;

        }
        if (precoItem < 0) {
            precoItem = 0.0;
        }

        this.descrItem = descrItem;
        this.numeroItem = numeroItem;
        this.quantidadeItemComprada = quantidadeItemComprada;
        this.precoItem = precoItem;
    }

    public void setDescrItem(String descrItem) {
        this.descrItem = descrItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public void setQuantidadeItemComprada(int quantidadeItemComprada) {
        if (quantidadeItemComprada < 0) {
            quantidadeItemComprada = 0;

        }
        this.quantidadeItemComprada = quantidadeItemComprada;
    }

    public void setPrecoItem(double precoItem) {
        if (precoItem < 0) {
            precoItem = 0.0;
        }
        this.precoItem = precoItem;
    }


    public int getNumeroItem() {
        return numeroItem;
    }

    public String getDescrItem() {
        return descrItem;
    }

    public int getQuantidadeItemComprada() {
        return quantidadeItemComprada;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public double getInvoiceAmount(double quantidadeItemComprada, double precoItem) {
        this.valorFatura = quantidadeItemComprada * precoItem;
        return valorFatura;
    }
}
