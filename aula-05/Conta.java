
public class Conta {
	private String nome;
	private String cpf;
	private double saldo;
	private double jurosSaque;
	
	public Conta() {}
	
	public Conta(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		this.saldo = 0.0;
		this.jurosSaque = 0.5;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public void addSaldo(double saldo) {
		this.saldo += saldo;
		System.out.println("Valor " + saldo + "adicionado. Total: " + this.saldo +".");
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	public double getJurosSaque() {
		return this.jurosSaque;
	}
	
	public void setJurosSaque(double valor) {
		this.jurosSaque = valor;
	}
	
	public void sacarSaldo(Conta c, double valor) {
		double aux = valor + c.getJurosSaque();
		if (aux <= c.getSaldo()) {
			c.setSaldo(c.getSaldo() - aux);
		}else {
			System.out.println("Saldo insuficiente. Saldo + Juros de saque: " 
					+ (c.getSaldo() + c.getJurosSaque()));
		}
	}
}

