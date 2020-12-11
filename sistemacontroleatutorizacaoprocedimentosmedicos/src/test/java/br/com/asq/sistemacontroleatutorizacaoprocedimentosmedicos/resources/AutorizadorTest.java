package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.resources;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.*;
import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.IdadeProcedimentoService;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import static io.restassured.module.mockmvc.RestAssuredMockMvc.given;

import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@WebMvcTest(controllers = AutorizadorController.class)
class AutorizadorTest {

    @Autowired
    private AutorizadorController autorizadorController;

    @MockBean
    IdadeProcedimentoService idadeProcedimentoService;

    @BeforeEach
    public void inicialize(){
        RestAssuredMockMvc.standaloneSetup(this.autorizadorController);
    }

    @Test
    public void buscarIdadeProcedimentoTest(){
        IdadeProcedimento idadeProcedimento = getIdadeProcedimento();

        Mockito.when(this.idadeProcedimentoService.buscarIdadeProcedimento(159, 10, "M"))
            .thenReturn(idadeProcedimento);

        given().accept(ContentType.ANY)
                .when()
                .get("/autorizador/procedimento/{numeroProcediemtno}/idade/{idade}/sexo/{sexo}", 159, 10, "M")
                .then().statusCode(HttpStatus.SC_OK);

        Assertions.assertEquals(ExecutaProcedimento.SIM.getDescricao(), idadeProcedimento.getExecutaProcediemto().getDescricao());
    }

    @Test
    public void cadastrarProcedimentoTest(){
        IdadeProcedimento idadeProcedimento = getIdadeProcedimento();

        Mockito.when(this.idadeProcedimentoService.salvarIdadeProcedimento(159, 10, "M", ExecutaProcedimento.SIM))
                .thenReturn(idadeProcedimento);

        given().accept(ContentType.ANY)
                .when()
                .post("autorizador/cadastro/procedimento/{numeroProcediemtno}/idade/{idade}/sexo/{sexo}/autoriza/{autoriza}",159, 10, "M", "SIM")
                .then().statusCode(HttpStatus.SC_OK);

    }

    private IdadeProcedimento getIdadeProcedimento() {
        Idade idadeMock = new Idade(10);
        idadeMock.setId(1l);

        Procedimento procedimentoMock = new Procedimento(159);
        procedimentoMock.setId(2l);

        Sexo sexoMock = new Sexo("M");
        sexoMock.setId(3l);

        ExecutaProcedimento executaProcedimento = ExecutaProcedimento.SIM;

        return new IdadeProcedimento(idadeMock, procedimentoMock, sexoMock, executaProcedimento);
    }


}