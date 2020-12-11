package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Idade;

public interface IdadeService {

    Idade buscarIdade(Integer idade);

    Idade salvarIdade(Integer idade);

    Idade verificarIdadeExistente(Integer idade);
}
