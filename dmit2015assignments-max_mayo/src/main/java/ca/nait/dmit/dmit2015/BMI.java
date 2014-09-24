package ca.nait.dmit.dmit2015;

/**
 * This class is use to calculate a person's body mass index (BMI) and their BMI Category.
 * @author Max Mayo
 * @version 2014.09.23
 */

public class BMI {
	private int weight;
	private int height;
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public BMI() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BMI(int weight, int height) {
		super();
		this.weight = weight;
		this.height = height;
	}
	
	/**
	 * Calculate the body mass index (BMI) using the weight and height of the person.
	 * The BMI of a person is calculated using the formula: BMI = 700 * weight / (height * height)
	 * where weight is in pounds and height is in inches. 
	 * @return the body mass index (BMI) value of the person
	 */
	public double GetBMI() {
		double BMI = ((703 * weight)/(Math.pow(height, 2)));
		
		return BMI;		
	}
	
	/**
	 * Determines the BMI Category of the person using their BMI value and comparing
	 * it against the following table.
	 * -----------------------------------------
	 * | BMI range			    | BMI Category |
	 * |---------------------------------------|
	 * | < 18.5 			    | underweight  |
	 * | >= 18.5 and < 25		| normal	   |
	 * | >= 25 and < 30			| overweight   |
	 * | >= 30					| obese		   |
	 * -----------------------------------------
	 * @return one of following: underweight, normal, overweight, obese.
	 */
	public String GetBMICategory() {
		String Category = null;
		double BMI = GetBMI();
		if (BMI < 18.5)
		{
			Category = "Underweight";
		}
		else if (BMI >= 18.5 && BMI <= 24.9)
		{
			Category = "Normal";
		}
		else if (BMI >= 25 && BMI <= 29.9)
		{
			Category = "Overweight";
		}
		else if (BMI >= 30)
		{
			Category = "Obese";
		}
		
		return Category;		
	}
}
