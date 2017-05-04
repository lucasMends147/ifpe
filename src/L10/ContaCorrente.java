package L10;

public class ContaCorrente extends Conta {
	// A classe conta corrente possui um método atualizar que subtrai do
	//saldo a taxa definida;
	public ContaCorrente(String banco, int numConta, double taxa, double saldo) {
		super(banco, numConta, taxa, saldo);
		
	}

	
	public double sacar(double valor) {
		if(super.getSaldo() - valor >= 0){
			super.setSaldo(super.getSaldo() - valor);
			return super.getSaldo();
		}else
			return 0;
		
	}

	
	public double depositar(double valor) {
		super.setSaldo(super.getSaldo() + valor);
		return super.getSaldo();
	}

}
