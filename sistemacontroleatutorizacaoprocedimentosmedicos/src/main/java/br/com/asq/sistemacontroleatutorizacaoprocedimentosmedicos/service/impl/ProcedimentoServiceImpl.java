package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.impl;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository.ProcedimentoRepository;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.ProcedimentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcedimentoServiceImpl implements ProcedimentoService {

    @Autowired
    private ProcedimentoRepository procedimentoRepository;

    @Override
    public Procedimento buscarProcedimentoPorNumero(Integer numeroProcedimento) {
        return procedimentoRepository.buscarProcedimentoPorNumero(numeroProcedimento);
    }

    @Override
    public Procedimento salvarProcedimento(Integer numeroProcedimento) {
        Procedimento procedimento = new Procedimento(numeroProcedimento);
        procedimentoRepository.save(procedimento);
        return procedimento;
    }

    @Override
    public Procedimento verificarProcedimentoExistente(Integer numeroProcedimento) {
        Procedimento procedimento = buscarProcedimentoPorNumero(numeroProcedimento);
        if(procedimento == null){
            procedimento = salvarProcedimento(numeroProcedimento);
        }
        return procedimento;
    }
}
