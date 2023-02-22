import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Circulo_DVGCTest {

	@Test
	public void testArea() {
		Circulo_DVGC c1 = new Circulo_DVGC(7, "Círculo 1");
		assertEquals(153.9384, c1.area(), 0.0001);
		
		Circulo_DVGC c2 = new Circulo_DVGC(0, "Círculo 2");
		assertEquals(0.0, c2.area(), 0.0);
		
		Circulo_DVGC c3 = new Circulo_DVGC(-3, "Círculo 3");
		assertEquals(28.2743, c3.area(), 0.0001);
	}

	@Test
	public void testPerimetro() {
		Circulo_DVGC c1 = new Circulo_DVGC(7, "Círculo 1");
		assertEquals(43.9823, c1.perimetro(), 0.0001);
		
		Circulo_DVGC c2 = new Circulo_DVGC(0, "Círculo 2");
		assertEquals(0.0, c2.perimetro(), 0.0);
		
		Circulo_DVGC c3 = new Circulo_DVGC(-3, "Círculo 3");
		assertEquals(18.8495, c3.perimetro(), 0.0001);
	}

}
