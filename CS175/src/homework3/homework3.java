package homework3;

import java.util.Scanner;

public class homework3 {

	public static void main(String[] args) {
		//This is 5.1
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter a number: ");
		int x= in.nextInt();
	
		String negZeroPos = "";
		
		if (x < 0.0)
			negZeroPos = "negative number";
		else if (x == 0.0)
			negZeroPos = "zero";
		else 
			negZeroPos = "positive number";
		
		System.out.println (x + " is a " + negZeroPos );

		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.2
		
		System.out.print("Please enter a number: ");
		float numberFraction = in.nextFloat();
		
		String posZeroNeg = "";
		
		if (numberFraction > 1000000.0)
			posZeroNeg = "large positive number";
		else if (numberFraction > 1.0)
			posZeroNeg = "positive number";
		else if (numberFraction > 0.0)
			posZeroNeg = "small positive number";
		else if (numberFraction == 0.0)
			posZeroNeg = "0";
		else if (numberFraction > -1.0)
			posZeroNeg = "small negative number";
		else if (numberFraction > -1000000.0)
			posZeroNeg = "negative number";
		else
			posZeroNeg = "large negative number";
		System.out.println(numberFraction + " is a " + posZeroNeg);
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.3
		
		int numberOfDigits;
		
		System.out.print("Please enter a number no bigger than 99,999,999: ");
		int userNumber = in.nextInt();
		
		
		if (userNumber >= 10000000)
			numberOfDigits = 8;
		else if (userNumber >= 1000000)
			numberOfDigits = 7;
		else if (userNumber >= 100000)
			numberOfDigits = 6;
		else if (userNumber >= 10000)
			numberOfDigits = 5;
		else if (userNumber >= 1000)
			numberOfDigits = 4;
		else if (userNumber >= 100)
			numberOfDigits = 3;
		else if (userNumber >= 10)
			numberOfDigits = 2;
		else
			numberOfDigits = 1;
		
		System.out.println("There are " + numberOfDigits + " digits in the number " + userNumber);
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.4
		
		int firstNumber;
		int secondNumber;
		int thirdNumber;
		
		System.out.print("Please enter a number: ");
		firstNumber = in.nextInt();
		
		System.out.print("Please enter another number: ");
		secondNumber = in.nextInt();
		
		System.out.print("Please enter a final number: ");
		thirdNumber = in.nextInt();
		
		if (firstNumber == secondNumber && secondNumber == thirdNumber)
			System.out.print("All the numbers are the same.");
		else if (firstNumber != secondNumber && secondNumber != thirdNumber && thirdNumber != firstNumber)
			System.out.print("All the numbers are different.");
		else
			System.out.print("All the numbers are not the same");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.5
		
		int a;
		int b;
		int c;
		
		System.out.print("Please enter a number: ");
		a = in.nextInt();
		
		System.out.print("Please enter another number: ");
		b = in.nextInt();
		
		System.out.print("Please enter a final number: ");
		c = in.nextInt();
		
		if ((a < b && b < c))
			System.out.print("The numbers are in increasing order.");
		else if (a > b && b > c)
			System.out.print("The numbers are in decreasing order.");
		else
			System.out.print("The numbers are neither increasing or decreasing.");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.6
		
		int d;
		int e;
		int f;
		String mode;
		
		System.out.print("Please enter a number: ");
		d = in.nextInt();
		
		System.out.print("Please enter another number: ");
		e = in.nextInt();
		
		System.out.print("Please enter a final number: ");
		f = in.nextInt();
		
		System.out.print("Please choose either strict (type 'S') or leniant (type 'L')");
		mode = in.next();
		
		if (mode.equals("S")) {
			if ((d < e && e < f))
				System.out.print("The numbers are in increasing order.");
			else if (d > e && e > f)
				System.out.print("The numbers are in decreasing order.");
			else
				System.out.print("The numbers are neither increasing or decreasing.");
		}
		else if (mode.equals("L")) {
			if ((d < e && e < f) || (d < e && e == f) || (d == e && e < f))
				System.out.print("The numbers are in increasing order.");
			else if ( (d > e && e > f) || (d > e && e == f) || (d == e && e > f))
				System.out.print("The numbers are in decreasing order.");
			else if (d == e && e == f)
				System.out.print("The numbers are both increasing and decreasing.");
			else
				System.out.print("The numbers are neither increasing or decreasing");
		}
		else
			System.out.print("You did not enter a valid mode");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.7
		
		int g;
		int h;
		int i;
		
		System.out.print("Please enter a number: ");
		g = in.nextInt();
		
		System.out.print("Please enter another number: ");
		h = in.nextInt();
		
		System.out.print("Please enter a final number: ");
		i = in.nextInt();
		
		if ((g > h && h > i) || (g < h && h < i) || (g == h && h < i) || (g == h && h > i) || (g > h && h == i) || (g < h && h == i))
			System.out.print("The numbers are in order.");
		else
			System.out.print("The numbers are not in order.");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.8
		
		int j;
		int k;
		int l;
		int m;
		
		System.out.print("Please enter a number: ");
		j = in.nextInt();
		
		System.out.print("Please enter another number: ");
		k = in.nextInt();
		
		System.out.print("Please enter another number: ");
		l = in.nextInt();
		
		System.out.print("Please enter a final number: ");
		m = in.nextInt();
		
		if ((j == k && l == m) || (j == l && k == m) || (j == m && l == k))
			System.out.print("Two pairs");
		else
			System.out.print("Not two pairs");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.9
		
					
	}

}
