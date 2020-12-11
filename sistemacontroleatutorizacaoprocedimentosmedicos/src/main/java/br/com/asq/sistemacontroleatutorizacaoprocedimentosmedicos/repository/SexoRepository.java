package br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.repository;

import br.com.asq.sistemacontroleatutorizacaoprocedimentosmedicos.entity.Sexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SexoRepository extends JpaRepository<Sexo, Long> {

    @Query("SELECT s FROM Sexo s WHERE s.sexo = :sexo")
    Sexo buscarSexoPorTipo(@Param("sexo") String sexo);
}
