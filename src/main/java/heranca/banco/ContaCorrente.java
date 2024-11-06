package heranca.banco;

public class ContaCorrente extends Conta{
	
	@Override
	public boolean saque(double vl) {
		if(vl <= getSaldo()) {
			return super.saque(vl);
		}
		return false;
	}

}
