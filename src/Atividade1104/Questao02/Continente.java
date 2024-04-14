package Atividade1104.Questao02;

import java.util.ArrayList;
import java.util.List;
import java.lang.reflect.Array;

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
            dimensaoTotal += pais.getDimensao();
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
        double densidadePopulacional  =  populacaoTotalContinente() / densidadePopulacionalContinente();
        return  densidadePopulacional;
    }



    public String getNomeContinente() {
        return nomeContinente;
    }

    public List<Pais> getPaises() {
        return paises;
    }
}
