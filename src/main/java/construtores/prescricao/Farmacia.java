package construtores.prescricao;

import java.util.ArrayList;

public class Farmacia {
	
	private ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	private ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();
	private ArrayList<Prescricao> prescricoes = new ArrayList<Prescricao>();
	
	public ArrayList<Prescricao> getPrescricoes() {
		return prescricoes;
	}
	public ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	public ArrayList<Medicamento> getMedicamentos() {
		return medicamentos;
	}
	
	public void adicionaPaciente(Pessoa p) {
		pessoas.add(p);
	}
	
	public void adicionaMedicamentos(Medicamento m) {
		medicamentos.add(m);
	}


	public boolean prescreverMedicamento(Pessoa p, Medicamento m) {
		for (String indicacao : m.getIndicacoes()) {
			if(indicacao.equalsIgnoreCase(p.getSintoma())) {
				prescricoes.add(new Prescricao(p, m));
				return true;
			}
		}
		return false;
	}
	
	public String medicamentosPorPessoa(String nome) {
		String ret = "";
		for (Prescricao presc : prescricoes) {
			if(presc.getPessoa().getNome().equalsIgnoreCase(nome) ) {
				ret += presc.getMedicamento();
			}
		}
		return ret;
	}

}
