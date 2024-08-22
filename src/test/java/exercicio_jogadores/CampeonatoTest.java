package exercicio_jogadores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CampeonatoTest {
	
	Campeonato champ = new Campeonato();
	
	@BeforeEach
	void inicializa() {
		champ.getTimes().clear();
		
		//ADICIONA 1º TIME DEFAULT
		champ.cadastrarTime("Time 1");
		champ.addJogador("Time 1", "J1", 1, 2);
		champ.addJogador("Time 1", "J2", 2, 2);
		champ.addJogador("Time 1", "J3", 3, 2);
		champ.addJogador("Time 1", "J4", 4, 2);
		
		
		//ADICIONA 2º TIME DEFAULT
		champ.cadastrarTime("Time 2");
		champ.addJogador("Time 2", "J5", 5, 1);
		champ.addJogador("Time 2", "J6", 6, 1);
		champ.addJogador("Time 2", "J7", 7, 4);
		champ.addJogador("Time 2", "J8", 8, 1);
	}
	

	@Test
	void timeMaisGolsTest() {
		Time t = champ.timeMaisGols();
		assertEquals("Time 1", t.getNome());
	}
	
	@Test
	void timeMaisGolsSemTimeCadTest() {
		champ.getTimes().clear();
		Time t = champ.timeMaisGols();
		assertNull(t);
	}
	
	@Test
	void artiCampeonatoTest() {
		Jogador j = champ.artiCampeonato();
		assertEquals("J7", j.getNome());
	}
	
	@Test
	void artiCampeonatoSemTimeCadTest() {
		champ.getTimes().clear();
		Jogador j = champ.artiCampeonato();
		assertNull(j.getNome());
	}

	@Test
	void listaJogadoresTimeTest() {
		String s = champ.listaJogadoresTime("Time 2");
		String esperado = "*** Jogadores do time Time 2 ***\n\n";
				esperado += "J5(Camisa 5): 1 gols\n";
				esperado += "J6(Camisa 6): 1 gols\n";
				esperado += "J7(Camisa 7): 4 gols\n";
				esperado += "J8(Camisa 8): 1 gols\n";
		assertEquals(esperado, s);
	}
	
	@Test
	void listaJogadoresTimeNomeErradoTest() {
		String s = champ.listaJogadoresTime("Time x");
		assertNull(s);
	}
	
	@Test
	void addJogadorTimeNomeErradoTest() {
		champ.addJogador("", "", 0, 0);
		assertEquals(2, champ.getTimes().size());
		assertEquals(4, champ.getTimes().get(0).getJogadores().size());
		assertEquals(4, champ.getTimes().get(1).getJogadores().size());
	}
}
