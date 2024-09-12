package construtores.matriculas;

public class Professor {
	
	private String nome;
	private int formacao;
	
	public Professor() {
		this("João", 3);
	}

	public Professor(String nome, int formacao) {
		this.nome = nome;
		this.formacao = formacao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getFormacao() {
		return formacao;
	}
	public void setFormacao(int formacao) {
		this.formacao = formacao;
	}
	
	

}
