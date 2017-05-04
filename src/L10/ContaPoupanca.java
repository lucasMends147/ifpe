package L10;
// a classe poupança também possui um método atualizar que
//adiciona a taxa ao saldo. 
public class ContaPoupanca extends Conta {

	public ContaPoupanca(String banco, int numConta, double taxa, double saldo) {
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
