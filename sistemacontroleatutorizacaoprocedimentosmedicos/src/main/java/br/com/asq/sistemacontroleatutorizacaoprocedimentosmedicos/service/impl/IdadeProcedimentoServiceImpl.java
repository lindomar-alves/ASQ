package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.impl;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.*;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository.IdadeProcedimentoRepository;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.IdadeProcedimentoService;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.IdadeService;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.ProcedimentoService;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.SexoService;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.exception.RecursoNaoEncontrado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdadeProcedimentoServiceImpl implements IdadeProcedimentoService {

    @Autowired
    private IdadeProcedimentoRepository idadeProcedimentoRepository;

    @Autowired
    private ProcedimentoService procedimentoService;

    @Autowired
    private IdadeService idadeService;

    @Autowired
    private SexoService sexoService;

    @Override
    public IdadeProcedimento buscarIdadeProcedimento(Integer numeroProcedimento, Integer idade, String sexo) {
        IdadeProcedimento idadeProcedimento = idadeProcedimentoRepository.buscarIdadeProcedimento(idade, numeroProcedimento, sexo);
        if(idadeProcedimento == null){
            idadeProcedimento = new IdadeProcedimento(ExecutaProcedimento.NAO);
        }
        return idadeProcedimento;
    }

    @Override
    public IdadeProcedimento salvarIdadeProcedimento(Integer numeroProcedimento, Integer ano, String sexo, ExecutaProcedimento executaProcediemto) {
        Procedimento procedimento = procedimentoService.verificarProcedimentoExistente(numeroProcedimento);
        Idade idade = idadeService.verificarIdadeExistente(ano);
        Sexo sexo1 = sexoService.buscarSexoPorTipo(sexo);
        IdadeProcedimento idadeProcedimento = new IdadeProcedimento(idade, procedimento, sexo1, executaProcediemto);
        idadeProcedimentoRepository.save(idadeProcedimento);
        return idadeProcedimento;
    }

    @Override
    public IdadeProcedimento verificarIdadeProcedimentoExiste(Integer numeroProcedimento, Integer ano, String sexo, String executaProcediemto) {
        IdadeProcedimento idadeProcedimento = this.buscarIdadeProcedimento(ano, numeroProcedimento, sexo);

        if(idadeProcedimento == null || (idadeProcedimento != null && idadeProcedimento.getId() == null)){
            ExecutaProcedimento executaProcedimento = ExecutaProcedimento.pegarExecucaoPelaDescricao(executaProcediemto);
            if(executaProcedimento != null){
                idadeProcedimento = salvarIdadeProcedimento(numeroProcedimento, ano, sexo, executaProcedimento);
            } else {
                throw new RecursoNaoEncontrado("Recusro não encontrado");
            }
        }
        return idadeProcedimento;
    }

}