
public class TesteTributaveis {
 
	public static void main() {
		ContaCorrente cc = new ContaCorrente(22, 333);
		cc.deposita(100.0);
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalculadoraDeImposto calc = new CalculadoraDeImposto();
		
		calc.registra(seguro);
		calc.registra(cc);
		
		System.out.println(calc.getTotalImposto());
	}
}
