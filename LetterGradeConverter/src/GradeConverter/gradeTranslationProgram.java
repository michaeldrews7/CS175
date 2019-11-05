package GradeConverter;

import java.util.Scanner;

public class gradeTranslationProgram {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String letterGrade;
		double numberGrade = 0;
		
		System.out.print("What is the grade that you have recieved?: ");
		letterGrade = in.next();
		
		if (letterGrade.equals("A+"))
			numberGrade = 4.0;
		else if (letterGrade.equals("A"))
			numberGrade = 4.0;
		else if (letterGrade.equals("A-"))
			numberGrade = 3.67;
		else if (letterGrade.equals("B+"))
			numberGrade = 3.33;
		else if (letterGrade.equals("B"))
			numberGrade = 3.00;
		else if (letterGrade.equals("B-"))
			numberGrade = 2.67;
		else if (letterGrade.equals("C+"))
			numberGrade = 2.33;
		else if (letterGrade.equals("C"))
			numberGrade = 2.00;
		else if (letterGrade.equals("C-"))
			numberGrade = 1.67;
		else if (letterGrade.equals("D+"))
			numberGrade = 1.33;
		else if (letterGrade.equals("D"))
			numberGrade = 1.00;
		else if (letterGrade.equals("D-"))
			numberGrade = 0.67;
		else if (letterGrade.equals("F"))
			numberGrade = 0.00;
		else
			System.out.print("Please enter a valid grade");
		
		System.out.print("A letter grade of a(n) " + letterGrade + " is " + numberGrade + " in GPA.");
			

	}

}
