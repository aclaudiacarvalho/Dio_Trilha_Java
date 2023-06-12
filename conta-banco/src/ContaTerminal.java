import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;

		System.out.println("Por favor, digite o número da Conta: ");
		numero = sc.nextInt();

		System.out.println("Agora digite o número da Agência: ");
		agencia = sc.next();

		System.out.println("Me informe seu Nome: ");
		nomeCliente = sc.next();
		sc.nextLine();

		System.out.println("Agora me informa seu saldo atual: ");
		saldo = sc.nextDouble();

		System.out.printf("Olá " + nomeCliente +", obrigado por criar uma conta em "
				+ "nosso banco, sua agência é " + agencia 
				+ " conta " + numero + " e seu saldo R$ "+ saldo+" já está disponível"
				+ " para saque." );

		sc.close();
	}

}