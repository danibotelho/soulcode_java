package Atividade1104.Questao02;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Continente {

    private String nomeContinente;
    private List<Pais> paises;

    public Continente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
        this.paises = new ArrayList<>();
    }

    public void adicionarPais(Pais pais) {
        paises.add(pais);
    }

    public double dimensaoTotalContinente() {
        double dimensaoTotal = 0;
        //for para acessar a informação de dimensão de cada país
        for (Pais pais : paises) {
            dimensaoTotal += pais.getDimensaoTerritorial();
        }
        return dimensaoTotal;
    }

    public long populacaoTotalContinente() {
        long populacaoTotal = 0;

        for (Pais pais : paises) {
            populacaoTotal += pais.getPopulacao();
        }
        return populacaoTotal;
    }

    public double densidadePopulacionalContinente() {
        double densidadePopulacional = populacaoTotalContinente() / dimensaoTotalContinente();
        return densidadePopulacional;
    }

    public Pais paisComMaiorPopulacao() {
        return paises.stream()
                .max(Comparator.comparing(Pais::getPopulacao))
                .orElse(null);
    }
    public Pais paisComMenorPopulacao() {
        return paises.stream()
                .min(Comparator.comparing(Pais::getPopulacao))
                .orElse(null);
    }

    public Pais paisMaiorDimensaoTerritorial() {
        return paises.stream()
                .max(Comparator.comparing(Pais::getDimensaoTerritorial))
                .orElse(null);
    }

    public Pais paisMenorDimensaoTerritorial() {
        return paises.stream()
                .min(Comparator.comparing(Pais::getDimensaoTerritorial))
                .orElse(null);
    }

    public double razaoTerritorialMaiorMenor() {
        Pais maior = paisMaiorDimensaoTerritorial();
        Pais menor = paisMenorDimensaoTerritorial();
        if (maior != null && menor != null && menor.getDimensaoTerritorial() != 0) {
            return maior.getDimensaoTerritorial() / menor.getDimensaoTerritorial();
        }
        return 0;
    }

    public String getNomeContinente() {
        return nomeContinente;
    }

    public List<Pais> getPaises() {
        return paises;
    }
}
