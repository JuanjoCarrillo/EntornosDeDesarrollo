package Practica4;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class AritmeticaTest {
	Aritmetica a = new Aritmetica();
	float n;

	@Before
	void testSuma() {
		n=0;
	}

	@Test
	void testSumaPositiva() {
		System.out.println("Sumando numeros positivos");
		n = a.suma(10, 5);
		assertTrue(n == 15);
	}

	@Test
	void testSumaNegativa() {
		System.out.println("Sumando numeros negativos");
		float s = a.suma(-10, -10);
		assertTrue(s == -20);
	}

	@Test
	void testSumaPositivaYNegativa() {
		System.out.println("Sumando numeros positivos y negativos");
		float n = a.suma(10, -5);
		assertTrue(n == 5);
	}

	@Test
	void testRestaPositiva() {
		System.out.println("Restando numeros positivos");
		float n = a.resta(10, 5);
		assertTrue(n == 5);
	}

	@Test
	void testRestaNegatica() {
		System.out.println("Restando numeros negativos");
		float n = a.resta(-10, -5);
		assertTrue(n == -5);
	}

	@Test
	void testRestaPositivaYNegativa() {
		System.out.println("Restando numeros positivos y negativos");
		float n = a.resta(10, -5);
		assertTrue(n == 15);
	}

	@Test
	void testMultiplicacionPositiva() {
		System.out.println("Multiplicando numeros positivos");
		float n = a.multiplicacion(10, 5);
		assertTrue(n == 50);
	}

	@org.junit.jupiter.api.Test
	void testMultiplicacionNegativa() {
		System.out.println("Multiplicando numeros negativos");
		float n = a.multiplicacion(-10, -5);
		assertTrue(n == 50);
	}

	@Test
	void testMultiplicacionPositivaYNegativa() {
		System.out.println("Multiplicando numeros positivos y negativos");
		float n = a.multiplicacion(10, -5);
		assertTrue(n == -50);
	}

	@Test
	void testDivisionPositiva() {
		System.out.println("Dividiendo numeros positios");
		float n = a.division(10, 5);
		assertTrue(n == 2);
	}

	@Test
	void testDivisionNegativa() {
		System.out.println("Dividiendo numeros negativos");
		float n = a.division(-10, -5);
		assertTrue(n == 2);
	}

	@Test
	void testDivisionPositivaYNegativa() {
		System.out.println("Dividiendo numeros positios y negativos");
		float n = a.division(-10, -5);
		assertTrue(n == 2);
	}

	@Test
	public void testDivisionEntreCero() {
		System.out.println("Dividiendo numeros entre cero");
		float n = a.division(-10, 0);
		try {
			a.division(-10, 0);
		} catch (Exception e) {
			System.out.println("ERROR");
		}
	}

}
