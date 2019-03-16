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
	
	
	
}
