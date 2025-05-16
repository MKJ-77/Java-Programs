package Functions;
import java.util.*;
/**
 * DATA MEMBERS-:
 *string name,
 *string address ,
 *long phone,
 *double monthly salary,
 *income tax
 
 * MEMBER FUNCTIONS-:
 * void accept() : to accept the details
 * void compute() : to compute the annual income tax at 5% of the annual salary exceeding 1,75000  
 * void display() : to display the details of the person
 * void main() * Write a main method to create an object of the class and call the functions mentioned above.*
   */
class salary
{
    // instance variables - replace the example below with your own
    String name;
    String address;
    long phone;
    double monthly_salary,income_tax;
    /*public salary(String name,String address,long phone,double monthly_salary)
    {
        this.name = name ;
        this.phone = phone ;
        this.monthly_salary = monthly_salary ;
        this.address = address ;
    }*/
    public void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        name=sc.nextLine();
        System.out.println("Address-:");
        address=sc.nextLine();
        Scanner ob=new Scanner(System.in);
        System.out.println("Phone-:");
        phone=ob.nextLong();
        System.out.println("Monthly Salary-:");
        monthly_salary=ob.nextDouble();
        income_tax=0.0;
    }
    public void compute ()
    {
        if ( monthly_salary > 175000 )
        {
            income_tax=(monthly_salary- 175000)*.05;
        }
    }
    public void display()
    {
        System.out.println("Name-: "+name);
        System.out.println("Address-: "+address);
        System.out.println("Monthly Salary-: "+monthly_salary);
        System.out.println("Phone-: "+phone);
        System.out.println("Income Tax-: "+income_tax);
    }
    public  void main()
    {
        /*Scanner sc=new Scanner(System.in);
        System.out.println("Name");
        name=sc.nextLine();
        System.out.println("Address-:");
        address=sc.nextLine();
        Scanner ob=new Scanner(System.in);
        System.out.println("Phone-:");
        phone=ob.nextLong();
        System.out.println("Monthly Salary-:");
        monthly_salary=ob.nextDouble();
        income_tax=0.0;*/
        salary obj=new salary(/*name,address,phone,monthly_salary*/);
        accept();
        compute();
        display();
    }
}
