package Functions;
import java.util.*;
/**
 * A class Number has been defined to find the frequency of each digit present 
 * in it and the sum of the digit and to display the results. Some of
 * the members of the class Number are given below: 
 *          Class name          Number
 *              Data member         num – long integer type
 *          Member functions:
 *           Number( )                   constructor to assign 0 to num
 *           Number(long a)              constructor to assign a to num
 *           void digitFrequency( )      to find the frequency of each 
 *                                       digit and to display it.
 *           int sumDigits( )            to returns the sum of the digits 
 *                                       of the number.
 * Specify the class Number giving the details of the two constructors
 * and functions void digitFrequency( ) and int sumDigits( ). 
 * You do not need to write the main function.
 */
public class Number
{
    private long num;
    
    public Number(){
        num=0l;
    }
    
    public Number(long a){
        num=a;
    }
    
    public void DigitFrequency(){
        int i,m; long r,j;
        for(i = 0;i<=9;i++)
        {
            m=0;
            for(j=num;j>0;j=j/10)
            {
                r = j%10 ;
                if((long)i==r)
                {
                    m++;
                }
            }
            if(m>0)
                System.out.println("Frequency of "+i+" is "+m);
        }
    }
    
    public int sumDigits(){
       long n= this.num;
       int s=0;
       while(n!=0)
       {
           s+=n%10;
           n/=10;
       }
       return s;
    }
    
    public static void main(){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a Number");
        Long a=sc.nextLong();
        Number ob= new Number ();
        Number obj= new Number (a);
        obj.DigitFrequency();
        System.out.println("Sum of Digits : "+ obj.sumDigits());
    }
}