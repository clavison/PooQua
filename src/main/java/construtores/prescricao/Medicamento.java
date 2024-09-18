package construtores.prescricao;

import java.util.ArrayList;

public class Medicamento {
	
	private String nome;
	private String administracao;
	private ArrayList<String> indicacoes = new ArrayList<String>();
	
	public Medicamento(String nome, String administracao, ArrayList<String> indicacoes) {
		this.nome = nome;
		this.administracao = administracao;
		this.indicacoes = indicacoes;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAdministracao() {
		return administracao;
	}

	public void setAdministracao(String administracao) {
		this.administracao = administracao;
	}

	public ArrayList<String> getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(ArrayList<String> indicacoes) {
		this.indicacoes = indicacoes;
	}
	
	@Override
	public String toString() {
		return getNome()+"\n";
	}
	
	
	
	

}
