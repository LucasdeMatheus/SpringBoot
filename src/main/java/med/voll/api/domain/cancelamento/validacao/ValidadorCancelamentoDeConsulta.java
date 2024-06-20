package med.voll.api.domain.cancelamento.validacao;

import med.voll.api.domain.cancelamento.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}