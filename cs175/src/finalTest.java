
import java.util.Scanner;
public class finalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		//1-A range of numbers
		
		System.out.print("Please enter a minimum value: ");
		int newMin = in.nextInt();
		System.out.print("Please enter a maximum value: ");
		int newMax = in.nextInt();
		int sum = 0;
		while (newMax > newMin) {
			sum = newMax+sum;
			newMax--;
		}
		System.out.println("The sum of all the numbers are " + sum);
		
		
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		//2-A factorial
		System.out.print("Please enter an integer: ");
		int factorial = 1;
		for (int number = in.nextInt(); number > 0; number--)
			factorial = number * factorial;
		System.out.println("The factorial is " + factorial);
			
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		//3-A palindrome
		
		System.out.print("Please enter a word: ");
		String word = in.next();
		
		//check to see if the characters reflect the characters that are respective. For example, in madam, check to see if the first character matches the last character. 
		//you can achieve this be doing CharAt, using 0 as the starting position and then using String.length -1 for the postion of the last character.
		//for example, madam, 0 character is 'm' and the length of the string is 5, -1 is 4 which means that the character at position 4 would be tested
		//to see if its equal to the first character, which in this case it does. It would then move on to the next positions, 0 changing to the character
		// at the first position and then the length -2
				
				
		
		
		
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		//4-A prime number
		
		System.out.print("Please enter a value to see if its prime: ");
		int number1 = in.nextInt();
		boolean prime = false;
		for (int i = 2; number1 <= number1/2; i++)
			
			//(prime % i = 0)
				
		//if number divided by 2 yields a remainder or a decimal than the number is not prime
		
				   
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		//5-A
		System.out.println("Please enter a set of numbers: ");
		
		
		
		System.out.println("-----------------------------------------------------------------------------------------------------------------");
		//6-A
		double upperClassPercent = .25;
		double middleClassPercent = .15;
		double lowerClassPercent = .1;
		int middleClassCap = 32000;
		int lowerClassCap = 8000;
		int upperClassGap = 4400;
		int middleClassGap = 800;
		int timesTwo = 2;

		System.out.print("Are you single (enter 'S')or married (enter 'M')?");
		String maritalStatus = in.next();
		
		
		if (maritalStatus.equals("S")) {
			System.out.print("You are single. Please enter your income: ");
			int income = in.nextInt();
			if (income > middleClassCap)
				System.out.print("The tax you must pay is $" + (((income-middleClassCap) * upperClassPercent) + upperClassGap));
			else if(income > lowerClassCap)
				System.out.print("The tax you must pay is $" + (((income-lowerClassCap) * middleClassPercent) + middleClassGap));
			else
				System.out.print("The tax you must pay is $" + (income*lowerClassPercent));
		}
		else if (maritalStatus.equals("M")) {
			System.out.print("You are married. Please enter your income: ");
			int mincome = in.nextInt();
			if (mincome > (middleClassCap * timesTwo))
				System.out.print("The tax you must pay is $" + (((mincome-(middleClassCap * timesTwo)) * upperClassPercent) + (upperClassGap * timesTwo)));
			else if (mincome > (lowerClassCap * timesTwo))
				System.out.print("The tax you must pay is $" + (((mincome-(lowerClassCap * timesTwo)) * middleClassPercent) + (middleClassGap * timesTwo)));
			else
				System.out.print("The tax you must pay is $" + (mincome * (lowerClassPercent * timesTwo)));
		}
			
	}

}
