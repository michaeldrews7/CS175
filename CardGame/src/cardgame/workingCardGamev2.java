package cardgame;

import java.util.Arrays;
import java.util.Random;

public class workingCardGamev2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random generator = new Random();

		int countH = 0;
		int countD = 0;
		int countC = 0;
		int countS = 0;
		int countDraw = 0;
		int myDraw = 0;
		int yourDraw = 0;
		String mySuit = null;
		String yourSuit = null;
		int[] myHand = new int[5];
		int[] yourHand = new int[5];
		int[] deck = new int[52];
		boolean winner = false;
		int myMax=0;
		int myMin=0;
		int yourMax=0;
		int yourMin=0;
		int yourGoodCount=0;
		int myGoodCount=0;
		//take all cards out of play to begin game
		//for (int c= 0;c <= 52;c++)
			//{deck[c]=0;}
		//check

		//assigns card values to both hands and determines suit
		for (int i = 0; i < myHand.length; i++) {
			//int card = generator.nextInt(52)+1;
			//if deck[card]==0
					
			myHand[i] = generator.nextInt(52) + 1;
			//check
			if (myHand[i] >= 1 && myHand[i] <= 13)
				countH++;
			else if (myHand[i] >= 14 && myHand[i] <= 26)
				countD++;
			else if (myHand[i] >= 27 && myHand[i] <= 39)
				countC++;
			else if (myHand[i] >= 40 && myHand[i] <= 52)
				countS++;
			if (countH >= countD && countH >= countC && countH >= countS)
				mySuit = "Hearts";
			else if (countD >= countH && countD >= countC && countD >= countS)
				mySuit = "Diamonds";
			else if (countC >= countH && countC >= countD && countC >= countS)
				mySuit = "Clubs";
			else if (countS >= countH && countS >= countC && countS >= countD)
				mySuit = "Spades";
		}
		for (int i = 0; i < yourHand.length; i++) {
			yourHand[i] = generator.nextInt(52) + 1;
			//check
			if (yourHand[i] >= 1 && yourHand[i] <= 13) {
				countH++;
			}
			else if (yourHand[i] >= 14 && yourHand[i] <= 26) {
				countD++;
			}
			else if (yourHand[i] >= 27 && yourHand[i] <= 39) {
				countC++;
			}
			else if (yourHand[i] >= 40 && yourHand[i] <= 52) {
				countS++;
			}
			if (countH >= countD && countH >= countC && countH >= countS) {
				yourSuit = "Hearts";
			}
			else if (countD >= countH && countD >= countC && countD >= countS) {
				yourSuit = "Diamonds";
			}
			else if (countC >= countH && countC >= countD && countC >= countS) {
				yourSuit = "Clubs";
			}
			else if (countS >= countH && countS >= countC && countS >= countD) {
				yourSuit = "Spades";
			}
		}
		System.out.println("My hand has five cards: " + Arrays.toString(myHand));
		System.out.println("Your hand has five cards: " + Arrays.toString(yourHand));
		System.out.println("My suit is " + mySuit + ".");
		System.out.println("Your suit is " + yourSuit + ".");
		if (mySuit.equals("Hearts")) {
			myMin=1;
			myMax = 13;
		}
		if (mySuit.equals("Diamonds")) {
			myMin=14;
			myMax = 26;
		}
		if (mySuit.equals("Clubs")) {
			myMin=27;
			myMax = 39;
		}
		if (mySuit.equals("Spades")) {
			myMin=40;
			myMax = 52;
		}
		if (yourSuit.equals("Hearts")) {
			yourMin=0;
			yourMax = 13;
		}
		if (yourSuit.equals("Diamonds")){
			yourMin=14;
			yourMax= 26;
		}
		if (yourSuit.equals("Clubs")){
			yourMin=27;
			yourMax= 39;
		}
		if (yourSuit.equals("Spades")){
			yourMin=40;
			yourMax= 52;
		}

		//repeats card draw until winner
		while (!winner) 
		{
			countDraw++;
			myDraw = generator.nextInt(52) + 1;
			//check
			System.out.println("My draw " + countDraw + ": " + myDraw);
			yourDraw = generator.nextInt(52) + 1;
			//check
			System.out.println("Your draw " + countDraw + ": " + yourDraw);

			//This code for myHand
			if (myDraw>=myMin && myDraw<=myMax) 
			{
				for (int i = 0; i < 5; i++) 
				{
					if (myHand[i] < myMin || myHand[i]> myMax) {
						deck[myHand[i]]=0;
						myHand[i] = myDraw;
						break;
					}
				}
						
						
			}
			myGoodCount = 0;
			for (int j=0; j<5;j++) 
			{
				if (myHand[j]>=myMin && myHand[j]<=myMax)
				{
					myGoodCount = myGoodCount+1;
				}
			}
			System.out.println("\tMy new hand is " + Arrays.toString(myHand));
			if (myGoodCount == 5 ){
				winner=true;
				System.out.println("I am the winner.");
				break;
			}
			
			//This code for yourHand
			if (yourDraw>=yourMin && yourDraw<=yourMax) 
			{
				for (int i = 0; i < 5; i++) 
				{
					if (yourHand[i] < yourMin || yourHand[i]> yourMax) {
						yourHand[i] = yourDraw;
						break;
					}
				}
						
						
			}
			yourGoodCount = 0;
			for (int j=0; j<5;j++) 
			{
				if (yourHand[j]>=yourMin && yourHand[j]<=yourMax)
				{
					yourGoodCount = yourGoodCount+1;
				}
			}
			System.out.println("\tYour new hand is " + Arrays.toString(yourHand));
			if (yourGoodCount == 5 ){
				winner=true;
				System.out.println("You are the winner.");
				break;
			}
			
		}		
		System.out.println("The game is over.");


	}

}
