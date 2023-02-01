package med.voll.apiMed.medico;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import med.voll.apiMed.endereco.DadosEndereco;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DadosCadastroMedico {

	private String nome;
	private String email;
	private String crm;
	private Especialidade especialidade;
	private DadosEndereco endereco;
	
}
