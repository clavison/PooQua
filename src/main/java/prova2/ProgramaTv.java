package prova2;

public class ProgramaTv {

	private String nome = "Y";
	private double nota = 5.0;
	private Apresentador apresentador = new Apresentador("S");

	public ProgramaTv(){
		this("ABC",8.0);
	}

	public ProgramaTv(double p){
		this.nota = p;
	}

	public ProgramaTv(String n, double p){
		this.nome = n;
		this.nota = p;
	}

	public String toString() {
		String classe = "";
		if (nota < 5)
			classe = "RUIM";
		else {
			if (nota >= 5 && nota < 7)
				classe = "BOM";
			else
				classe = "ÓTIMO";
		}
		return this.nome + " - " + classe + " - " + apresentador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public Apresentador getApresentador() {
		return apresentador;
	}

	public void setApresentador(Apresentador apresentador) {
		this.apresentador = apresentador;
	}
	
	
	
	// GETS E SETS IMPLEMENTADOS
	
	

}
