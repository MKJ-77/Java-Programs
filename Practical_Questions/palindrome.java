package Practical_Questions;
import java.util.*;
/**
 * Write a description of class palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class palindrome
{
    String s;
    int n;
    Scanner sc=new Scanner(System.in);
    public palindrome()
    {
        s="";
        n=0;
    }

    public void Read()
    {
        System.out.println("Enter Sentence ending with \'. \\ ! \\ ?\'");
        s=sc.nextLine().toUpperCase();
    } 
    
    public boolean Check(String wrd)
    {
        StringBuffer sb = new StringBuffer (wrd);
        String wrd1=sb.reverse().toString();
        System.out.println(wrd1);
        if(wrd1.equalsIgnoreCase(wrd))
        return true;
        else return false;
    }
    
    public void Form()
    {
        StringTokenizer st = new StringTokenizer(this.s," ,?.!");
        s="";
        while(st.hasMoreTokens())
        {
            String wrd= st.nextToken();
            if(Check(wrd)==false)
            {
                s+=wrd+" ";
                n++;
            }
        }
    }
    
    public void Result()
    {
        System.out.println("Output : "+'\n'+s );
        System.out.println("The Number Of NoN - Palindromic Words Are : "+n);
    }
    
    public static void main()
    {
        palindrome pw= new palindrome();
        pw.Read();
        pw.Form();
        pw.Result();
    }
}
