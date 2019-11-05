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
			System.out.println("All the numbers are the same.");
		else if (firstNumber != secondNumber && secondNumber != thirdNumber && thirdNumber != firstNumber)
			System.out.println("All the numbers are different.");
		else
			System.out.println("All the numbers are not the same");
		
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
			System.out.println("The numbers are in increasing order.");
		else if (a > b && b > c)
			System.out.println("The numbers are in decreasing order.");
		else
			System.out.println("The numbers are neither increasing or decreasing.");
		
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
				System.out.println("The numbers are in increasing order.");
			else if (d > e && e > f)
				System.out.println("The numbers are in decreasing order.");
			else
				System.out.println("The numbers are neither increasing or decreasing.");
		}
		else if (mode.equals("L")) {
			if ((d < e && e < f) || (d < e && e == f) || (d == e && e < f))
				System.out.println("The numbers are in increasing order.");
			else if ( (d > e && e > f) || (d > e && e == f) || (d == e && e > f))
				System.out.println("The numbers are in decreasing order.");
			else if (d == e && e == f)
				System.out.println("The numbers are both increasing and decreasing.");
			else
				System.out.println("The numbers are neither increasing or decreasing");
		}
		else
			System.out.println("You did not enter a valid mode");
		
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
			System.out.println("The numbers are in order.");
		else
			System.out.println("The numbers are not in order.");
		
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
			System.out.println("Two pairs");
		else
			System.out.println("Not two pairs");
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.9
		
		int north = 0;
		int northEast = 45;
		int east = 90;
		int southEast = 135;
		int south = 180;
		int southWest = 225;
		int west = 270;
		int northWest = 315;
		int trueNorth = 360;
		int numberDegrees;
		
		System.out.print("Please enter an angle in degrees: ");
		numberDegrees = in.nextInt();
		
		if (numberDegrees > north && numberDegrees < northEast)
			System.out.println("You are headed North");
		if (numberDegrees > northEast && numberDegrees < east)
			System.out.println("You are headed North-West");
		if (numberDegrees > east && numberDegrees < southEast)
			System.out.println("You are headed West");
		if (numberDegrees > southEast && numberDegrees < south)
			System.out.println("You are headed South West");
		if (numberDegrees > south && numberDegrees < southWest)
			System.out.println("You are headed South");
		if (numberDegrees > southWest && numberDegrees < west)
			System.out.println("You are headed South East");
		if (numberDegrees > west && numberDegrees < northWest)
			System.out.println("You are headed East");
		if (numberDegrees > northWest && numberDegrees < trueNorth)
			System.out.println("You are headed North East");
		if (numberDegrees == trueNorth)
			System.out.println("You are headed North");
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.10
		
		String name;
		double salary;
		double hours;
		
		System.out.print("Please enter the employee's name: ");
		name = in.next();
		
		System.out.print("Please enter a hourly wage: ");
		salary = in.nextDouble();
		
		System.out.print("Please enter the hours worked: ");
		hours = in.nextDouble();
		
		double normal = hours * salary;
		double overtime = (40 * salary) + ((hours-40) * salary * 1.5);
		
		
		if (hours < 40)
			System.out.println(name + " has worked " + hours + " hours this week for a weekly pay of $" + normal);
		else 
			System.out.println(name + " has worked " + hours + " hours this week for a weekly pay of $" + overtime);
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//This is 5.11
		
		String unit;
		double temperature;
		
		System.out.print("Please enter either 'C' for Celsius or 'F' for Fahrenheit: ");
		unit = in.next();
		
		System.out.print("Please enter a temperature value: ");
		temperature = in.nextDouble();
		
		if (unit.equals("F")) {
			if (temperature > 212.0)
				System.out.print("Water will be a gas at sea level");
			else if (temperature > 32.0)
				System.out.print("Water will be a liquid at sea level");
			else
				System.out.print("Water will be a solid at sea level");
		}
		else if (unit.equals("C")) {
			if (temperature > 100.0)
				System.out.print("Water will be a gas at sea level");
			else if (temperature > 0.0)
				System.out.print("Water will be a liquid at sea level");
			else 
				System.out.print("Water will be a solid at sea level");
			
		}
		else
			System.out.print("You did not enter a valid unit for temperature value.");
		
		

					
	}

}

