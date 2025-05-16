package Numbers;

import java.util.*;
/**
 *  Use a constructor to accept the values a,b,c of the quadratic equation ax^2+bx+c=0
 *  print whether the roots are imaginary, real or equal.
 *  also find x;
 */
public class Roots
{
    double a,b,c;
    public Roots(double a, double b, double c)
    {
        this.a=a;
        this.b=b;
        this.c=c;
    }
    void checkroots(double dis)
    {
        if (dis>0)
        System.out.println("Roots are real and unequal");
        if (dis==0.0)
        System.out.println("Roots are real and equal");
        if (dis<0)
        System.out.println("Roots are Imaginary");
    }
    void calculatex(double dis)
    {
        double x1 = (-1*b+Math.sqrt(dis))/(2*a);
        double x2 = (-1*b-Math.sqrt(dis))/(2*a);
        System.out.println("The values of x are "+x1+" , "+x2);
    }
    void main()
    {
        System.out.println("Enter the value of a ,b ,c");
        Scanner sc=new Scanner (System.in);
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        Roots ob = new Roots(a,b,c);
        double dis= (b*b)-(4*a*c);
        ob.checkroots(dis);
        ob.calculatex(dis);
    }
}