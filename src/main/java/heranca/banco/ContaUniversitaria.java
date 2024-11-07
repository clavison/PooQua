package heranca.banco;

public class ContaUniversitaria extends Conta{
	
	public ContaUniversitaria(int nr, int agencia) {
		super(nr, agencia);
	}
	
	@Override
	public boolean saque(double vl) {
		if(vl <= getSaldo()) {
			return super.saque(vl);
		}
		return false;
	}
	
	@Override
	public boolean deposito(double vl) {
		if(getSaldo() + vl <= 2000) {
			return super.deposito(vl);
		}
		return false;
	}


}
