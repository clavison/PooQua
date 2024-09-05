package construtores;

public class TesteAleatorio {
	
	public static void main(String[] args) {
		
		Aleatorio a1 = new Aleatorio();
		System.out.println(a1.numero);
		
		Aleatorio a2 = new Aleatorio(95);
		System.out.println(a2.numero);
		
		
	}

}
