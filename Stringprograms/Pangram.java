package Stringprograms;
import java.util.*;
/**
 * Given string str, the task is to write Java Program check   
 * whether the given string is a pangram or not.

A string is a pangram string if it contains all the character of
the alphabets ignoring the case of the alphabets.
Examples:
Input: str = “The quick Brown Fox jumps over the lazy Dog" 
Output: Yes
Input: str = “Computer Applications”
Qutput: No
 */
public class Pangram
{
    public void main()
    {
        Scanner sc=  new Scanner (System.in);
        System.out.println("Input A Sentence");
        String sen=sc.nextLine();
        sen =sen.toUpperCase();
        int c=0;
        for (char i='A';i<='Z';i++)
        {
            StringTokenizer st = new StringTokenizer(sen);
            c=0;
            while (st.hasMoreTokens())
            {
                String wrd = st.nextToken();
                int l  = wrd.length()-1;
                for (int I=0;I<=l;I++)
                {
                    char ch = wrd.charAt(I);
                    if (ch==i)
                        c++;
                }
            }
            if (c==0)
            {
                System.out.println("Not A Pangram!!!!");
                c=0;
                break;
            }
        }
        if(c!=0)
        System.out.println("Input Is A Pangram!!!!");;
    }
}
