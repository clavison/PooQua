package heranca;

public class Pediatra extends Medico{
	
	private int idadeMax;

	public int getIdadeMax() {
		return idadeMax;
	}

	public void setIdadeMax(int idadeMax) {
		this.idadeMax = idadeMax;
	}
	
	@Override
	public void consultar() {
		System.out.println("Consultandinho");
	}

}
