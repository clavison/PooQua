package heranca.exercicio1;

public class Produto {
	
	private String nome;
	private int estoque;
	private double vl;
	
	public Produto(String nome, int estoque, double vl) {
		this.nome = nome;
		this.estoque = estoque;
		this.vl = vl;
	}
	
	
	public boolean vender(Cliente c, int qtd) {
		estoque -= qtd;
		c.setSaldo(c.getSaldo() + qtd * vl);
		return true;
	}

	@Override
	public String toString() {
		return getNome() + "(" + getEstoque()+")";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getEstoque() {
		return estoque;
	}
	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}
	public double getVl() {
		return vl;
	}
	public void setVl(double vl) {
		this.vl = vl;
	}
	
	
	

}
