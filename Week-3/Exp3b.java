import java.util.*;

public class Exp3b 
{
    public static void main(String[] args) 
    {
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the number of Elements: ");
            int n = sc.nextInt();
            int s[] = new int[n];
            
            System.out.println("Enter the Elements: ");
            for(int i=0; i< n;i++)
                s[i] = sc.nextInt();

            System.out.println("The Elements before sorting: ");
 
            for(int i=0; i< s.length;i++)
                System.out.println(s[i] + " ");
 
            for(int i= 0; i < s.length; i++) 
            {
                for(int j = i + 1; j < s.length; j++) 
                {
                    if( s[i] >s[j]) 
                    {
                        int tmp = s[i];
                        s[i] = s[j];
                        s[j] = tmp;
                    }
                }
            }
 
            System.out.println("The Elements After Sorting: ");
            for(int i=0; i< s.length;i++)
                System.out.print(s[i] + " ");
        }
    }
}