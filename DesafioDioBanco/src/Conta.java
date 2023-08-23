
public abstract class Conta implements Iconta {
	private static final int AGENCIA_PADRAO = 001;
	private static int sequencial = 1;

	 
	protected int agencia;
	protected int numero;
	protected Double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = sequencial ++;
		this.saldo = 0.00;
		this.cliente = cliente;
		
	}
	
@Override
public void sacar(Double valor) {
	saldo -= valor;
}
@Override
public void depositar(Double valor) {
	saldo += valor;
}
@Override
public void transferir(Double valor, Conta ContaDestino) {	
	this.sacar(valor);
	ContaDestino.depositar(valor);
}
protected void imprimirInfosComum() {
	System.out.println (String.format("Titular = %s ", this.cliente.getNome()));
	System.out.println (String.format("Agencia = %d ", this.agencia));
	System.out.println (String.format("Numero = %d ", this.numero));
	System.out.println (String.format("Saldo = %.2f ", this.saldo));
}

public int getAgencia() {
	return agencia;
}
public int getNumero() {
	return numero;
}
public Double getSaldo() {
	return saldo;
}

}
