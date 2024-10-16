package heranca;

public class Pessoa {
	
	private String nome;
	private int idade;
	
	@Override
	public String toString() {
		return getNome() + " - " + getIdade();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	@Override
	public boolean equals(Object o) {
		Pessoa outra = (Pessoa) o;
		if(getNome().equals(outra.getNome()) && getIdade() == outra.getIdade())
			return true;
		return false;
	}
	
	@Override
	protected Pessoa clone() {
		Pessoa nova = new Pessoa();
		nova.setNome(getNome());
		nova.setIdade(getIdade());
		return nova;
	}
	
	public int compareTo (Pessoa outra) {
		return getIdade() - outra.getIdade();
		//return getNome().compareTo(outra.getNome());
	}
	
	
	

}
