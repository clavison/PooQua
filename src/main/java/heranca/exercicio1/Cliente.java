package heranca.exercicio1;

public class Cliente {
	
	private String nome;
	private double saldo;
	
	public boolean pagarConta() {
		return pagarConta(getSaldo());
	}
	
	public boolean pagarConta(double vl) {
		if( getSaldo() >= vl) {
			saldo -= vl;
			return true;
		}
		return false;
	}
	
	public Cliente(String nome, double saldo) {
		this.nome = nome;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return getNome() + "- R$ " + getSaldo();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}
