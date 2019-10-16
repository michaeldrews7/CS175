import java.util.Scanner;

public class groceryDiscount {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while (true) {
			double moneySpent;
		
			//System.out.println(" ");
			System.out.print("Please enter the cost of your groceries or '0' to quit: ");
			moneySpent = in.nextDouble();
		
			double moneySpent8 = moneySpent * .08;
			double moneySpent10 = moneySpent * .1;
			double moneySpent12 = moneySpent * .12;
			double moneySpent14 = moneySpent * .14;
		
		
			if (moneySpent < 10) {
				System.out.println("You are not eligible for a coupon at this time.");
			}
			else if (moneySpent < 60.01) {
				System.out.print("You win a discount coupon of $");
				System.out.printf("%.2f", moneySpent8);
				System.out.println(". (8% of your purchase)");
			}
			else if (moneySpent < 150.01) {
				System.out.print("You win a discount coupon of $");
				System.out.printf("%.2f", moneySpent10);
				System.out.println(". (10% of your purchase)");
			}
			else if (moneySpent < 210.01) {
				System.out.print("You win a discount coupon of $");
				System.out.printf("%.2f", moneySpent12);
				System.out.println(". (12% of your purchase)");
			}
			else {
				System.out.print("You win a discount coupon of $");
				System.out.printf("%.2f", moneySpent14);
				System.out.println(". (14% of your purchase)");
			}
			if (moneySpent == 0)
				break;
		}

	}

}
