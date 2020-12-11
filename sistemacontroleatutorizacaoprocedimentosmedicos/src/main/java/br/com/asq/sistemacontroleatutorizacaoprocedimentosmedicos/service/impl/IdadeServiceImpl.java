package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.impl;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Idade;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository.IdadeRepository;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.IdadeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdadeServiceImpl implements IdadeService {

    @Autowired
    private IdadeRepository idadeRepository;

    public IdadeServiceImpl(IdadeRepository idadeRepository) {
        this.idadeRepository = idadeRepository;
    }

    @Override
    public Idade buscarIdade(Integer idade) {
        return idadeRepository.buscarIdade(idade);
    }

    @Override
    public Idade salvarIdade(Integer idade) {
        Idade entidadeIdade = new Idade(idade);
        idadeRepository.save(entidadeIdade);
        return entidadeIdade;
    }

    @Override
    public Idade verificarIdadeExistente(Integer idade) {
        Idade idadeEncontrada = this.buscarIdade(idade);
        if(idadeEncontrada == null){
            idadeEncontrada = this.salvarIdade(idade);
        }
        return idadeEncontrada;
    }


}
