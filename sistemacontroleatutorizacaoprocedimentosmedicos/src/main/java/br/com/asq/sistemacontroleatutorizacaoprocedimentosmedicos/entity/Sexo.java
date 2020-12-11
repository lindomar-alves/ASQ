package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="sexo")
public class Sexo extends Entidade{

    @Column
    private String sexo;

    public Sexo() {}

    public Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}
