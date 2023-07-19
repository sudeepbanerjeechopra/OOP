/* Experiment 1 
   a) Read the marks of a student in 4 subjects and find Grade
   b) Program to check if a Number is Amstrong or not
   c) Program to display Prime Numbers from m to n
*/

import java.util.*;

public class Exp1b
{
	public static void main(String arg[])
	{
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int n = sc.nextInt();
            
            int s = 0, r, m;
            m = n;
            
            while(n>0)
            {
            	r = n % 10;
            	s = s + (r * r * r);
            	n = n / 10;
            }
            
            if ( s == m)
            	System.out.println("Armstrong Number");
            
            else
            	System.out.println("Not an Armstrong Number");
        }
	}
	
}
