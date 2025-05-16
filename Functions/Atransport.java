package Functions; 
import java.util.*;
/**
*define a class A to calculate fine paid by a member for 
 late submission the details of the class are as follows first
 data members:- 
  * int acno stores the account no. of the member
  * double fine to store the fine to be paid
  * int n to store the no. of days fees is late
  * string title stores the name of the book issued
 member functions:-
  *void input() -this is to accept the details i.e. the ac no.,title of the book , n 
  *void compute() -to calculate the fine as follows ruppes 2/day 
  *void display()-to display the name of the book  no of dyas late and the fine
  *main()
    */ 
public class Atransport
{
    String name;
    int w;
    double charge;
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the name of the customer");
        name=ob.nextLine();
        System.out.println("Enter the weight of the parcel in kg");
        w=sc.nextInt();
        charge=0.0;
    }
    public void calculate()
    {   
        if (w<=10)
        charge=w*25;
        else if (w<=30 && w>10)
        charge=250+((w-10)*20);
        else if(w>30)
        charge=250+400+((w-30)*10);
        charge+=(5*charge)/100;
    }
    public void print ()
    {
        System.out.println("Name "+name);
        System.out.println("Weight "+w+" kg.");
        System.out.println("bill amount Rs. "+charge);
    }
    void main()
    {
         Atransport ab=new Atransport ();
         ab.accept();
         ab.calculate();
         ab.print();
    }
}
