import java.util.Scanner;

public class carDecision2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String stickerHybrid = "Make:Toyota,Model:Pruis,Cost:31000,MPG:30";
		String stickerRegular = "Make:Toyota,Model: Corolla,Cost:28000,MPG:20";
		String [] Hybrid = stickerHybrid.split(","); //splits the string of stickhybrid everytime theres a comma
		String [] HCost = Hybrid[2].split(":"); //splits the split everytime theres a colon
		int hybridCarCost = Integer.parseInt(HCost[1]);
		String [] HMPG = Hybrid[3].split(":");
		int hybridCarMPG = Integer.parseInt(HMPG[1]);
		String [] HMake = Hybrid[0].split(":");
		String [] HModel = Hybrid[1].split(":");	
		
		String [] Regular = stickerRegular.split(",");
		String [] RCost = Regular[2].split(":");
		int regularCarCost = Integer.parseInt(RCost[1]);
		String [] RMPG = Regular[3].split(":");
		int regularCarMPG = Integer.parseInt(RMPG[1]);
		String [] RMake = Regular[0].split(":");
		String [] RModel = Regular[1].split(":");
		
		
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
		
		System.out.print("Please enter the miles traveled per year: ");
		milesTraveled = in.nextDouble();
		
		System.out.print("Please enter the cost of gas: ");
		gasPrice = in.nextDouble();
		
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
		
		System.out.println("The cost to own a " + HMake[1] + " "+ HModel[1] +" for 1 year is $" + year1TCRC + " compared to a " + RMake[1] + " " + RModel[1] + " which is $" + year1TCHC);
		System.out.println("The cost to own a " + HMake[1] + " "+ HModel[1] +" for 2 years is $" + year1TCRC + " compared to a " + RMake[1] + " " + RModel[1] + " which is $" + year1TCHC);
		System.out.println("The cost to own a " + HMake[1] + " "+ HModel[1] +" for 3 years is $" + year1TCRC + " compared to a " + RMake[1] + " " + RModel[1] + " which is $" + year1TCHC);
		System.out.println("The cost to own a " + HMake[1] + " "+ HModel[1] +" for 4 years is $" + year1TCRC + " compared to a " + RMake[1] + " " + RModel[1] + " which is $" + year1TCHC);
		System.out.println("The cost to own a " + HMake[1] + " "+ HModel[1] +" for 5 years is $" + year1TCRC + " compared to a " + RMake[1] + " " + RModel[1] + " which is $" + year1TCHC);
		
		if (year5TCHC < year5TCRC) {System.out.print("After 5 years, the cost of the " + HMake[1] + " " + HModel[1] + " is paid off.");}
		else {System.out.print("After 5 years, the cost of the " + HMake[1] + " " + HModel[1] + " has not paid off.");}


	}

}
