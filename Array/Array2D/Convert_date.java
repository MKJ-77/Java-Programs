package Array.Array2D;
import java.util.*;
public class Convert_date{
    int n,m,d,y;
    int dn[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
    String mn[]={"","JAN","FEB","MAR","APR","MAY","JUN","JUL","AUG","SEP","OCT","NOV","DEC"};
    public void readDate()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the day Number");
        n=sc.nextInt();
        System.out.println("Enter the year");
        y=sc.nextInt();
        if(y%100==0){
            if(y%400==0)
            dn[2]=29;
        }
        else if(y%4==0)
        dn[2]=29;
    }
    void convert(){
        for(m=1;m<=12;m++){
            d=d+dn[m];
            if(d>n)
            break;
        }
        d=d-dn[m];
        d=n-d;
    }
    void display(){
        System.out.println(mn[m]+","+d+","+y);
    }
    static void main(){
        Convert_date ob=new  Convert_date();
        ob.readDate();
        ob.convert();
        ob.display();
    }
}
