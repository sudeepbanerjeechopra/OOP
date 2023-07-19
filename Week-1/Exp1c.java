/* Experiment 1 
   a) Read the marks of a student in 4 subjects and find Grade
   b) Program to check if a Number is Amstrong or not
   c) Program to display Prime Numbers from m to n
*/

import java.util.*;

public class Exp1c
{
	public static void main(String arg[])
	{
		try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the starting number: ");
            int m = sc.nextInt();
            
            System.out.println("Enter the ending number: ");
            int n = sc.nextInt();
            
            int i, num;
            
            System.out.println("The Prime no's between " + m + " and " + n + " are: ");
            for(i = m; i<=n; i++)
            {	int count = 0;
            
            	for(num = 1; num<=i; num ++)
            	{
            		if(i % num == 0)
            			count = count + 1;
            	}
            	
            	if(count == 2)
            		System.out.println(i);
            }
        }
	}
}