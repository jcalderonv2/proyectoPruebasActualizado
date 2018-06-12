package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.AnnoBisiesto;

public class AnnoBisiestoTest {
	
	AnnoBisiesto bi;
	
	@Before
	public void init() {
		
		bi = new AnnoBisiesto();
		
	}

	@Test
	public void testSiBisiesto() {
		
		assertEquals(false, bi.isBisiesto(1900));
		
		
	}
	
	@Test
	public void testNoBisiesto() {
		
		assertEquals(true, bi.isBisiesto(2004));
		
		
	}
	

}
