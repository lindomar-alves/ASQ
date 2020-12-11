package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.ExecutaProcedimento;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.IdadeProcedimento;

public interface IdadeProcedimentoService {

    IdadeProcedimento buscarIdadeProcedimento(Integer procedimento, Integer idade, String sexo);

    IdadeProcedimento salvarIdadeProcedimento(Integer procedimento, Integer idade, String sexo, ExecutaProcedimento executaProcediemto);

    IdadeProcedimento verificarIdadeProcedimentoExiste(Integer procedimento, Integer idade, String sexo, String executaProcediemto);

}
