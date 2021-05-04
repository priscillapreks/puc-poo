
class ContaSalario extends Conta{
	public ContaSalario(String nome, String cpf) {
		super(nome, cpf);
	}
	
	@Override
	public void setJurosSaque(double valor) {
		super.setJurosSaque(valor);
	}
	@Override
	public String toString() {
		return "Conta Salário";
	}

}
