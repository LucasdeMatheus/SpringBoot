package med.voll.api.domain.endereco;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Enabled
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Endereco {

    private String logradouro;
    private String bairro;
    private String cep;
    private String numero;
    private String complemento;
    private String cidade;
    private String uf;

    public Endereco(DadosEndereco endereco) {
        this.logradouro = endereco.logradouro();
        this.uf = endereco.uf();
        this.bairro = endereco.bairro();
        this.cep = endereco.cep();
        this.cidade = endereco.cidade();
        this.complemento = endereco.complemento();
        this.numero = endereco.numero();
    }

    public void atualizarInformacoes(Endereco endereco) {
        if (endereco.logradouro != null){
            this.logradouro = endereco.logradouro;
        }
        if (endereco.bairro != null){
            this.bairro = endereco.bairro;
        }
        if (endereco.uf != null){
            this.uf = endereco.uf;
        }
        if (endereco.cep != null){
            this.cep = endereco.cep;
        }
        if (endereco.cidade != null){
            this.cidade = endereco.cidade;
        }
        if (endereco.complemento != null){
            this.complemento = endereco.complemento;
        }
        if (endereco.numero != null){
            this.numero = endereco.numero;
        }
    }
}
