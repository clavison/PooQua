package heranca.construtores;

public class TesteConstrutor {
	
	public static void main(String[] args) {
		Operario o = new Operario("Ana");
		System.out.println(o);
		
		Pessoa p1 = new Pessoa();
		Operario o1 = new Operario("");
		
		metodoQueEsperaPai(p1);
		metodoQueEsperaPai(o1);
		
		Operario o2 = (Operario) p1;
		metodoQueEsperaFilho(o2);
		metodoQueEsperaFilho(o1);
	}
	
	private static void metodoQueEsperaPai(Pessoa p) {
		//qualquer coisa
	}
	private static void metodoQueEsperaFilho(Operario p) {
		//qualquer coisa
	}

}
