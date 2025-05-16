package Functions; 
import java.util.*;
    /**
     *define a class library to calculate fine paid by a member for 
      late submission the details of the class are as follows first
      data members:- 
       * int acno stores the account no. of the member
       * double fine to store the fine to be paid
       * int n to store the no. of days fees is late
       * string title stores the name of the book issued
      member functions:-
       *void input() -this is to accept the details i.e. the ac no.,title of the book , n 
       *void compute() -to calculate the fine as follows ruppes 2/day 
       *void display()-to display the name of the book  no of dyas late and the fine
       *main()
    */ 
public class Library
{
    int acno,n;
    double fine ;
    String title;
    public void input()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter book's name");
        title = sc.nextLine();
        System.out.println("Enter account Number");
        acno = sc.nextInt();
        System.out.println("Enter No. of Days Late");
        n = sc.nextInt();
    }
    public void compute()
    {
        fine=2*n;
    }
    public void Display()
    {
        System.out.println("Book's Name="+title);
        System.out.println("Number of Days Late:"+n);
        System.out.println("Fine="+fine);
    }
    void main()
    {
        Library ob = new Library ();
        ob.input();
        ob.compute();
        ob.Display();
    }
}
