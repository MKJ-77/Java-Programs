package Stringprograms;
import java.util.*;
/**
 * Write a program to input a sentence in UPPERCASE terminating with full stop ‘.’ , with  each word separated by single space.  Print the frequency of each word present in the sentence. 
 * For example. TO BE OR NOT TO BE.
 * TO  2 
 * BE  2
 * OR  1
 * NOT 1;
 */
public class Count_Words
{ 
    public  void main(String s)
    {
        s= s.toUpperCase();
        String s2 = remove (s);//Sentnce without duplicate Words
        StringTokenizer st1 = new StringTokenizer(s2);
        String fre = "" ;int f;
        while(st1.hasMoreTokens())
        {
            String wrd1 = st1.nextToken();
            StringTokenizer st = new StringTokenizer(s);
            f=0;
            while (st.hasMoreTokens())
            {
                String wrd=st.nextToken();
                if (wrd.equalsIgnoreCase(wrd1))
                f+=1;
            }
            fre += wrd1 + '\t' + f + '\n';
        }
        System.out.println(fre);
    }
    public String remove (String sen)// to remove the Duplicate
    {                                //Words  from the Sentence
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
        return s1; 
    }  
}