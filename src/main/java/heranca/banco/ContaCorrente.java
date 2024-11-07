package heranca.banco;

public class ContaCorrente extends Conta{
	
	public ContaCorrente(int nr, int agencia) {
		super(nr, agencia);
	}
	
	@Override
	public boolean saque(double vl) {
		if(vl <= getSaldo()) {
			return super.saque(vl);
		}
		return false;
	}

}
