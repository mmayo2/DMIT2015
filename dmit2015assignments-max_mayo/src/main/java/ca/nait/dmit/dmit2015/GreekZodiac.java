package ca.nait.dmit.dmit2015;
import java.util.Calendar;

/**
 * This class is use to calculate a person's greek zodiac based on their birth date and month.
 * @author Max Mayo
 * @version 2014.09.23
 */

public class GreekZodiac {
	
	private int birthMonth = Calendar.getInstance().get( Calendar.MONTH );
	private int birthDay = Calendar.getInstance().get( Calendar.DAY_OF_MONTH );
	public GreekZodiac() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GreekZodiac(int birthMonth, int birthDay) {
		super();
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	}
	public int getBirthMonth() {
		return birthMonth;
	}
	public void setBirthMonth(int birthMonth) {
		this.birthMonth = birthMonth;
	}
	public int getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(int birthDay) {
		this.birthDay = birthDay;
	}
	
	/**
	 * Get the appropriate Greek Zodiac for the birthyear by checking the birth date between the cut off points for each
	 * appropriate zodiac.
	 * @return the greek zodiac animal of the person
	 */
	public String GetZodiac() {
		String Zodiac = "";
		
		if ((birthMonth == 3 && birthDay >= 21) || (birthMonth == 4 & birthDay <= 20))
		{
			Zodiac = "Aries";
		}
		else if ((birthMonth == 4 && birthDay >= 21) || (birthMonth == 5 && birthDay <= 20))
		{
			Zodiac = "Taurus";
		}
		else if ((birthMonth == 5 && birthDay >= 21) || (birthMonth == 6 && birthDay <= 21))
		{
			Zodiac = "Gemini";
		}
		else if ((birthMonth == 6 && birthDay >= 22) || (birthMonth == 7 && birthDay <= 22))
		{
			Zodiac = "Cancer";
		}
		else if ((birthMonth == 7 && birthDay >= 23) || (birthMonth == 8 && birthDay <= 22))
		{
			Zodiac = "Leo";
		}
		else if ((birthMonth == 8 && birthDay >= 23) || (birthMonth == 9 && birthDay <= 22))
		{
			Zodiac = "Virgo";
		}
		else if ((birthMonth == 9 && birthDay >= 23) || (birthMonth == 10 && birthDay <= 22))
		{
			Zodiac = "Libra";
		}
		else if ((birthMonth == 10 && birthDay >= 23) || (birthMonth == 11 && birthDay <= 21))
		{
			Zodiac = "Scorpio";
		}
		else if ((birthMonth == 11 && birthDay >= 22) || (birthMonth == 12 && birthDay <= 21))
		{
			Zodiac = "Sagittarius";
		}
		else if ((birthMonth == 12 && birthDay >= 22) || (birthMonth == 1 && birthDay <= 19))
		{
			Zodiac = "Capricorn";
		}
		else if ((birthMonth == 1 && birthDay >= 20) || (birthMonth == 2 && birthDay <= 18))
		{
			Zodiac = "Aquarius";
		}
		else if ((birthMonth == 2 && birthDay >= 19) || (birthMonth == 3 && birthDay <= 20))
		{
			Zodiac = "Pisces";
		}
		
		return Zodiac;
	}
}
