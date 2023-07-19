public class Encap 
{
    public static void main(String arg[])
    {
        Addition a1 = new Addition();

        a1.setdata(10,30);
        a1.disp();
    }    
}

class Addition 
{
    private int a,b;

    void setdata(int x, int y)
    {
        a = x;
        b = y;
    }

    int sum(int x, int y)
    {
        return (x + y);
    }

    void disp()
    {
        System.out.println("Sum = " + sum (a,b));
    }
}

