package Functions;
import java.util.*;
/**
 * A number is said to be a magic number, if the sum of its digits are
 * calculated till a single digit recursively by adding the sum of the digits 
 * after every addition. If the single digit comes out to be 1,then the number
 * is a magic number. 
 */
public class Magic_Num
{
    int n;

    public Magic_Num(int n){
        this.n=n;
    }

    public int Sum(int sum){
        int n=sum,r;
        sum=0;
        while(n!=0)
        {
            r = n % 10;
            sum= sum + r;
            n=n/10;
        }
        if (checkSum(sum)) 
            return 1;
        else
            return 0;
    }

    boolean checkSum(int  sum)
    {
        if(sum>9)
        {
            sum=Sum(sum);                 
            if (sum==1)
                return true;
            else 
                return false;
        }             
        else if (sum==1)
            return true;
        else 
            return false;
    }

    public boolean check_Magic(){
        if(Sum(n)==1)
        {
            return true;
        }
        else 
            return false;
    }

    void display()
    {
        if(check_Magic())
            System.out.println(n + " is a Magic Number. ");
        else
            System.out.println(n + " is not a Magic Number. ");
    }

    public static void main(){
        Scanner sc = new Scanner (System.in);        
        System.out.println("Enter any Number.");
        int n= sc.nextInt();
        Magic_Num ob = new Magic_Num(n);
        ob.display();
    }
}
