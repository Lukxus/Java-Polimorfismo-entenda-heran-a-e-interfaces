
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(this.senha);
		if(autenticou) {
			System.err.println("Pode entrar no sistema!");
		} else {
			System.err.println("Não pode entrar no sistema!");
		}
	}
}
