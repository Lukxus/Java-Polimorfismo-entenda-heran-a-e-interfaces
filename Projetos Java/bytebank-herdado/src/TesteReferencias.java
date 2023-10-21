
public class TesteReferencias {
	
	public static void main(String args[]) {
		Gerente g1 = new Gerente();
		g1.setNome("Luiz Saraiva");
		String nome1 = g1.getNome();
		System.out.println(nome1+"\n");
		
//		Funcionario g2 = new Gerente(); //Gerente herda a classe funcionario, logo o seu construtor vem junto.
//		g2.setNome("Luiz Saraiva");
//		String nome2 = g2.getNome();
//		System.out.println(nome2);
//		double b = g2.getBonificacao();
		// Esse getBonificacao é referente ao metodo da calsse gerente. 
		// Isso ocorre devido a instancai ter sido criada a partir da classe gerente.
		// Qaundo isso ocorre metodos com nomes iguais acabam respondendo an camada mais especifica.

		Gerente g2 = new Gerente(); //Gerente herda a classe funcionario, logo o seu construtor vem junto.
		g2.setNome("Luiz Saraiva");
		String nome2 = g2.getNome();
		System.out.println(nome2);
		double b = g2.getBonificacao();
		
			
		Gerente g3 = new Gerente();
		g3.setNome("Luiz Saraiva");
		g3.setSalario(5000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.resgistra(g3);
		double soma = controle.getSoma();
		System.out.println(soma);
		
//		Funcionario f1 =  new Funcionario(); // Funcionario não funciona mais por causa do abstract
//		f1.setSalario(2000.0);
//		controle.resgistra(f1);
//		soma = controle.getSoma();
//		System.out.println(soma);
		
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500);
		controle.resgistra(ev);
		soma = controle.getSoma();
		System.out.println(soma);
		
	}
}
