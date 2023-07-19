import java.util.*;

public class Exp2a 
{
    public static void main(String arg[])
    {
        Rectangle r1 = new Rectangle();
        try (Scanner sc = new Scanner(System.in)) 
        {
            System.out.println("Enter the length: ");
            int length = sc.nextInt();

            System.out.println("Enter the width: ");
            int width = sc.nextInt();
            
            r1.setdata(length, width);
            r1.perimeter();
            r1.area();
        }
    }    
}

class Rectangle
{
    private int a, b;
    
    void setdata(int x, int y)
    {
        a = x;
        b = y;
    }

    void perimeter()
    {
        System.out.println("The Perimeter of the Rectangle: " + (2*(a + b)));
    }

    void area()
    {
        System.out.println("The Area of the Rectangle: " + (a * b));   
    }
}
