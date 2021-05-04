
class Main {

	public static void main(String[] args) {
		// instancia o gerenciador
		Controle c = new Controle();
		
		// cria as contas e juros para cada tipo de conta
		Conta contaSal = new ContaSalario("Fulano1", "001.002.003-04");
		contaSal.setJurosSaque(0.7);
		Conta contaCor = new ContaCorrente("Fulano2", "002.003.004-05");
		contaCor.setJurosSaque(0.7);
		Conta contaPou = new ContaPoupanca("Fulano3", "003.004.005-06");
		contaPou.setJurosSaque(0.7);
		
		// adiciona saldo de 100 em cada conta
		c.depositar(contaSal, 100);
		c.depositar(contaCor, 100);
		c.depositar(contaPou, 100);
		
		// mostra infos antes do saque
		c.consultarSaldo(contaSal);
		c.consultarSaldo(contaCor);
		c.consultarSaldo(contaPou);
		
		// saque de 50 seguido de saldo restante
		c.sacar(contaSal, 50.);
		c.sacar(contaCor, 50.);
		c.sacar(contaPou, 50.);
		
		System.out.println();
		
		// imprime as infos da conta após o saque 
		c.consultarSaldo(contaSal);
		c.consultarSaldo(contaCor);
		c.consultarSaldo(contaPou);
	}
}
