package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo;

public interface SexoService {

    Sexo buscarSexoPorTipo(String tipo);
}
