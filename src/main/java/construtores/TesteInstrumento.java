package construtores;

public class TesteInstrumento {
	
	public static void main(String[] args) {
		Intrumento i1 = new Intrumento();
		Intrumento i2 = new Intrumento("ABC", "DEF");
		Intrumento i3 = new Intrumento("teste");
		Intrumento i4 = new Intrumento(true);
		System.out.println(i1.getNome() + " - " + i1.getTipo());
		System.out.println(i2.getNome() + " - " + i2.getTipo());
		System.out.println(i3.getNome() + " - " + i3.getTipo());
		System.out.println(i4.getNome() + " - " + i4.getTipo());
	}

}
