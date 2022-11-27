package piglatinlab;

import static org.junit.Assert.*;

import org.junit.Test;

public class IgpayAtinLayTest {

	@Test
	public void apple() {
		String translatedName = IgpayAtinLay.translate("apple");
		assertEquals("appleway", translatedName);
	}
	
	@Test
	public void elephant() {
		String translatedName = IgpayAtinLay.translate("elephant");
		assertEquals("elephantway", translatedName);
	}

	@Test
	public void imminent() {
		String translatedName = IgpayAtinLay.translate("imminent");
		assertEquals("imminentway", translatedName);
	}
	
	@Test
	public void olive() {
		String translatedName = IgpayAtinLay.translate("olive");
		assertEquals("oliveway", translatedName);
	}
	
	@Test
	public void umbrella() {
		String translatedName = IgpayAtinLay.translate("umbrella");
		assertEquals("umbrellaway", translatedName);
	}
	
	@Test
	public void potato() {
		String translatedName = IgpayAtinLay.translate("potato");
		assertEquals("otatopay", translatedName);
	}
	
	@Test
	public void butter() {
		String translatedName = IgpayAtinLay.translate("butter");
		assertEquals("utterbay", translatedName);
	}
	
	@Test
	public void green() {
		String translatedName = IgpayAtinLay.translate("green");
		assertEquals("eengray", translatedName);
	}
	
	@Test
	public void three() {
		String translatedName = IgpayAtinLay.translate("three");
		assertEquals("eethray", translatedName);
	}
	
	@Test
	public void PURple() {
		String translatedName = IgpayAtinLay.translate("PURple");
		assertEquals("urplepay", translatedName);
	}
}
