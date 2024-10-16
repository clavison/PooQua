package prova2;

public class Q2 {
	
	public static void main(String[] args) {
		ProgramaTv p1 = new ProgramaTv();
		ProgramaTv p2 = new ProgramaTv(2.5);
		ProgramaTv p3 = new ProgramaTv("Jornal Nacional", 9.0);
		System.out.println(p1);//2a
		System.out.println(p2);//2b
		System.out.println(p3);//2c
		p2.setNota(5.5);
		System.out.println(p2);//2d
		p1.setApresentador(new Apresentador("X", 'M'));
		System.out.println(p1);//2e
	}

}
