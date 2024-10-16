package prova2;

public class Q3 {
	
	public static void main(String[] args) {
		Emissora e = new Emissora();
		System.out.println(e);
		for (ProgramaTv p : e.getProgramas()) {
			System.out.println(p);
		}
		//Serão impressas 4 linhas: 3a, 3b, 3c e 3d
	}

}
