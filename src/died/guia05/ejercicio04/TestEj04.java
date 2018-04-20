package died.guia05.ejercicio04;

import junit.framework.TestCase;


public class TestEj04 extends TestCase{

	public void test(){
		
		Ciudad c1 = new Ciudad("Santa fe", 3000);
		Ciudad c2 = new Ciudad("Parana", 3100);
		Ciudad c3 = new Ciudad("Santo tome", 3000);
		
		assertTrue(c1.equals(c3));
		assertFalse(c1.equals(c2));
	}
	
}
