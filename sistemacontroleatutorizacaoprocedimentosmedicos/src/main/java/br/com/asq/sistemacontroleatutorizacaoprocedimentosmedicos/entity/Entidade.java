package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@MappedSuperclass
public class Entidade implements Serializable {

    private static final long serialVersionUID = 1l;

    /*@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)*/
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;

    public Entidade() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int hashCode() {
        return this.id == null ? super.hashCode() : 31 + this.id.hashCode();
    }

    public boolean equals(Object obj) {
        if (this.getId() == null && ((Entidade)obj).getId() == null) {
            return super.equals(obj);
        } else if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else {
            Entidade other = (Entidade)obj;
            if (this.getId() == null) {
                if (other.getId() != null) {
                    return false;
                }
            } else if (!this.getId().equals(other.getId())) {
                return false;
            }

            return true;
        }
    }
}
