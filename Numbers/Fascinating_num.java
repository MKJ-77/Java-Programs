package Numbers;

import java.util.*;
/**
 * A fascinating number is one which when multiplied by 2 and 3, and then,
 * after the results are concatenated with the original number, 
 * the new number contains all the digits from 1 to 9 exactly once.
 * For example, consider the number 192.
 *      192 * 2 = 384
 *      192 * 3 = 576
 *      Concatenating both the results with the original number, we get:
 *      “192” + “384” + “576” = 192384576.
 *      Thus, 192 is a fascinating number.
 *  219, 273, 327, 1902 are some more examples of fascinating numbers
 */
class Fascinating_num
{
    /*long n;
    public Fascinating_num(long n)
    {
        this.n=n;
    }*/
    public void Display()//to display
    {
        for (long i=100l;i<100000;i++)
        {
            long num = compile(i);
            if (IsFascinating(num) == true)
            System.out.println(i);
        }
    }
    /**
     * Main logic is in compile() and isFascinating() 
     */
    public long compile(long num)
    {  
        long tw = num*2 ,th = num*3;
        long m = num,c=0,p=10;
        while (m!=0)//For_checking_Number_of_Digits
        {
            m=m/10;
            c=c+1;
            if(c>1)
            p=p*10;
        }
        num= (tw*p)+num;m = num;c=0;p=10;
        while (m!=0)
        {
            m=m/10;
            c=c+1;
            if(c>1)
            p=p*10;
        }
        num= (th*p)+num;
        return num;
    }
    public boolean IsFascinating (long num)
    {
        int c=0;
        for ( int i = 0; i<=9 ; i++ )
        {
            int f=0;
            long m = num;
            while( m!=0)
            {
                long a = m % 10;
                m = m / 10;
                if (a == i)
                f++;
            }
            if(f==1)
            c+=1;
            else if (f>1)
            return false;
        }
        return true;
    }
    public static void main()
    {
        Scanner sc = new Scanner (System.in) ;
        Fascinating_num ob = new Fascinating_num ();
        ob.Display();
     }
}