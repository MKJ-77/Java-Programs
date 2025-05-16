package Functions;
import java.util.*;

/**
 * class Tellcal
 * datam members
 * long phno.
 * String name: name of the customer 
 * int n: no of calls made
 * double amt: bill amount
 * Tellcall(long x ,string n , int k)
 * void compute()
 * 1-100     : 500
 * 101-200   : 1.00/call + rental
 * 201-300   : 1.20/call + rental
 * >300      : 1.50/call + rental
 * void Display()-Print in One line
 * Write a main() method to call the methods to perform 
 * the given task
 */
public class TellCall
{
    long phno ;
    String name; 
    int n;
    double amt;
    TellCall(long x , String n , int k)
    {
        phno=x;
        name=n;
        this.n=k;
    }
    void Compute()
    {
        if(n<=100)
        amt= 500;
        else if(n>=101 && n<=200)
        amt= n+500;
        else if(n>=201 && n<=300)
        amt= (n*1.2) +500;
        else 
        amt= (n*1.5) +500;
    }
    void Display()
    {
        System.out.println("Phone Number:" +phno +'\t'+
        "No. of Calls :"+ n +'\t'+ "Name Of the Customer :"
        +name+'\t' +"Amount To be Paid :"+ amt);
    }
    void main()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Phone Number");
        long a =sc.nextLong();
        System.out.println("Enter Number Of Calls");
        int n=sc.nextInt();
        System.out.println("Enter Name");
        String s=sc.nextLine();
        TellCall ob= new TellCall(a,s,n);
        ob.Compute();
        ob.Display();
    }
}
