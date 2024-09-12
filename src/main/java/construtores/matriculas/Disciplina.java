package construtores.matriculas;

public class Disciplina {
	
	private String nome;
	private int cargaH;
	private Professor professor = new Professor();
	
	public Disciplina() {
		setNome("POO");
	}

	public Disciplina(String nome, int cargaH, Professor professor) {
		this.nome = nome;
		this.cargaH = cargaH;
		this.professor = professor;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCargaH() {
		return cargaH;
	}
	public void setCargaH(int cargaH) {
		this.cargaH = cargaH;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}
	
	

}
