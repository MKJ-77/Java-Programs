package Stringprograms;
import java.util.*;
/**
 * Write a program to accept a string. Convert the string to uppercase. 
 * Count and output the number of double letter sequences that exist in the
 * string and print them. 
 * Sample Input : “SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE”
 * Sample Output : 4
 */
public class double_letter
{
    public void main(String s)
    {
        int i,l,c=0;
        s=s.toUpperCase();
        StringTokenizer st = new StringTokenizer (s);
        l= st.countTokens();
        double_letter ob = new double_letter() ;
        for (i=1;i<=l;i++)
        {
            String wrd = st.nextToken();
            if(ob.check$letter(wrd)==true)
            {
                System.out.println(wrd);
                c++;
            }
        }
        System.out.println("Words with double letters : "+c);
    }

    public boolean check$letter(String wrd)
    {
        int i,l=wrd.length()-1,j,c=0;
        char ch;        
        for (i=0,j=1;i<l;i++,j++)
        {
            ch = wrd.charAt(i);
            if  (ch==wrd.charAt(j))
            { 
                c++;
            }
        }
        if (c>=1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}