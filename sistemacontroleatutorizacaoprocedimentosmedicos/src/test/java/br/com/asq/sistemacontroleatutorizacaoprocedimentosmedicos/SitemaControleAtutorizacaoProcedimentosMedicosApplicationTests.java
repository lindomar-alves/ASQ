package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Idade;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository.IdadeRepository;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.IdadeService;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.impl.IdadeServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

@SpringBootTest
class SitemaControleAtutorizacaoProcedimentosMedicosApplicationTests {

	@MockBean
    IdadeRepository idadeRepository;

    @Test
    void criarIdadeTest(){
        IdadeService idadeServiceImpl = new IdadeServiceImpl(idadeRepository);
        Idade idade = idadeServiceImpl.salvarIdade(10);
        idade.setId(1l);
        assertEquals(1, idade.getId());
    }

}
