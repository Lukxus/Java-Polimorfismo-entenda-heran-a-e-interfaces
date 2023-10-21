
public class TesteFuncionario {
	public static void main(String[] args) {
		Gerente nico = new Gerente();
		System.out.println(nico);
		nico.setCpf("22333444456-9");
		nico.setNome("Nico Steppat");
		nico.setSalario(1600.0);
		System.out.println(nico.getCpf());
		System.out.println(nico.getNome());
		System.out.println(nico.getSalario());
		System.out.println(nico.getBonificacao());
		
	}
	
	
}
