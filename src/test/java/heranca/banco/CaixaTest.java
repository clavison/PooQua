package heranca.banco;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CaixaTest {
	
	private ArrayList<Conta> contas = new ArrayList<Conta>();
	
	@BeforeEach
	void inicializa() {
		contas.clear();
		contas.add(new ContaCorrente(1, 1));
		contas.add(new ContaCorrente(2, 2));
		contas.add(new ContaEspecial(3, 1, 1000));
		contas.add(new ContaEspecial(4, 2, 100));
		contas.add(new ContaUniversitaria(5, 1));
		contas.add(new ContaUniversitaria(6, 2));
	}

	@Test
	void Depositotest() {
		contas.get(0).deposito(500);
		contas.get(2).deposito(500);
		contas.get(4).deposito(500);
		assertEquals(500.00, contas.get(0).getSaldo());
		assertEquals(500.00, contas.get(2).getSaldo());
		assertEquals(500.00, contas.get(4).getSaldo());
		contas.get(4).deposito(2000);
		assertEquals(500.00, contas.get(4).getSaldo());
	}
	
	@Test
	void saqueTest() {
		contas.get(0).deposito(500);
		contas.get(2).deposito(500);
		contas.get(4).deposito(500);
		
		contas.get(0).saque(300);
		contas.get(2).saque(300);
		contas.get(4).saque(300);
		
		assertEquals(200.00, contas.get(0).getSaldo());
		assertEquals(200.00, contas.get(2).getSaldo());
		assertEquals(200.00, contas.get(4).getSaldo());
		
		contas.get(0).saque(300);
		contas.get(2).saque(300);
		contas.get(4).saque(300);
		
		assertEquals(200.00, contas.get(0).getSaldo());
		assertEquals(-100.00, contas.get(2).getSaldo());
		assertEquals(200.00, contas.get(4).getSaldo());
		
		contas.get(2).saque(1000);
		assertEquals(-100.00, contas.get(2).getSaldo());
	}
	
	@Test
	void transferenciaPossivelTest() {
		contas.get(0).deposito(500);
		contas.get(2).deposito(500);
		
		contas.get(0).transferencia(300, contas.get(2));
		
		assertEquals(200.00, contas.get(0).getSaldo());
		assertEquals(800.00, contas.get(2).getSaldo());
	}
	
	@Test
	void transferenciaErroAgenciaTest() {
		contas.get(0).deposito(500);
		contas.get(1).deposito(500);
		
		contas.get(0).transferencia(300, contas.get(1));
		
		assertEquals(500.00, contas.get(0).getSaldo());
		assertEquals(500.00, contas.get(1).getSaldo());
	}
	
	@Test
	void transferenciaOrigemSemSaldoTest() {
		contas.get(0).transferencia(300, contas.get(1));
		assertEquals(0.00, contas.get(0).getSaldo());
		assertEquals(0.00, contas.get(1).getSaldo());
	}
	
	@Test
	void transferenciaDestinoUltrapassaLimiteTest() {
		contas.get(0).deposito(5000);
		contas.get(0).transferencia(3000, contas.get(4));
		assertEquals(5000.00, contas.get(0).getSaldo());
		assertEquals(0.00, contas.get(4).getSaldo());
	}

}
