package heranca.construtores;

public class Pessoa {
	
	private String nome = "";
	private double salario;
	
	public Pessoa() {
		if(nome.startsWith("A")) {
			salario = 1000;
		}else {
			if(nome.startsWith("B")) {
				salario = 2000;
			}else {
				salario = 10000;
			}
		}
	}
	
	@Override
	public String toString() {
		return getNome() + " - R$ " + getSalario();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	

}
