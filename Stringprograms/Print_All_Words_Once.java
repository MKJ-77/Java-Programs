package Stringprograms;
import java.util.*;
/**
 * Write a program to input a word and remove duplicate words from the sentence. 
 * Display the new sentence so obtained with each word occurring only once.)
 */
public class Print_All_Words_Once
{      //           By Sir
    public void main (String sen)
    {
        sen = sen.toUpperCase();String s1 = "";
        StringTokenizer st= new StringTokenizer(sen);
        while(st.hasMoreTokens())
        {
            String wrd = st.nextToken();
            if (s1.contains(wrd)==false)
            {
                s1 += wrd + " ";
            }
        }
        System.out.println(s1);
    }  
}
/**          By Me
 * public void main (String sen)
    {
        sen = sen.toUpperCase();
        StringTokenizer st= new StringTokenizer(sen);
        while(st.hasMoreTokens())
        {
            String wrd = st.nextToken();
            sen = remove_duplicates(sen,wrd); 
        }
        System.out.println(sen);
    }  
    public String remove_duplicates (String sen,String wrd)
    {
        StringTokenizer st = new StringTokenizer (sen); 
        String s1="";int c=0;
        while(st.hasMoreTokens())
        {
            String wrd1 = st.nextToken();
            if (wrd1.equalsIgnoreCase(wrd))
            {
                c+=1;
                if(c==1)
                {
                    s1 = s1 + wrd1 + " ";
                }
            }
            else
            {
                s1 = s1 + wrd1 + " ";
            }
        }
        return s1 ;
    }
 */
