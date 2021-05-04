
class ContaCorrente extends Conta{
	public ContaCorrente(String nome, String cpf) {
		super(nome, cpf);
	}
	
	@Override
	public void setJurosSaque(double valor) {
		super.setJurosSaque(valor);
	}
	@Override
	public String toString() {
		return "Conta Corrente";
	}

}
