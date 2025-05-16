package Stringprograms;
import java .util.*;
public class Print_date
{
    public void main()
    {
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter the date in the given Format :-"+'\"'+"02/12/2020"+'\"');
        String d= sc.next();
        System.out.println("Enter the days the project will took to be completed.");
        int days= sc.nextInt();
        days--;
        String y= d.substring(6);
        String mon[]= {"January","Feburary","March","April","May","June","July",
                       "August","September","October","November","December"};
        int i=0,x[]= {31,28,31,30,31,30,31,31,30,31,30,31};
        String m=d.substring(3,5);
        int z = 0 ;
        int md=Integer.parseInt(m);//It has the month
        for(i=1;i<=12;i++)
        {
            if(i==md)
            {
                m=mon[i-1];
                z=i-1;
                break;
            }
        }
        String da=d.substring(0,2);
        md=Integer.parseInt(da);//now it store the date
        md+=days;
        int year = Integer.parseInt(y);
        for(;;i++)
        {
            if(md>x[i-1])
            {
                z++;
                if (isleap(year) == true)
                    x[1]=29;
                else
                    x[1]=28;
                md -= x[i-1];
                if(z>=12)
                {
                    z=0;
                    i=0;
                    year++;
                    if (isleap(year) == true)
                    x[1]=29;
                    else
                    x[1]=28;
                    m=mon[i];
                }
                else
                {
                    m=mon[z];
                }
                
            }
            else if(md<=x[i-1])
            break;
        }
        String date = md+" "+m+" , "+year;
        System.out.println(date);
    }
    
    boolean isleap(int year)
    {
        if (year % 400 == 0)
            return true;
        if(year % 100 == 0) 
            return false;
        else if (year % 4 == 0) 
            return true;
        else
            return false;
    }
}