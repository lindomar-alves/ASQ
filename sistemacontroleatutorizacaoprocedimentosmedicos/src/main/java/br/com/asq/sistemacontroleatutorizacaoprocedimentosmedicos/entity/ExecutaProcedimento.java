package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity;

import java.util.HashMap;
import java.util.Map;

public enum ExecutaProcedimento {
    SIM("SIM"),
    NAO("NAO");

    private String descricao;

    private static final Map<String, ExecutaProcedimento> pegarExecucaoPeloValor = new HashMap<>();

    static {
        for (ExecutaProcedimento executaProcedimento : ExecutaProcedimento.values()){
            pegarExecucaoPeloValor.put(executaProcedimento.getDescricao(), executaProcedimento);
        }
    }

    ExecutaProcedimento(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static ExecutaProcedimento pegarExecucaoPelaDescricao(String descricao){
        return pegarExecucaoPeloValor.get(descricao);
    }
}
