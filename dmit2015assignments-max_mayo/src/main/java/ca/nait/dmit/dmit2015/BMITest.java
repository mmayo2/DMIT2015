package ca.nait.dmit.dmit2015;

import static org.junit.Assert.*;

import org.junit.Test;

public class BMITest {

	@Test
	  public void testGetBMIUnderweigth()
	  {
		BMI bmi = new BMI(110, 5 * 12 + 6);
		assertEquals(17.8, bmi.GetBMI(), 0.05);
		assertTrue(bmi.GetBMICategory().equalsIgnoreCase("underweight"));
	  }

	  @Test
	  public void testGetBMINormal()
	  {
		BMI bmi = new BMI(150, 5 * 12 + 6);
		assertEquals(24.2, bmi.GetBMI(), 0.05);
		assertTrue(bmi.GetBMICategory().equalsIgnoreCase("normal"));
	  }

	  @Test
	  public void testGetBMIOverweight()
	  {
		BMI bmi = new BMI(165, 5 * 12 + 6);
		assertEquals(26.6, bmi.GetBMI(), 0.05);
		assertTrue(bmi.GetBMICategory().equalsIgnoreCase("overweight"));
	  }

	  @Test
	  public void testGetBMIObese()
	  {
		BMI bmi = new BMI(190, 5 * 12 + 6);
		assertEquals(30.7, bmi.GetBMI(), 0.05);
		assertTrue(bmi.GetBMICategory().equalsIgnoreCase("obese"));
	  }
	  
	  @Test
	  public void testGetBMIMe()
	  {
		BMI bmi = new BMI(149, 5 * 12 + 11);
		assertEquals(20.8, bmi.GetBMI(), 0.05);
		assertTrue(bmi.GetBMICategory().equalsIgnoreCase("normal"));
	  }

}
