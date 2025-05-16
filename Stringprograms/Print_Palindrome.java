package Stringprograms;
/**
 * write a program to input a sentence in upper case 
 * display the palindrome words in the sentence
 */
import java.util.*;
public class Print_Palindrome
{
    public void main(String str)
    {
        str = str.toUpperCase();
        StringTokenizer st = new StringTokenizer (str);
        int l = st.countTokens();
        String s="";
        while (st.hasMoreTokens() )
        {
            String wrd= st.nextToken();
            StringBuffer sb=new StringBuffer (wrd);
            if (wrd.equals(sb.reverse().toString()))
            {
                s = s +  wrd +" , ";
            }
        }
        System.out.println("All Palindromic Words : "+ s);
    }
}
