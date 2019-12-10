package ch06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class exercise6_6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		//Exercise 6.4
       
		System.out.println("-------------------------------------------------------------------------------------------------------------------");
		//Exercise 6.6
		System.out.println("How many numbers?");
		
		int count1 = in.nextInt();
		
		double sum = 0;
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		
		for (int i = 0;i < count1; i++) {
			double d = in.nextDouble();
			sum += d;
			if (d < min)
				min = d;
			if (d > max)
				max = d;
		}

		double avg = sum/count1;
		double range = max - min;
		
		System.out.println("avg = " + avg);
		System.out.println("min = " + min);
		System.out.println("max= " + max);
		System.out.println("range = " + range);
		
		System.out.println("------------------------------------------------------------------------------------------------------------------------");
		//Exercise 6.11
		System.out.print("Please enter a word: ");
		String word = in.next();
		int vowel = 0;
        
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'o' || word.charAt(i) == 'e'||
                word.charAt(i) == 'u' || word.charAt(i) == 'i' || word.charAt(i) == 'y') {
               vowel++;
            }
        }
        
        System.out.println("There are " + vowel + " vowels in the word " + word);
        
        System.out.println("------------------------------------------------------------------------------------------------------------------------");
        //Exercise 6.17
        
	    for (int a = 1; a <= 10; a++) {
	    	System.out.println();
	        for (int b = 1; b <= 10; b++) {
	            System.out.printf("%5d", (a*b));
	        }
	        System.out.println();
	    }
	    System.out.println("------------------------------------------------------------------------------------------------------------------------");
	    //Exercise P6.4
	    System.out.print("Enter an integer: ");
		int number = in.nextInt();
		int index = 2; 
		while (number / index != 1) {
			if (number % index  == 0) {
				System.out.print(index + ", ");
				number /= index; 
			}
			else
				index++;
			}
		System.out.println(number + ".");
	}
}


		

