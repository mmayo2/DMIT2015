package ca.nait.dmit.dmit2015;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreekZodiacTest {

	@Test
	public void testGetZodiacAries() {
		GreekZodiac greekzodiacbean = new GreekZodiac(3, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("aries"));
	}
	
	@Test
	public void testGetZodiacTaurus() {
		GreekZodiac greekzodiacbean = new GreekZodiac(4, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("taurus"));
	}

	@Test
	public void testGetZodiacGemini() {
		GreekZodiac greekzodiacbean = new GreekZodiac(5, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("gemini"));
	}
	
	@Test
	public void testGetZodiacCancer() {
		GreekZodiac greekzodiacbean = new GreekZodiac(6, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("cancer"));
	}
	
	@Test
	public void testGetZodiacLeo() {
		GreekZodiac greekzodiacbean = new GreekZodiac(7, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("leo"));
	}
	
	@Test
	public void testGetZodiacVirgo() {
		GreekZodiac greekzodiacbean = new GreekZodiac(8, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("virgo"));
	}
	
	@Test
	public void testGetZodiacLibra() {
		GreekZodiac greekzodiacbean = new GreekZodiac(9, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("libra"));
	}
	
	@Test
	public void testGetZodiacScorpio() {
		GreekZodiac greekzodiacbean = new GreekZodiac(10, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("scorpio"));
	}
	
	@Test
	public void testGetZodiacSagittarius() {
		GreekZodiac greekzodiacbean = new GreekZodiac(11, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("sagittarius"));
	}
	
	@Test
	public void testGetZodiacCapricorn() {
		GreekZodiac greekzodiacbean = new GreekZodiac(12, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("capricorn"));
	}
	
	@Test
	public void testGetZodiacAquarius() {
		GreekZodiac greekzodiacbean = new GreekZodiac(1, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("aquarius"));
	}
	
	@Test
	public void testGetZodiacPisces() {
		GreekZodiac greekzodiacbean = new GreekZodiac(2, 29);
		assertTrue(greekzodiacbean.GetZodiac().equalsIgnoreCase("pisces"));
	}
}
