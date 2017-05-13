package meu_exemplo_chain;

public abstract class PreencheCampo {
	
	PreencheCampo proximo;
	
	public void setProximo(PreencheCampo proximo){
		if(this.proximo == null){
			this.proximo = proximo; 
		}else{
			this.proximo.setProximo(proximo);
		}
	};
	
	
	public void preencherPessoa(Pessoa pessoa){
		preenche(pessoa);
		if(this.proximo != null){
		proximo.preencherPessoa(pessoa);
		}
	}
	
	
	
	
	
	public abstract void preenche(Pessoa pessoa);

}
