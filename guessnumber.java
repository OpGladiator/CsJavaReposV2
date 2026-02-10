

import java.util.Scanner;
//Class name must match file name

public class guessnumber
{
	//main is a method
	public static void main(String[] args)
	{		
		//declaring the space in memory and this line is a variable
		
		final int RANDOM_MULTIPLIER = 100;
// math random chooses a random postive number between 0 and a set value and number is a variable
		int number = (int) (Math.random() * RANDOM_MULTIPLIER) + 1;
// anything said after in is being declared keyboard input is a variable that changes depending on what you type
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("Guess a magic number between 0 and 100");

		int guess = -1;
		while (guess != number)
		{

			System.out.print("\nEnter your guess: ");
			guess = keyboardInput.nextInt();

			if (guess == number) 
			{
				System.out.println("Yes, the number is " + number);
			}
			else if (guess > number)
			{
				System.out.println("Your guess is too high");
			}
			else
			{
				System.out.println("Your guess is too low");
			}
		}
		keyboardInput.close();


	}//end of main
}//end of class
