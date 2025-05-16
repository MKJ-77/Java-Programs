package Functions;
import java.util.*;
public class student
{
    String Name;
    int roll,total;
    String address;
    double  avg;
    public student()
    {
        Name="";
        roll=0;
        address="";
        total=0;
        avg=0.0;
    }

    public void Input(String Name , String address , int roll ,int total )
    {
        this.Name=Name;
        this.address=address;
        this.roll=roll;
        this.total=total;
    }
    
    public void averager(int total)
    {
        avg=total/6;
    }
    
    public void print()
    {
        System.out.println("Name: "+Name);
        System.out.println("Address: "+address);
        System.out.println("Total Marks: "+total);
        System.out.println("Average: "+avg);
    }
    public void main(String Name , String address , int roll ,int total)
    {
        student a=new student ();
        a.Input(Name,address,roll,total);
        a.averager(total);
        a.print();
    }
}
