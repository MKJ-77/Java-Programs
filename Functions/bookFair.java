package Functions;
import java.util.*;
/**
 * Data Memberes:
 * string bame
 * doule price
 * Memer Fuctios
 * void iput()-to store name and price of book
 * void calculate- tp calculate the riice afetr discout,discout is
 * calculatio ased o the following
 * Price            discount
 * <=1000           2%  of the price
 * >1000&&<=3000    10% OF THE PRICE
 * >3000            15% OF THE PRICE
 * 
 * VOID DISPLAY()=TO DISPLAY THE NAME, PRICE OF THE BOOK AFTER DISCOUNT
 * 
 * WRITE THE MAIN FUNCTION TO CREATE AN OBJECT OF THE CLASS AND
CALL ABOVE FUNCTIONS
 */                 
public class bookFair
{
    String bname;
    double price;
    public bookFair()
    {
        bname="";
        price=0.0;
    }

    public void Input()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the name of Book");      
        bname=sc.nextLine();
        Scanner in=new Scanner (System.in);
        System.out.println("Enter the price of Book");
        price=in.nextDouble();
    }

    void calculate()
    {
        if (price<=1000)
            price = price -(.02*price);
        else if(price > 1000 && price <= 3000)
            price = price -(.05*price);
        else  
            price = price -(0.1*price);

    }

    public void display()
    {
        System.out.println("Name of the Book: "+bname);
        System.out.println("Discounted Price of the Book : "+ price);
    }

    void main()
    {
        bookFair ob = new bookFair();
        ob.Input();
        ob.calculate();
        ob.display();
    }
}