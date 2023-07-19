/* Experiment 1 
   a) Read the marks of a student in 4 subjects and find Grade
   b) Program to check if a Number is Amstrong or not
   c) Program to display Prime Numbers from m to n
*/

import java.util.*;

public class Exp1a
{
	public static void main(String arg[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter Marks in 4 Subjects: ");
			int m1 = sc.nextInt();
			int m2 = sc.nextInt();
			double m3 = sc.nextDouble();
			double m4 = sc.nextDouble();
			
			double avg = (m1+m2+m3+m4)/4.0;
			
			System.out.println("The average of student is " + avg);
			
			if(avg>=70)
				System.out.println("Distinction");
			
			else if(avg>=60 && avg<70)
				System.out.println("First Class");
				
			else if(avg>=50 && avg<60)
				System.out.println("Second Class");
			
			else if(avg>=40 && avg<50)
				System.out.println("Pass");
			
			else
				System.out.println("Fail");
		}
	}
}

