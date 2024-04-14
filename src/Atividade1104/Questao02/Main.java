package Atividade1104.Questao02;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Pais brasil = new Pais("Brasil", 5566365.3, 250000000
        );

        Continente americaSul = new Continente("America do Sul");

        americaSul.adicionarPais(brasil);

        List<Pais> paisesDaAmericaSul = americaSul.getPaises();
        for (Pais pais : paisesDaAmericaSul) {
            System.out.println("Nome do país: " + pais.getNomePais());
            System.out.println("Tamanho territorial: " + pais.getDimensao());
            System.out.println("População: " + pais.getPopulacao());
        }
    }
}
