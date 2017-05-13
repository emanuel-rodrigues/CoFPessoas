package meu_exemplo_chain;

public class Cliente {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		
		PreencheCampo preenchedor = new SetNomePessoa();
		preenchedor.setProximo(new SetIdadePessoa());
		preenchedor.setProximo(new SetCpfPessoa());
		preenchedor.setProximo(new SetEnderecoPessoa());
		
		preenchedor.preencherPessoa(p);
		
		System.out.println(p);
		
		
		
		
		
		
		
	}
}
