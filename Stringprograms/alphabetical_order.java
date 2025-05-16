package Stringprograms;
import java.util.*;
/**
 * Write a program to input a sentence in uppercase and 
 * print the sentence with letters of each word arranged
 * in alphabetical order.
 * Example, if the input is  "THIS IS MY HOUSE"
 * Output : HIST IS MY EHOSU
 */
public class alphabetical_order
{
    public void main (String sen)
    {
        sen = sen.toUpperCase();
        StringTokenizer st = new StringTokenizer (sen) ;
        int l = st.countTokens();
        String s=""  ,  s1=""  ,  wrd;
        while (st.hasMoreTokens() )
        {
            wrd = st.nextToken();
            for (char i='B' ;i <= 'Z';i++)
            {
                int L= wrd.length()-1;
                for (int I=0; I<L ;I++)
                {
                    char ch = wrd.charAt(I);
                    if(ch == i)
                    {
                        s= s + i;
                    }
                }
            }
            s1=s1+s+" ";
            s="";
        }
        System.out.println(s1);
    }
}