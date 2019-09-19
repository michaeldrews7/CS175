import java.util.Scanner;

public class PaintCost {

	
	
	

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost of painting a house
		 */
		//double houseLengthFeet;
		int houseWidthFeet;
		int houseWidthInches;
		int houseHeightFeet;
		int houseHeightInches;
		int houseLengthFeet;
		int houseLengthInches;
		int windowWidthFeet;
		int windowWidthInches;
		int windowLengthFeet;
		int windowLengthInches;
		int windowNumber;
		int doorLengthFeet;
		int doorLengthInches;
		int doorWidthFeet;
		int doorWidthInches;
		int doorNumber;
		
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the length of the house in whole feet (you will be asked inches next): ");
		houseLengthFeet = in.nextInt();
		System.out.print("Please enter the remainding number of inches for the length of the house: ");
		houseLengthInches = in.nextInt();
		System.out.print("Please enter the width of the house in whole feet (you will be asked inches next): ");
		houseWidthFeet = in.nextInt();
		System.out.print("Please enter the remainding number of inches for the width of the house: ");
		houseWidthInches = in.nextInt();
		System.out.print("Please enter the height of the house in whole feet (you will be asked inches next): ");
		houseHeightFeet = in.nextInt();
		System.out.print("Please enter the remainding number of inches for the height of the house: ");
		houseHeightInches = in.nextInt();
		
		
		
	}

}
