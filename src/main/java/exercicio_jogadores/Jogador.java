package exercicio_jogadores;

public class Jogador {
	
	private String nome;
	private int camisa;
	private int gols;
	
	public void cadastra(String nome, int camisa, int gols) {
		setNome(nome);
		setCamisa(camisa);
		setGols(gols);
	}
	
	
	public String dados() {
		return getNome() + "(Camisa " + getCamisa()+"): " + getGols()+" gols\n";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCamisa() {
		return camisa;
	}
	public void setCamisa(int camisa) {
		this.camisa = camisa;
	}
	public int getGols() {
		return gols;
	}
	public void setGols(int gols) {
		this.gols = gols;
	}
	
	

}
