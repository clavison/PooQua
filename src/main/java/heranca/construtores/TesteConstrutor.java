package heranca.construtores;

public class TesteConstrutor {
	
	public static void main(String[] args) {
		Operario o = new Operario("Ana");
		System.out.println(o);
		
		Pessoa p1 = new Pessoa();
		Operario o1 = new Operario("");
		
		metodoQueEsperaPai(p1);
		metodoQueEsperaPai(o1);
		
		
		metodoQueEsperaFilho(o1);
		//metodoQueEsperaFilho(p1);
		
		Operario o3 = (Operario) p1;
		metodoQueEsperaFilho(o3);
	}
	
	private static void metodoQueEsperaPai(Pessoa p) {
		//qualquer coisa
	}
	private static void metodoQueEsperaFilho(Operario p) {
		//qualquer coisa
	}

}
