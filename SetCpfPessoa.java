package meu_exemplo_chain;

public class SetCpfPessoa extends PreencheCampo {

	@Override
	public void preenche(Pessoa pessoa) {
		pessoa.cpf = "999.999.999-99";
		
	}

}
