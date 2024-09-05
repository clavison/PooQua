package construtores;

public class Intrumento {
	
	private String nome;
	private String tipo = "Cordas";
	
	
	public Intrumento() {
		nome = "";
	}
	
	public Intrumento(String x) {
		nome = x;
	}
	
	public Intrumento(boolean f) {
		this("S", "O");
		tipo = f ? "true" : "false";
	}
	
	public Intrumento(String n, String t) {
		nome = n;
		tipo = t;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
