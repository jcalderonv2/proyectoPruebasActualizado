package ac.cr.cenfotec.logica.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import ac.cr.cenfotec.logica.CalculadoraSalarial;
import ac.cr.cenfotec.logica.TipoEmpleado;

public class TipoEmpleadoTest {

	CalculadoraSalarial cal;

	@Before
	public void init() {

		cal = new CalculadoraSalarial();

	}

	@Test
	public void testVendedores() {

		assertEquals(1360.0f, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 2000, 8), 0.1f);
		assertEquals(1260.0f, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500, 3), 0.1f);
		assertEquals(1100.0f, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1499.99f, 0), 0.1f);

	}
	
	
	@Test
	public void testEncargados() {
		
		assertEquals(1760.0f, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1250, 8), 0.1f);
		assertEquals(1600, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 1000, 0), 0.1f);
		assertEquals(1560, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 999.99f, 3), 0.1f);
		assertEquals(1500, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 500, 0), 0.1f);
		assertEquals(1660, cal.calculaSalarioBruto(TipoEmpleado.ENCARGADO, 0, 8), 0.1f);
		
	}
	
	@Test (expected = AssertionError.class)
	public void testExceptionVendedor() {
		
		assertEquals(1660.0f, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, -1, 8), 0.1f);
		assertEquals(1660.0f, cal.calculaSalarioBruto(TipoEmpleado.VENDEDOR, 1500, -1), 0.1f);
		assertEquals(1660.0f, cal.calculaSalarioBruto(null, -1, 8), 0.1f);
		
	}

}
















