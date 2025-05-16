package Functions;
import java.util.*;
public class taximeter
{
    int km,taxino;
    String name;
    double b;
    public taximeter()
    {
        taxino=0;
        name=" ";
        km=0;
        b=0.0;
    }
    public void Input ()
    {
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the taxi number");
        taxino=sc.nextInt();   
        System.out.println("enter the distance travelled in kilometer");
        km=sc.nextInt();
        System.out.println("enter the name of passenger");   
        name=sc.nextLine();
    }
    public void calculate()
    {
        if (km<=1)
        b=25*km;
        else if(km>1&&km<=6)
        b=10*km;
        else if(km>6&&km<=12)
        b=15*km;
        else if(km>12&&km<=18)
        b=20*km;
        else
        b=25*km;
    }
    public void Display()
    {
        System.out.println("taxi number="+taxino);
        System.out.println("name of passeneger="+name);
        System.out.println("kilometer="+km);
        System.out.println("bill="+b);
    }
    public void main()
    {
        taximeter obj = new taximeter();
        obj.Input();
        obj.calculate();
        obj.Display();
    }
}