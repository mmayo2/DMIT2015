package ca.nait.dmit.dmit2015;
import java.util.Calendar;

/**
 * This class is use to calculate a person's chinese zodiac based on their birth year.
 * @author Max Mayo
 * @version 2014.09.23
 */

public class ChineseZodiac {

	private int birthYear = Calendar.getInstance().get( Calendar.YEAR );

	public ChineseZodiac() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ChineseZodiac(int birthYear) {
		super();
		this.birthYear = birthYear;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	/**
	 * Get the appropriate Chinese Zodiac for the birthyear by subtracting 1900 from the birthyear,
	 * then modulus 12. 
	 * @return the chinese zodiac animal of the person
	 */
	public String GetAnimal() {
		String Animal = "";
		int Offset = (birthYear - 1900)%12;
		
		if (Offset == 0)
		{
			Animal = "Rat";
		}
		else if (Offset == 1)
		{
			Animal = "Ox";
		}
		else if (Offset == 2)
		{
			Animal = "Tiger";
		}
		else if (Offset == 3)
		{
			Animal = "Rabbit";
		}
		else if (Offset == 4)
		{
			Animal = "Dragon";
		}
		else if (Offset == 5)
		{
			Animal = "Snake";
		}
		else if (Offset == 6)
		{
			Animal = "Horse";
		}
		else if (Offset == 7)
		{
			Animal = "Goat";
		}
		else if (Offset == 8)
		{
			Animal = "Monkey";
		}
		else if (Offset == 9)
		{
			Animal = "Rooster";
		}
		else if (Offset == 10)
		{
			Animal = "Dog";
		}
		else if (Offset == 11)
		{
			Animal = "Pig";
		}
		
		return Animal;
	}
}
