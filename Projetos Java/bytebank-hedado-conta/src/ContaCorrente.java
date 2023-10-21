
//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }
	
	@Override
	public boolean saca(double valor) {
		double valorASacar = valor + 0.2;
		return super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return (super.saldo * 0.01);
	}
	
		

	//Override significa que você está sobrescrevendo um método e não criando um novo.
	//Nao preciso necessariamente do override, mas ele me ajuda a manter certos padrões da reescrita
}
