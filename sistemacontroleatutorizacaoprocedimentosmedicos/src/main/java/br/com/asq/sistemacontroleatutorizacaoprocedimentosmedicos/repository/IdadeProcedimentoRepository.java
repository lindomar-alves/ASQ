package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.IdadeProcedimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IdadeProcedimentoRepository extends JpaRepository<IdadeProcedimento, Long> {

    @Query("SELECT ip FROM IdadeProcedimento ip inner join ip.idade i inner join ip.procedimento p inner join ip.sexo s WHERE i.idade = :idade and p.procedimento = :procedimento and s.sexo = :sexo")
    IdadeProcedimento buscarIdadeProcedimento(@Param("idade") Integer idade, @Param("procedimento") Integer procedimento, @Param("sexo") String sexo);

}
