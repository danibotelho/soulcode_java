package Atividade1104.Questao02;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Continente americaSul = new Continente("America do Sul");

        americaSul.adicionarPais(new Pais("Brasil", 8515767, 213993437));
        americaSul.adicionarPais(new Pais("Argentina", 2780400, 45195774));
        americaSul.adicionarPais(new Pais("Chile", 756626, 19600000));

        List<Pais> paisesDaAmericaSul = americaSul.getPaises();
        for (Pais pais : paisesDaAmericaSul) {
            System.out.println("Nome do país: " + pais.getNomePais());
            System.out.println("Tamanho territorial: " + pais.getDimensaoTerritorial());
            System.out.println("População: " + pais.getPopulacao());
            System.out.println("------------------------------------");
        }

        System.out.println("CONTINENTE: " + americaSul.getNomeContinente());
        System.out.println("Dimensão Total: " + americaSul.dimensaoTotalContinente());
        System.out.println("População Total: " + americaSul.populacaoTotalContinente());
        System.out.println("Densidade Demografica: " + americaSul.densidadePopulacionalContinente());
        System.out.println("País com maior dimensão: " + americaSul.paisMaiorDimensaoTerritorial().getNomePais());
        System.out.println("País com menor dimensão: " + americaSul.paisMenorDimensaoTerritorial().getNomePais());
        System.out.println("País com maior população: " + americaSul.paisComMaiorPopulacao().getNomePais());
        System.out.println("País com menor população: " + americaSul.paisComMenorPopulacao().getNomePais());
        System.out.println("Razão territorial: " + americaSul.razaoTerritorialMaiorMenor());


    }
}
