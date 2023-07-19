import java.util.Scanner;

public class Exp2b 
{
    public static void main(String arg[])
    {
        Account a1 = new Account();
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.println("Enter the Name: ");
            String name = sc.nextLine();
            System.out.println(" ");

            System.out.println("Enter the Account No.: ");
            int acno = sc.nextInt();
            System.out.println(" ");

            System.out.println("Enter the balance: ");
            int balance = sc.nextInt();
            System.out.println(" ");

            a1.setdata(name, acno, balance);

            System.out.println("Enter the amount to be deposited: ");
            int deposit = sc.nextInt();
            System.out.println(" ");
            a1.deposit(deposit);
            
            System.out.println("Enter the amount to be withdrawn: ");
            int withdraw = sc.nextInt();
            System.out.println(" ");
            a1.withdraw(withdraw);

            System.out.println(" ");
            a1.check();
        }
    }
}

class Account
{
    private int a, b, c, d;
    private String n;

    void setdata(String x, int y, int z)
    {
        n = x;
        a = y;
        b = z; 
    }

    void deposit(int dep)
    {   
        c = dep;
        System.out.println("The Name of the account holder: " + n);
        System.out.println("The Account No.: " + a);
        System.out.println("Amount Deposited: " + c);

        b = b + c;
        System.out.println("Current Balance: " + b);
        System.out.println(" ");
    }

    void withdraw(int with)
    {
        d = with;
        System.out.println("The Name of the account holder: " + n);
        System.out.println("The Account No.: " + a);
        System.out.println("Amount Withdrawn: " + d);

        b = b - d;
        System.out.println("Current Balance: " + b);
        System.out.println(" ");
    }

    void check()
    {
        System.out.println("The Name of the account holder: " + n);
        System.out.println("The Account No.: " + a);
        System.out.println("Total Balance: " + b);
        System.out.println(" ");
    }
}