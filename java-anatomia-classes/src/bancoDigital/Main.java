package bancoDigital;

public class Main {
    public static void main(String[] args) {
		Cliente alex = new Cliente();
		alex.setNome("Alex");
		
		Conta cc = new ContaCorrente(alex);
		Conta poupanca = new ContaPoupanca(alex);

		cc.depositar(50000);
		cc.transferir(25000, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}
}
