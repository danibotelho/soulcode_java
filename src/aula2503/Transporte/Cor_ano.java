package aula2503.Transporte;
public class Cor_ano {
    private String cor;
    private int ano;

    public Cor_ano(String cor, int ano) {
        System.out.println();
        System.out.println("entrei no construtor de cor_ano " + cor + " " + ano);
        this.cor = cor;
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void mostrarDadosCA(){
        System.out.println("--------------------------------------");
        System.out.println("Cor_ano");
        System.out.println("Cor: "+ cor);
        System.out.println("Ano: " + ano);
    }
}
