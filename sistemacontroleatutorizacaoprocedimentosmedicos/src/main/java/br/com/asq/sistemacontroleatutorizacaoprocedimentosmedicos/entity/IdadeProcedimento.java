package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity;


import javax.persistence.*;

@Entity
@Table(name="idade_procedimento")
public class IdadeProcedimento extends Entidade {

    @ManyToOne
    @JoinColumn(name = "idade_id")
    private Idade idade;

    @ManyToOne
    @JoinColumn(name = "procedimento_id")
    private br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento procedimento;

    @ManyToOne
    @JoinColumn(name = "sexo_id")
    private br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo sexo;

    @Column(name = "executa_procedimento", nullable = false)
    @Enumerated(EnumType.STRING)
    private ExecutaProcedimento executaProcedimento;

    public IdadeProcedimento(){ }

    public IdadeProcedimento(ExecutaProcedimento executaProcedimento){
        this.executaProcedimento = executaProcedimento;
    }

    public IdadeProcedimento(Idade idade, br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento procedimento, br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo sexo, ExecutaProcedimento executaProcedimento) {
        this.idade = idade;
        this.procedimento = procedimento;
        this.sexo = sexo;
        this.executaProcedimento = executaProcedimento;
    }

    public Idade getIdade() {
        return idade;
    }

    public void setIdade(Idade idade) {
        this.idade = idade;
    }

    public br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento procedimento) {
        this.procedimento = procedimento;
    }

    public br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo getSexo() {
        return sexo;
    }

    public void setSexo(br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo sexo) {
        this.sexo = sexo;
    }

    public ExecutaProcedimento getExecutaProcediemto() {
        return executaProcedimento;
    }

    public void setExecutaProcediemto(ExecutaProcedimento executaProcedimento) {
        this.executaProcedimento = executaProcedimento;
    }
}
