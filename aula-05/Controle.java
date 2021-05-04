
class Controle {
	
	public Controle() {}
	
	public void depositar(Conta c, double valor) {
		c.setSaldo(c.getSaldo() + valor);
	}

	public void consultarSaldo(Conta c){
		System.out.println("Nome " + c.getNome());
		System.out.println("Tipo de conta " + c);
		System.out.println("Saldo " + c.getSaldo());
	}
	
	public void sacar(Conta c, double valor) {
		c.sacarSaldo(c,  valor);
	}
}
