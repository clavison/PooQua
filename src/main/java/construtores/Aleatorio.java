package construtores;

import java.util.Random;

public class Aleatorio {
	
	int numero;
	
	public Aleatorio(int maximo) {
		numero = new Random().nextInt(maximo);
	}
	
	public Aleatorio(String maximo) {
		this(Integer.parseInt(maximo));
	}
	
	public Aleatorio() {
		this("20");
	}
	
}
