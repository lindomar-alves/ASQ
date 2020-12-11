package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.impl;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository.SexoRepository;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.SexoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SexoServiceImpl implements SexoService {

    @Autowired
    private SexoRepository sexoRepository;

    @Override
    public Sexo buscarSexoPorTipo(String tipo) {
        return sexoRepository.buscarSexoPorTipo(tipo);
    }
}
