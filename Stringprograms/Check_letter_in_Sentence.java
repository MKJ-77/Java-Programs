package Stringprograms;
import java.util.*;
/**
 *Input a Sentence & convert it into Uppercase AND then count 
 *The Words Starting with the letter 'A'.
 */
public class Check_letter_in_Sentence
{
    public void main(String Sen )
    {
        String s = Sen.toUpperCase();
        StringTokenizer st = new StringTokenizer(s);
        int count = 0,c = st.countTokens();
        String wrd , s1 = "" ;
        for (int i=1;i<c;i++)
        {
            wrd = st.nextToken();
            if (wrd.startsWith("A"))
            {
                ++count;
                s1 = s1 + wrd + '\n';
            }
        }
        System.out.println("Words Starting with Letter 'A' are "+count+" in Number");
        System.out.println(s1);
    }
}
