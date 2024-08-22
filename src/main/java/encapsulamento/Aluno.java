package encapsulamento;

public class Aluno {
	
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(idade <0 || idade > 18)
			this.idade = 0;
		else
			this.idade = idade;
	}

	String retornaDados() {
		return getNome() + " - " + getIdade();
	}

}
