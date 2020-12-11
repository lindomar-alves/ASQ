package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento;

public interface ProcedimentoService {

    Procedimento buscarProcedimentoPorNumero(Integer numeroProcedimento);

    Procedimento salvarProcedimento(Integer numeroProcedimento);

    /**
     * Verifica se há procedimento se não houver ele cria um
     * @param numeroProcedimento
     * @return
     */
    Procedimento verificarProcedimentoExistente(Integer numeroProcedimento);
}
