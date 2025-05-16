package Practical_Questions;
import java.util.*;
public class Digit_order
{
    String a;
    char arr[];
    Digit_order()
    {
        a="";
    }

    char[] input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        a=sc.next();
        int n=a.length();
        arr=new char[n];
        for(int i=0;i<n;i++)
        {   
            char ch= a.charAt(i);
            if(Character.isDigit(ch)==false)
            {
                System.out.println("Invalid Input"); 
                System.exit(0);
            }
            arr[i]=ch;
        }
        return arr;
    }

    String check(char m[])
    {    
        String res="";
        String asc="asc";
        String des="des";
        int c1=0,c2=0;
        int n=a.length();
        for(int i=0;i<n-1;i++)
        {
            if(arr[i]<arr[i+1])
                c1++;
            else if(arr[i]>arr[i+1])
                c2++;
        }
        if(c1==n-1)
            res=asc;
        else if(c2==n-1)
            res=des;
        return res;
    }

    void display()
    {
        if(check(arr).equals("asc"))
        {
            System.out.println("ASCENDING NUMBER");
        }
        else if(check(arr).equals("des"))
        {
            System.out.println("DESCENDING NUMBER");
        }
        else
        {
            System.out.println("JUMBLED NUMBER");
        }
    }

    public static void main()
    {
        Digit_order obj=new Digit_order();
        obj.input();
        obj.display();
    }

}