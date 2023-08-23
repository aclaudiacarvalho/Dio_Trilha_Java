
public class Main {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.setNome("Claudia");
		
		Conta cc = new ContaCorrente(cliente);
		
		cc.depositar(100.00);
		
		Conta poupanca = new ContaPoupanca(cliente);
		
		cc.transferir(100.00, poupanca);


		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
