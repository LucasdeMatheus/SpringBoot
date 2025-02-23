package med.voll.api.domain.medicos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;

public interface MedicoRepository extends JpaRepository<Medico, Long> {

    Page<Medico> findAllByAtivoTrue(Pageable paginacao);

    @Query("""
            select m from Medicos m
            where
            m.ativo = true
            and
            m.especialidade = :especialidade
            and
            m.id not in (
                select c.medico.id from Consulta c
                where
                c.data = :data
                and
                c.motivoCancelamento is null
            )
            """)
    Medico escolherMedicoAleatorioLivreNaData(@Param("especialidade") Especialidade especialidade, @Param("data") LocalDateTime data);

    @Query("""
            select m.ativo
            from Medicos m
            where m.id = :idMedico
            """)
    Boolean findAtivoById(@Param("idMedico") Long idMedico);
}
