package Practical_Questions;
import java.util.*;
public class LongestPalindrome
{
    String s,s1,pal;
    Scanner sc= new Scanner (System.in);
    public LongestPalindrome()
    {
        s="";
        s1="";
        pal="";
    }

     public void Read()
    {
        System.out.println("Enter Sentence ending with \'. \\ ! \\ ?\'");
        s=sc.nextLine().toUpperCase().trim();
    } 
    
    public void heck()
    {
        StringTokenizer st = new StringTokenizer(this.s," ,?.!");
        int l1=0;
        while(st.hasMoreTokens())
        {
            String wrd= st.nextToken();
            s1+=wrd+" ";
            StringBuffer sb= new StringBuffer(wrd);
            String wrd1=sb.reverse().toString();
            if(wrd1.equals(wrd))
            {
                int l2=wrd.length();
                if(l2>l1)
                {
                    pal= wrd;
                    l1=l2;
                }
            }
        }
    }
    
    public void Result()
    {
        System.out.println("Output : "+'\n'+s1 );
        System.out.println("The Longest Palindromic Word is : "+pal);
    }
    
    public static void main()
    {
        LongestPalindrome pw= new LongestPalindrome();
        pw.Read();
        pw.heck();
        pw.Result();
    }
}
//mom and     mew going to skl     speak malayalam    madam