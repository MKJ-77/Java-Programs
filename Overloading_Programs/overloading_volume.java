package Overloading_Programs;

import java.util.*;
public class overloading_volume
{
    public double volume(double r)
    {
        double p=3.14;
        double vol=(4/3)*p*r;
        return vol;
    }
    public double volume(double r, double h)
    {
        double p=3.14;
        double vol=3.14*r*r*h;
        return vol;
    }
     public double volume(double l, double b ,double h)
    {
        double vol=l*b*h;
        return vol;
    }
    void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the Choice");
        System.out.println(" 1: volume of sphere"+"\n"+" 2: volume of cone"+"\n"+" 3: volume of cube");
        int ch=sc.nextInt();
        double vol,r,h,l,b;
        switch (ch)
        {
            case 1:
            System.out.println("Enter the radius of sphere");
            r=sc.nextDouble();
            vol=volume(r);
            System.out.println("volume = "+vol);
            break;
            case 2:
            System.out.println("Enter the radius of cone");
            r=sc.nextDouble();
            System.out.println("Enter the height ");
            h=sc.nextInt();
            vol=volume(r,h);
            System.out.println("volume = "+vol);
            break;
            case 3:
            System.out.println("Enter the length");
            l=sc.nextDouble();
            System.out.println("Enter the breadth");
            b=sc.nextDouble();
            System.out.println("Enter the height ");
            h=sc.nextDouble();
            vol=volume(l,b,h);
            System.out.println("volume = "+vol);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}
