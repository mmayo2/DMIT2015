package ca.nait.dmit.dmit2015;

import static org.junit.Assert.*;

import java.util.Calendar;

import org.junit.Test;

public class ChineseZodiacTest {
	
	public static final int CURRENT_YEAR = Calendar.getInstance().get( Calendar.YEAR );

	  @Test
	  public void testCurrentYear()
	  {
		ChineseZodiac chineseZodiacBean = new ChineseZodiac(2012);
		assertEquals("Dragon", chineseZodiacBean.GetAnimal());
	  }

	  @Test
	  public void testGetAnimalRat()
	  {
		int animalYear = 1900;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Rat", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalOx()
	  {
		int animalYear = 1901;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Ox", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalTiger()
	  {
		int animalYear = 1902;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Tiger", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalRabbit()
	  {
		int animalYear = 1903;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Rabbit", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalDragon()
	  {
		int animalYear = 1904;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Dragon", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalSnake()
	  {
		int animalYear = 1905;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Snake", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalHorse()
	  {
		int animalYear = 1906;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Horse", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalGoat()
	  {
		int animalYear = 1907;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Goat", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalMonkey()
	  {
		int animalYear = 1908;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Monkey", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalRooster()
	  {
		int animalYear = 1909;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Rooster", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalDog()
	  {
		int animalYear = 1910;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Dog", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	  @Test
	  public void testGetAnimalPig()
	  {
		int animalYear = 1911;
		ChineseZodiac chineseZodiacBean = null;
		while (animalYear <= CURRENT_YEAR)
		{
		  chineseZodiacBean = new ChineseZodiac(animalYear);
		  assertEquals("Pig", chineseZodiacBean.GetAnimal());
		  animalYear += 12;
		}
	  }

	@Test
	public void testGetZodiacBase() {
		ChineseZodiac zodiac = new ChineseZodiac(1900);
		assertTrue(zodiac.GetAnimal().equalsIgnoreCase("rat"));
	}
	
	@Test
	public void testGetZodiacMidcycle() {
		ChineseZodiac zodiac = new ChineseZodiac(1942);
		assertTrue(zodiac.GetAnimal().equalsIgnoreCase("horse"));
	}

	@Test
	public void testGetZodiacCurrent() {
		ChineseZodiac zodiac = new ChineseZodiac(2014);
		assertTrue(zodiac.GetAnimal().equalsIgnoreCase("horse"));
	}
	
	@Test
	public void testGetZodiacMine() {
		ChineseZodiac zodiac = new ChineseZodiac(1994);
		assertTrue(zodiac.GetAnimal().equalsIgnoreCase("dog"));
	}
	
	@Test
	public void testGetZodiacFriend() {
		ChineseZodiac zodiac = new ChineseZodiac(1989);
		assertTrue(zodiac.GetAnimal().equalsIgnoreCase("snake"));
	}
}
