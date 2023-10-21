
//abstract significa que não pode mais ser instanciado como objeto.
public abstract class Funcionario {
	
	private String nome;
	private String cpf;
	private double salario;
	//protected double salario;
	//protected significa publico para os filhos
	//pode gerar problemas dependendo da organização do projeto
	
	
	
	
	//metodo sem corpo, não ha implementação
	// OS filhos precisam implementar esse metodo.
	public abstract double getBonificacao();
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
