package domain;

import java.time.LocalDateTime;

public class Moeda {
    private String nomeMoeda;
    private double taxaConversao;
    private LocalDateTime dataHoraConversao;

    public Moeda(String moedaDestino, double taxa) {
        this.nomeMoeda = nomeMoeda;
        this.taxaConversao = taxaConversao;
        this.dataHoraConversao = dataHoraConversao;
    }

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    public LocalDateTime getDataHoraConversao() {
        return dataHoraConversao;
    }
}
