package construtores.matriculas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SistemaAcademicoTest {
	
	private SistemaAcademico sistema = new SistemaAcademico();
	
	@BeforeEach
	void inicializa() {
		sistema.getProfessores().clear();
		sistema.getDisciplinas().clear();
		sistema.getAlunos().clear();
		sistema.getMatriculas().clear();
		
		sistema.cadastraProfessor("Prof1", 1);
		sistema.cadastraProfessor("Prof2", 2);
		sistema.cadastraProfessor("Prof3", 3);
		
		sistema.cadastraDisciplina("D1", 30, sistema.getProfessores().get(0));
		sistema.cadastraDisciplina("D2", 30, sistema.getProfessores().get(1));
		sistema.cadastraDisciplina("D3", 30, sistema.getProfessores().get(2));
		
		sistema.cadastraAluno("Aluno1");
		sistema.cadastraAluno("Aluno2");
	}
	
	@Test
	void cadastraProfessorTest() {
		sistema.cadastraProfessor("Fulano", 2);
		assertEquals(4, sistema.getProfessores().size());
		assertEquals("Fulano", sistema.getProfessores().get(3).getNome());
		assertEquals(2, sistema.getProfessores().get(3).getFormacao());
	}
	
	@Test
	void cadastraDisciplinaTest() {
		sistema.cadastraDisciplina("D4", 50, sistema.getProfessores().get(0));
		assertEquals(4, sistema.getDisciplinas().size());
	}
	
	@Test
	void cadastraAlunoTest() {
		sistema.cadastraAluno("Aluno3");
		assertEquals(3, sistema.getAlunos().size());
	}
	
	@Test
	void matriculaTest() {
		sistema.fazMatricula(sistema.getAlunos().get(0), sistema.getDisciplinas().get(0));
		sistema.fazMatricula(sistema.getAlunos().get(0), sistema.getDisciplinas().get(1));
		sistema.fazMatricula(sistema.getAlunos().get(0), sistema.getDisciplinas().get(2));
		
		sistema.fazMatricula(sistema.getAlunos().get(1), sistema.getDisciplinas().get(0));
		sistema.fazMatricula(sistema.getAlunos().get(1), sistema.getDisciplinas().get(1));
		
		assertEquals(5, sistema.getMatriculas().size());
		
		sistema.cadastraNotas(sistema.getMatriculas().get(0), 3, 3, 3);
		sistema.cadastraNotas(sistema.getMatriculas().get(1), 5, 6, 7);
		sistema.cadastraNotas(sistema.getMatriculas().get(2), 9, 9, 9);
		
		assertEquals(3.0, sistema.getMatriculas().get(0).getMedia());
		assertEquals(6.0, sistema.getMatriculas().get(1).getMedia());
		assertEquals(9.0, sistema.getMatriculas().get(2).getMedia());
		
		String disc = sistema.listaDisciplinasAluno(sistema.getAlunos().get(1));
		assertEquals("D1 - 0.0\nD2 - 0.0\n", disc);
	}
	
	@Test
	void disciplinaTest() {
		String ret = sistema.listaDisciplinaPos();
		assertEquals("D3\n", ret);
	}

}
