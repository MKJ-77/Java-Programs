package Functions;

import java.util.*;
/**
 * Define a class account 
 * the data members are 
 * string name
 * double balance
 * long accountNumber()
 * member functions
 * account()
 * void input()
 * void withdraw()- accepts amount to be withdrawn and displays the balance after 
 * withdrawn the minimum balance is 1000 if balance after withdrawl is <1000
 * can't withdraw. 
 * void deposit()-accept amount to be deposited and add the amount to balance 
 * void display()- the display account details.
 */
public class Account
{
    String name;
    double bln;
    long acc_no;
    Account()
    {
        name ="";
        bln = 0.0;
        acc_no = 0l;
    }
    void Input()
    {
        Scanner sc = new Scanner (System.in);
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter your Name");
        name =sc.nextLine();
        System.out.println("Enter your Current balance");
        bln= ob.nextDouble();
        System.out.println("Enter your Account Number");
        acc_no= ob.nextLong();
    }
    static void main()
    {
        Account ob =new Account ();
        ob.Input();
        ob.Withdrawn();
        ob.Deposit();
        ob.Display();
    }
    void Withdrawn()
    {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the amount you want to WithDraw");
        double w = ob.nextDouble();
        w= bln-w;
        if (w<1000)
        {
            System.out.println("Your Balance after Withdrawl is Less than 1000,"+
            "You cant withdraw this Amount");
        }
        else if(w>1000) 
        {
            bln = w;
        }
    }
    void Deposit()
    {
        Scanner ob = new Scanner (System.in);   
        System.out.println("Enter the amount you want to Deposit");
        double d = ob.nextDouble(); 
        bln +=d;
    }
    void Display()
    {
        System.out.println("Name : "+ name);
        System.out.println("Account Details- ");
        System.out.println("Account Number: "+ acc_no);
        System.out.println("Account Balance: "+ bln);
    }
}
