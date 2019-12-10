package cardgame;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class cardGame {

	public static void main(String[] args) {
		
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		String mySuit = "";
		String yourSuit = "";
		Random generator = new Random();
		int countMH = 0;
		int countMD = 0;
		int countMC = 0;
		int countMS = 0;
		int countYH = 0;
		int countYD = 0;
		int countYC = 0;
		int countYS = 0;
		
		int card = 0;
		for (int i=0;i<5;i++) {
			card = 1 + generator.nextInt(52);
			myHand[i]=card;
			card = 1 + generator.nextInt(52);
			yourHand[i]=card;
		}
		
		for (int j = 0; j < 5; j++)
		{
			if (myHand[j]>= 1 && myHand[j]<=13){
				countMH= countMH +1;
			}
			else if (myHand[j]>= 14 && myHand[j]<=26) {
				countMD = countMD +1;
			}
			else if (myHand[j]>= 27 && myHand[j]<=39) {
				countMC = countMC +1;
			}
			else
				countMS = countMS+1;
			
		}
		for (int j = 0; j < 5; j++)
		{
			if (yourHand[j]>= 1 && yourHand[j]<=13){
				countYH= countYH +1;
			}
			else if (yourHand[j]>= 14 && yourHand[j]<=26) {
				countYD = countYD +1;
			}
			else if (yourHand[j]>= 27 && yourHand[j]<=39) {
				countYC = countYC +1;
			}
			else
				countYS = countYS+1;
			
		}
		System.out.println("My hand is " + Arrays.toString(myHand));
		System.out.println("Your hand is " + Arrays.toString(yourHand));
		
		
		if ((countMH > countMD) && (countMH > countMC) && (countMH > countMS)) {
			mySuit = "Hearts";
		}
		if ((countMD > countMH) && (countMD > countMC) && (countMD > countMS)) {
			mySuit = "Diamonds";
		}
		
		
		
	}

}
