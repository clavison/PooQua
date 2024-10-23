package heranca.exercicio1;

public class Medicamento extends Produto{
	
	private boolean retemReceita;
	
	public Medicamento(String nome, int estoque, double vl, boolean receita) {
		super(nome, estoque, vl);
		this.retemReceita = receita;
	}
	
	@Override
	public boolean vender(Cliente c, int qtd) {
		if(getEstoque() >= qtd) {
			return super.vender(c, qtd);
		}
		return false;
	}

	public boolean isRetemReceita() {
		return retemReceita;
	}

	public void setRetemReceita(boolean retemReceita) {
		this.retemReceita = retemReceita;
	}
	
	

}
