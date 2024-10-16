package prova2;

public class Apresentador {
	
	private String nome;
	private char sexo = 'F';
	
	public Apresentador(String nome, char sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
	
	public Apresentador(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	@Override
	public String toString() {
		if(sexo == 'F')
			return "** " + this.nome + " **";
		return "## " + this.nome + " ##";
	}
	
	// GETS E SETS IMPLEMENTADOS

}
