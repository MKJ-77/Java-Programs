package Functions;
import java.util.*;
public class constructor_q1
{
    int a,b,c;
    public constructor_q1()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER TWO NUMBERS");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void add()
    {
        c=a+b;
        System.out.println(c);
    }
    public void main () 
    {
        constructor_q1 obj = new constructor_q1();
        obj.add();
    }
}