package Practica5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TemperaturaTest {
	Temperatura t = new Temperatura();

	@Test
	void testFahrenheitACelsius1() {
		System.out.println("Convirtiendo fahrenheit a celsius 1");
		float n = t.FahrenheitACelsius(-5);
		assertTrue(n == -20.555555F);
	}

	@Test
	void testFahrenheitACelsius2() {
		System.out.println("Convirtiendo fahrenheit a celsius 2");
		float n = t.FahrenheitACelsius(0);
		assertTrue(n == -17.777779F);
	}

	@Test
	void testFahrenheitACelsius3() {
		System.out.println("Convirtiendo fahrenheit a celsius 3");
		float n = t.FahrenheitACelsius(15);
		assertTrue(n == -9.444445F);
	}

	@Test
	void testFahrenheitACelsius4() {
		System.out.println("Convirtiendo fahrenheit a celsius 4");
		float n = t.FahrenheitACelsius(32);
		assertTrue(n == 0.0F);
	}

	@Test
	void testCelsiusAFharenheit1() {
		System.out.println("Convirtiendo celsius a fahrenheit 1");
		float n = t.CelsiusAFahrenheit(-5);
		assertTrue(n == 23);
	}

	@Test
	void testCelsiusAFharenheit2() {
		System.out.println("Convirtiendo celsius a fahrenheit 2");
		float n = t.CelsiusAFahrenheit(0);
		assertTrue(n == 32);
	}

	@Test
	void testCelsiusAFharenheit3() {
		System.out.println("Convirtiendo celsius a fahrenheit 3");
		float n = t.CelsiusAFahrenheit(15);
		assertTrue(n == 59);
	}

	@Test
	void testCelsiusAFharenheit4() {
		System.out.println("Convirtiendo celsius a fahrenheit 4");
		float n = t.CelsiusAFahrenheit(32);
		assertTrue(n == 89.6F);
	}

}
