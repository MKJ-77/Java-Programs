package Stringprograms;
import java.util.*;
/**
 * Write a description of class double_vowel_occurence here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class double_vowel_occurence
{
    public void main(String sen)
    {
        sen=sen.toUpperCase();String s="", v= "AEIOU";
        StringTokenizer st= new StringTokenizer(sen);
        int count=0;
        while (st.hasMoreTokens())
        {
            String wrd = st.nextToken();
            int l = wrd.length()-1;
            for(int i=0,a=1; i<l;i++,a++)
            {
                char ch= wrd.charAt(i);
                char ch1= wrd.charAt(a);
                if (v.indexOf(ch)==1 && v.indexOf(ch1)==1 ) 
                {
                    s+=ch+""+ch1+'\t'+"";
                    ++count;
                }
            }
        }
        System.out.println("Vowels Occurring Twice :"+s);
        System.out.println(count+" pairs are present in the Sentence.");
    }
}
