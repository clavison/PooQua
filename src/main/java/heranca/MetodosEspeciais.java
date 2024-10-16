package heranca;

public class MetodosEspeciais {
	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setNome("A");
		p1.setIdade(9);
		
		Pessoa p2 = new Pessoa();
		p2.setNome("A");
		p2.setIdade(1);
		
		System.out.println(p1.equals(p2));
		
		Pessoa p3 = p1.clone();
		System.out.println(p3.equals(p1));
		p3.setNome("XXX");
		System.out.println(p3.equals(p1));
		
		
		System.out.println();
		
		System.out.println("CompareTo");
		System.out.println(p2.compareTo(p1));
	}

}
