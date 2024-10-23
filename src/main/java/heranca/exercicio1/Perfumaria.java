package heranca.exercicio1;

public class Perfumaria extends Produto{
	
	public Perfumaria(String nome, int estoque, double vl) {
		super(nome, estoque, vl);
	}
	
	@Override
	public boolean vender(Cliente c, int qtd) {
		if(getEstoque() <= qtd && c.getSaldo() < 100) {
			return super.vender(c, qtd);
		}
		return false;
	}
}
