package prova2;

import java.util.ArrayList;

public class Emissora {
	
	private String nome;
	private ArrayList<ProgramaTv> programas = new ArrayList<ProgramaTv>();
	
	public Emissora() {
		this.nome = "RXZ";
		programas.add(new ProgramaTv());
		programas.add(new ProgramaTv("AAA", 8));
		programas.add(new ProgramaTv(2));
		programas.get(2).setNome("BBB");
		programas.get(0).setNome("CCC");
		programas.get(0).setApresentador(new Apresentador("JJJ", 'M'));
		programas.get(1).setApresentador(new Apresentador("YYY"));
	}
	
	public ArrayList<ProgramaTv> getProgramas() {
		return programas;
	}

	public String toString() {
		return this.nome;
	}

}
