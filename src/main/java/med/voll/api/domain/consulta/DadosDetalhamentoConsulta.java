package med.voll.api.domain.consulta;

import med.voll.api.domain.medicos.Especialidade;

import java.time.LocalDateTime;

public record DadosDetalhamentoConsulta(Long id, Long idMedico, Long idPaciente, LocalDateTime data) {
    public DadosDetalhamentoConsulta(Consulta consulta) {
        this(consulta.getId(), consulta.getMedico().getId(), consulta.getPaciente().getId(), consulta.getData());
    }

    public DadosDetalhamentoConsulta(Object o, int i, int i1, LocalDateTime data, Especialidade especialidade) {
        this((Long) o, (Long) (long) i, (Long) (long) i1, data);
    }
}