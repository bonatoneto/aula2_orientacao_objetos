public class Principal {
	public static void main(String[] args) {
		int opcao = 0;
		boolean contaCriada = false;
		Conta conta = null;
		Float valor;
		do {
			System.out.println("\n\n MENU DE OPCOES");
			System.out.println("1 - Criar conta corrente");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Verificar saldo");
			System.out.println("5 - Sair");
			opcao = Console.readInt("Informe a opcao desejada:");
			switch (opcao) {
			case 1:
				conta = new Conta();
				conta.nomeCliente = Console.readString("Infome o nome do cliente");
				conta.numeroDaAgencia = Console.readInt("Infome o numero da agencia");
				conta.numeroDaConta = Console.readInt("Infome o numero da conta");
				conta.limite = Console.readFloat("Qual o limite da conta");
				conta.saldo = 0;
				contaCriada = true;
				System.out.println("\n\n");
				break;
			case 2:
				if (contaCriada == true) {
					valor = Console.readFloat("Infome o valor que deseja sacar: ");
					if (conta.verificarSaldo(valor) == true) {
						conta.sacar(valor);
						System.out.println("Saldo em conta apos o saque" + conta.calculaDisponivel());
					} else {
						System.out.println("Saldo insuficeinte para realizar o saque! saldo disponivel: " + conta.calculaDisponivel());
					}
				} else {
					System.out.println("Para realizar saques e necessario criar uma conta");
				}
				break;
			case 3:
				if(contaCriada == true) {
					valor = Console.readFloat("Informe o valor do deposito: ");
					conta.depositar(valor);
					System.out.println("Saldo em conta disponivel: " + conta.saldo);
				} else {
					System.out.println("Para realizar depositos é necessario criar a conta corrente!");
				}
				break;
			case 4:
				if (contaCriada == true) {
					System.out.println("Nome do cliente: " + conta.nomeCliente);
					System.out.println("Numero da agencia: " + conta.numeroDaAgencia);
					System.out.println("Numero da conta: " + conta.numeroDaConta);
					System.out.println("Limite da conta: " + conta.limite);
					System.out.println("Saldo da conta: 1" + conta.saldo);
					System.out.println("Saldo disponivel na conta: " + conta.calculaDisponivel());
				} else {
					System.out.println("Para verificar o saldo é necessario criar a conta corrente!");
				}
				break;
			}
		} while (opcao !=5);
		
	}
}
