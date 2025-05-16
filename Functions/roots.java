package Functions;
import java.util.*;
/**
 * Input a,c,b of a Quadratic equation then find the roots 
 * of r1 and r2
 * and nature of the roots
 * if the roots are imaginary only print the nature of the 
 * roots.
 * otherwise find the roots
 * Member Objecs:
 * int a,b,c - the values of a,b,c of the roots
 * double r1,r2 - the values of roots
 * member functions:
 * void input()- to input the values of a,b,c 
 * void checkroots()- to check nature of roots and find the
   roots 
 * double  discriminant()- to find Discriminant 
 * static void main() - to call the functions Input() & 
   checkroots()
 */
public class roots
{
    int a,b,c;
    double r1,r2;
    void input(int a , int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void checkroots()
    {
        double d= discriminant ();
        System.out.println("Discriminant : "+d);
        if (d>0)
        {
            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = (-b-Math.sqrt(d))/(2*a);
            System.out.println("roots are real and unequal");
            System.out.println("Roots are :"+r1+'\t'+r2);
        }
        else if (d==0)
        {
            r1 = (-b+Math.sqrt(d))/(2*a);
            r2 = r1;
            System.out.println("roots are real and equal");
            System.out.println("Roots are :"+r1+'\t'+r2);
        }
        else{
            System.out.println("roots are Complex Numbers");
        }
    }
    double  discriminant ()
    {
        double d=Math.pow(b,2)-4*a*c;
        return d;
    }
    static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Input the values of a,b & c "+ 
                           "respectively");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        roots ob = new roots ();
        ob.input(a,b,c);
        ob.checkroots();
    }
}
