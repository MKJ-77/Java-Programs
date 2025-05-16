package Stringprograms;

import java.util.*;
/**
 * Write a program to input a sentence in uppercase and print all unique words 
 * present in it .
 * Unique words are words that occur once in the sentence
 */
public class unique_Words
{
    public void main (String sen)
    {
        sen = sen.toUpperCase();String s1="";
        StringTokenizer st = new StringTokenizer(sen);
        while(st.hasMoreTokens())
        {
            String wrd=st.nextToken();
            if (search(sen,wrd)==1)
            s1+=wrd+"  "; 
        }
        System.out.println(s1);
    }
    public int search(String sen, String wrd)
    {
        sen = sen.toUpperCase();
        wrd = wrd.toUpperCase();
        int f=0;
        StringTokenizer str = new StringTokenizer(sen);
        while (str.hasMoreTokens())
        {
            String  w = str.nextToken();
            if (wrd.equalsIgnoreCase(w) == true)
            f++;
        }
        return f;
    }
}
