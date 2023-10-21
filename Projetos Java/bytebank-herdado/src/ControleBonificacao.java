
public class ControleBonificacao {
	
	private double soma;
	
//	public void resgistra(Gerente g) {
//		double boni = g.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
	public void resgistra(Funcionario f) {
		double boni = f.getBonificacao();
		this.soma = this.soma + boni;
	}
	
//	public void resgistra(EditorVideo e) {
//		double boni = e.getBonificacao();
//		this.soma = this.soma + boni;
//	}
	
	public double getSoma() {
		return soma;
	}
		

}
