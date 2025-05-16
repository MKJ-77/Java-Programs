package Stringprograms;
/**
 * to innput a sentence in uppercase and reverse the alternate
 * word
 */
import java.util.*;
public class reverse_alternate
{
    public void main(String sen)
    {
        sen= sen.toUpperCase();
        StringTokenizer s = new StringTokenizer(sen," ,.?");
        int l= s.countTokens();
        String ne="";
        for(int i=1;i<=l;i++)
        {
            String wrd= s.nextToken();
            String wr=wrd;
            if(i%2==0)
            {
                wrd=wrd.toString();
                StringBuffer sb=new StringBuffer (wr);
                ne=ne+sb.reverse()+" ";
            }
            else
                ne=ne + wr + " ";
            }
        System.out.println(" sort = "+ne);
    }
}