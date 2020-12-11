package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.resources.exception;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.exception.RecursoNaoEncontrado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ManipuladorExcecao extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RecursoNaoEncontrado.class)
    public ResponseEntity<MensagemErro> naoEncontrado(RecursoNaoEncontrado e, HttpServletRequest request) {
        MensagemErro err = new MensagemErro(System.currentTimeMillis(), HttpStatus.NOT_FOUND.value(), "Não encontrado", e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(err);
    }
}
