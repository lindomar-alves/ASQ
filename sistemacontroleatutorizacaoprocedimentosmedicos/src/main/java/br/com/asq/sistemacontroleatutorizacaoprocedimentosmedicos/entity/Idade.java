package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity;

import javax.persistence.*;

@Entity
@Table(name="idade")
public class Idade extends Entidade {

    @Column
    private Integer idade;

    public Idade(){
    }

    public Idade(Integer idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
