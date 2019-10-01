import java.util.Scanner;

public class CarCostCalculation {

	public static void main(String[] args) {
		/*
		 * This program will help determine the total cost of ownership of a regular car vs a hybrid car for a 5 year period
		 */ 
		
		int regularCarCost;
		int hybridCarCost;
		int regularCarMPG;
		int hybridCarMPG;
		double milesTraveled;
		double gasPrice;
		double year1TCRC;
		double year2TCRC;
		double year3TCRC;
		double year4TCRC;
		double year5TCRC;
		double year1TCHC;
		double year2TCHC;
		double year3TCHC;
		double year4TCHC;
		double year5TCHC;
		double gallonsPerYearRC;
		double gallonsPerYearHC;
		double costYearGallonRC;
		double costYearGallonHC;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter the cost of the regular car: ");
		regularCarCost = in.nextInt();
		
		System.out.print("Please enter the cost of the hybrid car: ");
		hybridCarCost = in.nextInt();
		
		System.out.print("Please enter the miles per gallon for the regular car: ");
		regularCarMPG = in.nextInt();
		
		System.out.print("Please enter the miles per gallon for the hybrid car: ");
		hybridCarMPG = in.nextInt();
		
		System.out.print("Please enter the miles traveled per year: ");
		milesTraveled = in.nextDouble();
		
		System.out.print("Please enter the cost of gas: ");
		gasPrice = in.nextDouble();
		
		//all above are the inputs for the user about the cars
		
		gallonsPerYearRC = milesTraveled / regularCarMPG;
		gallonsPerYearHC = milesTraveled / hybridCarMPG;
		
		costYearGallonRC = gallonsPerYearRC * gasPrice;
		costYearGallonHC = gallonsPerYearHC * gasPrice;
				
		year1TCRC = regularCarCost + 1*costYearGallonRC;
		year2TCRC = regularCarCost + 2*costYearGallonRC;
		year3TCRC = regularCarCost + 3*costYearGallonRC;
		year4TCRC = regularCarCost + 4*costYearGallonRC;
		year5TCRC = regularCarCost + 5*costYearGallonRC;
		
		year1TCHC = hybridCarCost + 1*costYearGallonHC;
		year2TCHC = hybridCarCost + 2*costYearGallonHC;
		year3TCHC = hybridCarCost + 3*costYearGallonHC;
		year4TCHC = hybridCarCost + 4*costYearGallonHC;
		year5TCHC = hybridCarCost + 5*costYearGallonHC;
		
		System.out.println("The cost to own a regular car for 1 year is $" + year1TCRC + " compared to the hybrid car which is $" + year1TCHC);
		System.out.println("The cost to own a regular car for 2 years is $" + year2TCRC + " compared to the hybrid car which is $" + year2TCHC);
		System.out.println("The cost to own a regular car for 3 years is $" + year3TCRC + " compared to the hybrid car which is $" + year3TCHC);
		System.out.println("The cost to own a regular car for 4 years is $" + year4TCRC + " compared to the hybrid car which is $" + year4TCHC);
		System.out.println("The cost to own a regular car for 5 years is $" + year5TCRC + " compared to the hybrid car which is $" + year5TCHC);
		
		//these are all the calculations for the cost of the cars after the certain number of years
		
		
		if (year5TCHC < year5TCRC) {System.out.print("After 5 years, the cost of the hybrid car is paid off.");}
		else {System.out.print("After 5 years, the cost of the hybrid car has not paid off.");}
		
		
		
		

	}

}
