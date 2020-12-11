package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Idade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdadeRepository extends JpaRepository<Idade, Long> {

    @Query("SELECT i FROM Idade i WHERE i.idade = :idade")
    Idade buscarIdade(@Param("idade") Integer idade);
}
