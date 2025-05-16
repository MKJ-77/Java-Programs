package Stringprograms;
import com.sun.jdi.connect.Connector;

import java. util.*;

/**The words that are made with combination of letters present in the original 
 * word are called Anagrams. Write a program to accept two words and check 
 * whether they are  Anagram or not.
 * For eg. A word FLOW and the other word WOLF are Anagrams
 * as they contain combination of same letters.
 */
public class anagram
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter two word");
        String wrd1= sc.next();
        String wrd2= sc.next();
        wrd1= wrd1.toUpperCase();
        wrd2= wrd2.toUpperCase();
        anagram ob = new anagram();
        String w1 = ob.sort(wrd1);
        String w2 = ob.sort(wrd2);
        if (w1.equalsIgnoreCase(w2))
        {
            System.out.println("Words are Anagram");
        }
        else
        {
            System.out.println("Words are not Anagram");
        }
    }   
    
    public String sort(String wrd)
    {
        int l= wrd.length();char a;
        String wrd1 = "" ;
        for (char i='A';i<='Z';i++)
        {
            for(int I = 0;I<l;I++)
            {
                a = wrd.charAt(I);
                if (a==i)
                { 
                    wrd1 = wrd1 + i; 
                }
            }
        }
        System.out.println(wrd1);
        return wrd1;
    }
}
