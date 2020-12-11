package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.service.exception;

public class RecursoNaoEncontrado extends RuntimeException{

    private static final long serialVersionUID = 1L;

    public RecursoNaoEncontrado(String exception) {
        super(exception);
    }
}
