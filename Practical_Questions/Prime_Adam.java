package Practical_Questions;
import java.util.*;
/**
 *A Prime-Adam integer is a positive integer (without leading zeros) which is a prime as well as an Adam number.
 *Prime number: A number which has only two factors, i.e. 1 and the number itself.
 *Example: 2, 3, 5, 7 ... etc.
 *Adam number: The square of a number and the square of its reverse are reverse to each other.
 *Example: If n = 13 and reverse of 'n' = 31, then,
 *(13)2 = 169
 *(31)2 = 961 which is reverse of 169
 *thus 13, is an Adam number.
 *Accept two positive integers m and n, where m is less than n as user input.
 *Display all Prime-Adam integers that are in the range between m and n (both inclusive) 
 *and output them along with the frequency, in the format given below:
 *Test your program with the following data and some random data:
 *Example 1
 *INPUT:
m = 5
n = 100
 *OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
11 13 31
FREQUENCY OF PRIME-ADAM INTEGERS IS: 3

 *Example 3
 *INPUT:
m = 50
n = 70
 *OUTPUT:
THE PRIME-ADAM INTEGERS ARE:
NIL
FREQUENCY OF PRIME-ADAM INTEGERS IS: 0

 *Example 4
 *INPUT:
m = 700
n = 450
 *OUTPUT:
INVALID INPUT
 */
public class Prime_Adam
{
    int m,n;
    public Prime_Adam()
    {
        n=0;
        m=0;
    }

    public void GetRange(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Input the Values of m & n.");
        m=sc.nextInt();
        n=sc.nextInt();
        if(m>n)
        {
            System.out.println("INVALID INPUT");
            System.exit(0);
        }
    }
    
    public int reverse(int n){
        int x;
        for(x=0;n>0;n/=10)
        {    x=(x*10)+n%10;   }
        return x;
    }

    public boolean isPrime(int n){
        for(int i=2;i<n;i++)
        {   if(n%i==0)  return false; }
        return true;
    }

    public boolean isAdam(int n){
        int x=reverse(n)*reverse(n);
        int y=n*n;
        if(x==reverse(y)) return true;
        else return false;
    }

    public void Display()
    {
        String s="";int c=0;
        for(int i=m+1;i<n;i++)
        {
            if(isPrime(i)) {  
                if(isAdam(i)){   
                    s+=i+" ";
                    c++;
                }
            }
        }
        if(c==0) System.out.println("NIL");
        else  System.out.println("The Prime-Adam Integers are : "+s);
        System.out.println("FREQUENCY OF PRIME-ADAM Numbers : "+c);        
    }

    public static void main()
    {
        Prime_Adam ob = new Prime_Adam();
        ob.GetRange();
        ob.Display();
    }
}