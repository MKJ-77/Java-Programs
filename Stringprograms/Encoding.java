package Stringprograms;
import java.util.*;
/**
 *You can encode a string in many ways. One of the simplest way is to shift 
 *the letter by a fixed move ahead or behind in the alphabet, where the alphabet 
 *is assumed to wrap around (i.e. A follows Z)
 *For example if the string is COMPUTER and the shift is 3,
 *means each character is replaced by a character 3 character ahead in alphabet. 
 *Thus the new string will be FRPSXWHU. 
 *Write a program to accept a string in uppercase and  shift value.
 *Display the new string  after encoding with the specified move.
 */
public class Encoding
{
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        Scanner ob= new Scanner (System.in);
        System.out.println("Enter a Word");
        String wrd = ob.next();
        wrd= wrd.toUpperCase();
        System.out.println("Enter the shift value");
        int sh = sc.nextInt();
        int l= wrd.length();
        String s1="";
        char ch,I;
        for (int i=0;i<l;i++)
        {
            char a= wrd.charAt(i);
            int n=1;
            for(int j=1;j<=sh;j++)
            {
                a++;
                if(a==91)
                a='A';
            }
            s1=s1+a;
        }
        System.out.println(s1);
    }
}