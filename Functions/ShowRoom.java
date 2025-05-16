package Functions;
import java . util . *;
/**
 * Design a class name ShowRoom with the following description:
Instance/variables
Data members:
String name-To store the name of the customer
long mobno-To store the mobile number of the customer 
double cost -To store the cost of the items purchased
double dis-To store the discount amount
double amount-To store the amount to be paid after discount
 * Member methods:
ShowRoom( )-default constructor to initialize data members 
void input() -To input customer name, mobile number,cost
void calculate()-To calculate discount on the cost of purchased items, based on following criteria
cost                     Discount
<= 10000                    5%
> 10000 && <=20000          10%
> 20000 && <=35000          15%
>35000                      20%
void display()-To display customer name , mobile number , amount to be paid after discount.
Write a main method to create an object of the class and call the above member methods.
*/
public class ShowRoom
{
    String name;
    long mobno;
    double cost;
    double amount;
    double  dis;
    public ShowRoom()
    {
        name="";
        mobno=0;
        cost=0.0;
        amount=0.0;
        dis=0.0;
    }

    public void input()
    {
        Scanner an = new Scanner (System.in) ;
        System.out.println("Enter Name of the Customer");
        name=an.nextLine();
        Scanner n = new Scanner (System.in) ;
        System.out.println("Enter Mobile Number");
        mobno = n.nextLong();
        System.out.println("Enter cost of Purchased items");
        cost = n.nextDouble();
    }
    
    public void calculate ()
    {
        if ( cost <= 10000)
        {
            dis=(5*cost)/100;
            amount=cost-dis;
        }
        else if(cost > 10000 && cost <= 20000)
        {
            dis=(10*cost)/100;
            amount=cost-dis;
        }
        else if(cost > 20000  && cost <= 35000)
        {
            dis=(15*cost)/100;
            amount=cost-dis;
        }
        else if(cost >= 35000)
        {
            dis=(20*cost)/100;
            amount=cost-dis;
        }
    }
    
    public void display()
    {
        System.out.println("Customer's Name: "+name);
        System.out.println("Customer's Mobile Number: +91"+mobno);
        System.out.println("Total Cost: Rs."+cost);
        System.out.println("Discount: Rs."+dis);
        System.out.println("Discounted Price: Rs."+amount);
    }
    
    public void main ()
    {
        ShowRoom obj= new ShowRoom();
        obj.input();
        obj.calculate();
        obj.display();
    }
}
