
public class Gerente extends Funcionario implements Autenticavel {


	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}	
	
	public double getBonificacao() { 
		// Já tenho esse metodo na classe mãe; Isso é uma reescrita ; 
		//Deve possuir a mesma assinatura que o metodo da classe mãe.
		//super significa que esse atributo vem da classe mãe
		System.out.println("getBonificacao gerente: ");
		return super.getSalario();
	}
	

}
