import java.util.Scanner;

public class PaintCost {

	
	
	

	public static void main(String[] args) {
		/*
		 * This program will calculate the cost of painting a house
		 */
		double houseLengthFeet;
		double houseLengthInches;
		double houseWidthFeet;
		double houseWidthInches;
		double houseHeightFeet;
		double houseHeightInches;
		double windowWidthFeet;
		double windowWidthInches;
		double windowLengthFeet;
		double windowLengthInches;
		int windowNumber;
		double doorLengthFeet;
		double doorLengthInches;
		double doorWidthFeet;
		double doorWidthInches;
		int doorNumber;
		double normalSideSF;
		double peakSideSF;
		double costSF;
		double totalWindowSF;
		double totalDoorSF;
		double totalSF;
		double costTotalSF;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the length of the house in whole feet (you will be asked inches next): ");
		houseLengthFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the length of the house: ");
		houseLengthInches = in.nextDouble();
		
		System.out.print("Please enter the width of the house in whole feet (you will be asked inches next): ");
		houseWidthFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the width of the house: ");
		houseWidthInches = in.nextDouble();
		
		System.out.print("Please enter the height of the house in whole feet (you will be asked inches next): ");
		houseHeightFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the height of the house: ");
		houseHeightInches = in.nextDouble();
		
		System.out.print("Please enter the length of the window in whole feet (you will be asked inches next): ");
		windowLengthFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the length of the window: ");
		windowLengthInches = in.nextDouble();
		
		System.out.print("Please enter the height of the window in whole feet (you will be asked inches next): ");
		windowWidthFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the height of the window: ");
		windowWidthInches = in.nextDouble();
		
		System.out.print("Please enter the number of windows in the house: ");
		windowNumber = in.nextInt();
		
		System.out.print("Please enter the length of the doors in whole feet (you will be asked inches next): ");
		doorLengthFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the length of the door: ");
		doorLengthInches = in.nextDouble();
		
		System.out.print("Please enter the height of the doors in whole feet (you will be asked inches next): ");
		doorWidthFeet = in.nextDouble();
		
		System.out.print("Please enter the remaining number of inches for the height of the door: ");
		doorWidthInches = in.nextDouble();
		
		System.out.print("Please enter the number of doors in the house: ");
		doorNumber = in.nextInt();
		
		System.out.print("Please enter the cost per SF to paint the house: ");
		costSF = in.nextDouble();
		
		//all above are the numbers that the user inputs to do the math of the house
		
		houseLengthFeet = houseLengthFeet + houseLengthInches/12;
				
		houseWidthFeet = houseWidthFeet + houseWidthInches/12;
		
		houseHeightFeet = houseHeightFeet + houseHeightInches/12;
		
		windowLengthFeet = windowLengthFeet + windowLengthInches/12;
		
		windowWidthFeet = windowWidthFeet + windowWidthInches/12;
		
		doorLengthFeet = doorLengthFeet + doorLengthInches/12;
		
		doorWidthFeet = doorWidthFeet + doorWidthInches/12;
		
		//all above operations calculate the total dimensions of each respected object's sides
		
		normalSideSF = houseLengthFeet * houseWidthFeet;
		
		peakSideSF = (houseLengthFeet * houseWidthFeet) + (.5 * (houseLengthFeet * (houseHeightFeet - houseWidthFeet)));
		
		totalWindowSF = windowNumber * windowLengthFeet * windowWidthFeet;
		
		totalDoorSF = doorNumber * doorLengthFeet * doorWidthFeet;
		
		totalSF = 2 * normalSideSF + 2 * peakSideSF - totalWindowSF - totalDoorSF;
			System.out.println("The total area to paint is " + totalSF);
			
		costTotalSF = costSF * totalSF;
			System.out.println("The cost to paint the entire house is $" + costTotalSF);
			
		
		
		
	}

}
