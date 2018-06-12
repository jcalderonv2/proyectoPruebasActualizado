package cr.ac.cenfotec.kata.test;

import static org.junit.Assert.*;

import org.junit.Test;

import cr.ac.cenfotec.kata.CalculadoraHileras;

public class calculadoraHilerasTest {

	CalculadoraHileras calc = new CalculadoraHileras();

	@Test
	public void testStringVacio() throws Exception {

		assertEquals(0, calc.add(""));

	}

	@Test
	public void sumaSimple() throws Exception {

		assertEquals(1, calc.add("0,1"));
		assertEquals(3, calc.add("0:1,2"));

	}

	@Test
	public void testErrorNumeroParametros() {

		assertEquals(2, calc.add("1,1"));

	}

	@Test
	public void testUnNumero() throws Exception {

		assertEquals(1, calc.add("1"));
		assertEquals(2, calc.add("2"));

	}
	
	@Test(expected = NumberFormatException.class)
	public void testSeparadores() throws Exception {
				
		assertEquals(1, calc.add("0-1"));
		
	}

}
