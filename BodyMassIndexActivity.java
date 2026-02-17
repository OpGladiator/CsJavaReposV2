import java.util.Scanner;

/**
 * Calculate the BMI using formula in US units. 
 * User will enter weight in pounds and height in inches
 */

// ADD CODE to import Scanner class

public class BodyMassIndexActivity
{
	public static void main(String[] args)
	{
		Scanner keyboardInput = new Scanner(System.in);
		
		//Create constants and an variables

		// constants
		 // factor formula in pounds
		// Variables
		
		// The user's weight
		double weight = 0;
		// The user's height
		double height = 0;
		 // The user's BMI
		double BMI = 0;
		 String Status = "Unknown";

		// Create a Scanner object for scanning input from keyboard

		// Tell the user what the program will do.
		System.out.println("This program will calculate your " + "body mass index, or BMI.");
	

		// Get the user's weight.
		System.out.println("Enter your weight, in pounds: ");
		// ADD CODE to input next double for weight
		weight = keyboardInput.nextDouble();
		// Get the user's height.
		System.out.println("Enter your height, in inches: ");
		// ADD CODE input next double for height
		height = keyboardInput.nextDouble();

		// Calculate the user's body mass index.
		//bmi = weight * BMI_US_FACTOR / (height * height);
		 BMI =( weight / (height * height) * 703);
		// Display the user's BMI.
			System.out.println("Wieght: " + weight + "    Height: " + height);

		System.out.println("Your body mass index (BMI) is " + BMI);
		 if (BMI >= 30) 
			{
		    	 Status = "Obease";
				System.out.println("Your category: Obease");
			}
		     else if (BMI >= 25 && BMI <= 30) {
		    	 Status = "Overwieght";
		        System.out.println("Your category: Overwieght");}
		     else if (BMI >= 18.5 && BMI < 25) {
		    	  Status = "Normal";
		         System.out.println("Your category: Normal");}
		     else if (BMI < 18.5) {
		    	  Status = "Underwieght";
		         System.out.println("Your category: Underwieght");}
	    keyboardInput.close();

	}
}