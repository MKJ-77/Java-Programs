package Pyramid_Programs;
import java.util.*; 
/**
 * Choice 1                   |  Choice 2
 * OUTPUT                     |OUTPUT  
 * I                          |   I
 *  C                         |  C 
 *   S                        | S
 *    E                       |E
 */
class Word_slant
{
    public static void main (String[] args)
    {
        System.out.println("Enter A Word");
        Scanner sco= new Scanner (System.in);
        String s= sco.next();
        System.out.println("Enter Your Choice");
        System.out.println("1. Or  2.");
        Scanner sc= new Scanner (System.in);
        int ch=sc.nextInt();
        switch (ch)
        {
            case 1:
            Word_slant.c1(s);
            break;
            case 2:
            Word_slant.c2(s);
            break;
            default:
            System.out.println("Wrong Choice");
            break;
        }
    }
    public static void c1(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            for (int k=0; k<=i;k++)
            {
                if (k==i)
                {
                    System.out.print(s.charAt(i));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void c2(String s)
    {
        int l=s.length(),l2=l;
        for(int i=0;i<l;i++)
        {
            for (int k=0; k<=l;k++)
            {
                if (k==l2)
                {
                    System.out.print(s.charAt(i));
                }
                else
                {
                    System.out.print(" ");
                }
            }
            --l2;
            System.out.println();
        }
    }
}
