package tira_teima;

public class Pessoa {
	
	private String nome;
	
	public Pessoa() {
		this("João");
	}
	
	public Pessoa(String n) {
		this.nome = n;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	

}
