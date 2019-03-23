package ornekmavenproje;

import org.junit.*;
import static org.junit.Assert.*; 

public class hesapTest {
	
	@Test
	public void testTopla() {
		
		hesap h =new hesap();
		int sonuc = h.topla(345, 453);
		assertEquals(798,sonuc);
		
	}
	@Test
	public void testfaktöriyel() {
		
		hesap h =new hesap();
		int sonuc = h.faktoriyel(10);
		assertEquals(3628800,sonuc);		
	}
	

	@Test
	public void testcıkarma() {
		
		hesap h =new hesap();
		int sonuc = h.cıkarma(100, 50);
		assertEquals(50,sonuc);
		
	}

	@Test
	public void testcarpma() {
		
		hesap h =new hesap();
		int sonuc = h.carpma(10, 10);
		assertEquals(100,sonuc);
		
	}

	@Test
	public void testbolme() {
		
		hesap h =new hesap();
		double sonuc = h.bolme(150, 3);
		assertEquals(50.00,sonuc,2);
		
	}

}
