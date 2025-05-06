package domain;

import java.time.LocalDateTime;

public class Moeda {
    private String nomeMoeda;
    private double taxaConversao;
    private LocalDateTime dataHoraConversao;

    public String getNomeMoeda() {
        return nomeMoeda;
    }

    public double getTaxaConversao() {
        return taxaConversao;
    }

    public LocalDateTime getDataHoraConversao() {
        return dataHoraConversao;
    }

    public Moeda(String nomeMoeda, double taxaConversao, LocalDateTime dataHoraConversao) {
        this.nomeMoeda = nomeMoeda;
        this.taxaConversao = taxaConversao;
        this.dataHoraConversao = dataHoraConversao;
    }
}
