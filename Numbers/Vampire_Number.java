package Numbers;
/**
 * a vampire number (or true vampire number) is a composite natural number with an even
 * number of digits, that can be factored into two natural numbers each 
 * with half as many digits as the original number and
 * not both with trailing zeroes, where the two factors
 * contain precisely all the digits of the original number, in any order,
 * counting multiplicity. 
 * The first vampire number is 1260 = 21 × 60.
 * For example: 1260 is a vampire number, with 21 and 60 as fangs,
 * since 21 × 60 = 1260 and the digits of the concatenation of the two factors (2160)
 * are a permutation of the digits of the original number (1260). However, 126000 
 * (which can be expressed as 21 × 6000 or 210 × 600) is not, as 21 and 6000 do not
 * have the correct number of digits, and both 210 and 600 have trailing zeroes. 
 * Similarly, 1023 (which can be expressed as 31 × 33) is not, because although 1023 
 * contains all the digits of 31 and 33, the four 
 * digits of the pair (3133) is not a permutation of the digits of the original number.
 */ 
import java.util.*;
public class Vampire_Number
{
    int n;
    public Vampire_Number(){
        n=0;
    }
    public void Take_n(){
        Scanner mg=new Scanner (System.in);
        System.out.println("Enter A Number");
        n=mg.nextInt();
    } 
    public void Display(){
        if (hasnottrailing0(n) == false || checkdigits(n)%2 !=0 ||IsvampireNum(n)==false)
        System.out.println("Not a Vampire Number!!!");
        else
        System.out.println("Is a Vampire Number!!!");        
    }
    public boolean hasnottrailing0(int n){
        int c=0,m;
        String num="";
        while (n!=0){
            if(n%10 == 0)
            c++;
            n/=10;
        }
        if(c>=3)
        return false;
        else
        return true;
    }
    public int checkdigits(int n){
        int c=0;
        while (n!=0){
            n/=10; 
            c++;
        }
        return c;
    }
    public boolean IsvampireNum (int n){
        int m=n,c=0,a,i,p=1;
        String num="";
        for(i=1;i<=checkdigits(n)/2;i++)
            p*=10;
        m=n;
        int sh = m%p;
        m/=p;
        int fh=m;
        if(fh*sh==n || reverse(fh)*sh==n||reverse(sh)*fh==n || reverse(fh)*reverse(sh)==n)
        return true;
        else 
        return false;
    }
    int reverse(int n){
        int m=0,p=1;
        while(n!=0){
            int r = n%10;
            m+=r;
            n/=10;
            if(n>0)
            m*=10;
        }
        return m;
    }
    public static void main (){
        Vampire_Number ob = new Vampire_Number ();
        ob.Take_n();
        ob.Display();
    }
}