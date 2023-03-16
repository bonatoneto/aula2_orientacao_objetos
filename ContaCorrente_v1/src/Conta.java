public class Conta {
	
	public String nomeCliente;
	public int numeroDaAgencia;
	public int numeroDaConta;
	public float limite;
	public float saldo;
	
	public void depositar(float valor) {
		saldo = saldo + valor;
		
	}
	
	public void sacar(float valor) {
		saldo = saldo - valor;
	}
	
	public boolean verificarSaldo(float valor) {
		if (saldo + limite >= valor)
			return true;
		else {
			return false;
		}
	}
	
	public float calculaDisponivel() {
		return saldo + limite;
	}
}