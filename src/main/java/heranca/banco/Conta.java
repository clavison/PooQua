package heranca.banco;

public class Conta {
	
	private int nr;
	private int agencia;
	private double saldo;
	
	public boolean deposito(double vl) {
		saldo += vl;
		return true;
	}
	
	public boolean saque(double vl) {
		saldo -= vl;
		return true;
	}
	
	public boolean transferencia(double vl, Conta destino) {
		if (getAgencia() == destino.getAgencia()) {
			if (saque(vl)) {
				if(destino.deposito(vl)){
					return true;
				}else {
					deposito(vl);
					return false;
				}
			}else {
				return false;
			}
		}
		return false;
	}
	
	public Conta() {
		this(-1,  -1);
	}
	
	public Conta(int nr, int agencia) {
		setNr(nr);
		setAgencia(agencia);
	}
	
	
	public int getNr() {
		return nr;
	}
	public void setNr(int nr) {
		this.nr = nr;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return getNr() + " - " + getAgencia()+ " - " + getSaldo();
	}
	

}
