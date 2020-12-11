package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Procedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcedimentoRepository extends JpaRepository<Procedimento, Long> {

    @Query("SELECT p FROM Procedimento p WHERE p.procedimento = :procedimento")
    Procedimento buscarProcedimentoPorNumero(@Param("procedimento") Integer procedimento);
}
