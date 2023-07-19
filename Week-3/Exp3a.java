class Volume
{
    final double PI= 3.142; 
    
    double getVolume(double r)
    {
        return(4.0/3 * PI * r*r*r);
    }

    void getVolume(double r , double h)
    {
        System.out.print("The Volume of Cylinder: ");
        double res = PI*r*r*h;
        System.out.println(res);
    }    

    double getVolume(int r , int h)
    {
        return(1/3.0 * PI *r*r*h);
    }
}
public class Exp3a
{   
    public static void main(String args[])
    {
        Volume v1 = new Volume();
        System.out.println("The Volume of Sphere: " + v1.getVolume(3.67));
    
        v1.getVolume(5.6,8.9);
        System.out.println("The Volume of Cone: " +v1.getVolume(8,10));
    }   
}
