package exercicio_jogadores;

import java.util.ArrayList;

public class Time {
	
	private String nome;
	private ArrayList<Jogador> jogadores = new ArrayList<Jogador>();
	
	public int golsTime() {
		int qt = 0;
		for (Jogador j : jogadores) {
			qt += j.getGols();
		}
		return qt;
	}
	
	public Jogador artilTime() {
		if(jogadores.size() == 0)
			return null;
		Jogador arti = jogadores.get(0);
		for (Jogador j : jogadores) {
			if(j.getGols() > arti.getGols()) {
				arti = j;
			}
		}
		return arti;
	}
	
	public void cadastrar(String nome) {
		setNome(nome);
	}
	
	public void addJogador(Jogador j) {
		jogadores.add(j);
	}
	
	public String mostraJogadores() {
		String ret = "*** Jogadores do time " + getNome()+" ***\n\n";
		for (Jogador j : jogadores) {
			ret += j.dados();
		}
		return ret;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}
	
	

}
