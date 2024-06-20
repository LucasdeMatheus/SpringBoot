package med.voll.api.domain.medicos;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.endereco.Endereco;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id, String nome, String telefone, Endereco endereco) {
}
