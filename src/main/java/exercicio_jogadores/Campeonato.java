package exercicio_jogadores;

import java.util.ArrayList;

public class Campeonato {
	
	private ArrayList<Time> times = new ArrayList<Time>();
	
	
	public Time timeMaisGols() {
		if(times.size() == 0)
			return null;
		Time timeMaisGols = times.get(0);
		for (Time t : times) {
			if(t.golsTime() > timeMaisGols.golsTime())
				timeMaisGols = t;
		}
		return timeMaisGols;
	}
	
	
	public Jogador artiCampeonato() {
		Jogador artilheiro = new Jogador();
		for (Time t : times) {
			if(t.artilTime().getGols() > artilheiro.getGols())
				artilheiro = t.artilTime();
		}
		return artilheiro;
	}
	
	
	public String listaJogadoresTime(String nmTime) {
		Time t = buscaTime(nmTime);
		if( t!= null)
			return t.mostraJogadores();
		return null;
	}
	
	public void cadastrarTime(String nome) {
		Time t = new Time();
		t.cadastrar(nome);
		times.add(t);
	}
	
	public void addJogador(String nmTime, String nmJog, int camisa, int gols) {
		Jogador j = new Jogador();
		j.cadastra(nmJog, camisa, gols);
		 Time t = buscaTime(nmTime);
		 if( t!=null) {
			 t.addJogador(j);
		 }
	}
	
	public Time buscaTime(String nome) {
		for (Time t : times) {
			if(t.getNome().equalsIgnoreCase(nome))
				return t;
		}
		return null;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}

}
