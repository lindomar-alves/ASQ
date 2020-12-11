package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="procedimento")
public class Procedimento extends Entidade{

    @Column
    private Integer procedimento;

    public Procedimento(){
    }

    public Procedimento(Integer procedimento) {
        this.procedimento = procedimento;
    }

    public Integer getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(Integer procedimento) {
        this.procedimento = procedimento;
    }
}
