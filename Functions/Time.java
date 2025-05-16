package Functions;
import java .util.*;
/**
 *manager of an internet service provider wants to analyse the system usauge 
 *from the log records . He wants to know how long each user uses the system 
 *the time is entered in 24 hours format .
 *Define a class time with 
 *data members 
 *HH and MM to denote hours and Mins 
 *the member Function
 *Time()- a default constructor 
 *void readtime()
 *void displayTime() 
 *difftime(time T1, time t2)
 */
public class Time
{
    int hh;
    int mm;
    Time()
    {
        hh=0;
        mm=0;
    }
     
    void ReadTime(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Hours ");
        hh= sc.nextInt();
        mm= sc.nextInt();
    }   
      
    Time diffTime(Time t1 ,Time t2)
    {
         Time t3=new Time();
         t3.hh=t2.hh -t1.hh;
         t3.mm=t2.mm -t1.mm;
         return t3;
    }
    
    void DisplayTime(){
        System.out.println(hh+":"+mm);
    }
    
    static void main()
    {       
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Hours and Minutes of Login Time.");
        Time Login= new Time ();
        Login.ReadTime();
        System.out.println("Enter Hours and Minutes of Logout Time");
        Time Logout= new Time ();
        Logout.ReadTime();
        Time diff= new Time();
        diff = diff.diffTime(Login, Logout);
        System.out.println("Usage time");
        diff.DisplayTime();
              
    }
}
