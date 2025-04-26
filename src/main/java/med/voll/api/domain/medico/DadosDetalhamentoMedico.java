package med.voll.api.domain.medico;

import med.voll.api.domain.endereco.Endereco;
// dto para enviar para a requisição o objeto Medico que acabou de ser criado através de Record
public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }

}
