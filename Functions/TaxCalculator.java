package Functions;
import java.util.*;
/**
 * Write a description of class TaxCalculator here.
 *
 *Data members:-
 *  int PAN
 *  String name
 *  double taxablencome
 *  double tax
 *Member Methods
 *  void Input ()
 *  void calculate()
 *  void Display()
 *  void main() to display  the above methods
 */
public class TaxCalculator
{    
   int PAN;
   String name;
   double taxablencome;
   double tax;
   public void Input ()
    {
     Scanner sc=new Scanner (System.in);    
     System.out.println("Enter the Name");   
     name=sc.nextLine();
     System.out.println("Enter the PAN number");
     PAN=sc.nextInt();   
     System.out.println("Enter the Taxable Income");
     taxablencome=sc.nextInt();
    }

   public void calculate()
    {
        if (taxablencome<=60000)
        tax=taxablencome;
        else if(taxablencome >= 60000 && taxablencome<=150000)
        tax=taxablencome+(taxablencome*0.05);
        else if(taxablencome >= 150000 && taxablencome <= 500000)
        tax=taxablencome+(taxablencome*0.1);
        else if(taxablencome >= 500000 )
        tax=taxablencome+(taxablencome*0.15);
    }
   
   public void Display()
    {
        System.out.println("Name:"+name);
        System.out.println("PAN Number = "+PAN);
        System.out.println("taxable Income = "+taxablencome);
        System.out.println("taxable Income including tax = "+tax);
        System.out.println("Tax = "+(tax-taxablencome));
    }
   public void main()
    {
        TaxCalculator obj = new TaxCalculator();
        obj.Input();
        obj.calculate();
        obj.Display();
    }
}