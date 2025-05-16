package Stringprograms;
/**
 Write a program to input a sentence and devise the following functions
 Methods-
 void Unique()-To print the Unique words of the Sentence
 void Potential()-To print the Potential of all Words in the Sentence
 void ToggleCase()-To print sentence in Toggle Case.
 Any more functions can made as per need.
 the potential of words can be calculatd by adding the ASCII codes of the charaqcters of the words
 The unique words are which occur once in the sentence.
 The toggle case is case in which the case of the letters is opposite to the case of the original words
 eg ComPUTEr is cOMputeR in toggle case.
 */
import java.util.*;
public class Transform
{
    public void Potential(String sentence)
    {
        String sen = sentence;
        StringTokenizer st = new StringTokenizer (sen," ,.");
        System.out.println("Potential of the Words is");
        while (st.hasMoreTokens())
        {
            String wd= st.nextToken();
            int l= wd.length()-1;
            int sum = 0;
            for (int i=0;i<=l;i++)
            {
                char ch = wd.charAt(i);
                sum += ch;
            }   
            System.out.println(wd+'\t'+sum);
        }
    }    
    public void Unique (String sen)
    {
        sen = sen.toUpperCase();String s1="";
        StringTokenizer st = new StringTokenizer(sen," ,.");
        while(st.hasMoreTokens())
        {
            String wrd=st.nextToken();
            if (search(sen,wrd)==1)
            s1+=wrd+"  "; 
        }
        System.out.println("Unique Words In the Sentence are"+'\n'+s1);
    }
    public int search(String sen, String wrd)
    {
        sen = sen.toUpperCase();
        wrd = wrd.toUpperCase();
        int f=0;
        StringTokenizer str = new StringTokenizer(sen," .,");
        while (str.hasMoreTokens())
        {
            String  w = str.nextToken();
            if (wrd.equalsIgnoreCase(w) == true)
            f++;
        }
        return f;
    }
    public void ToggleCase (String Sentence)
    {
        String s = Sentence , s1="" ;
        int l= s.length();
        char a= 'a'-'A';
        for (int i=0 ; i<l ;i++ )
        {
            char ch= s.charAt(i);
            if (ch<=90 && ch>=65)
            {    
                for (int I=1;I<=32;I++,ch++){}
                s1=s1+ch;
            }
            else if (ch<=122 && ch>=97)
            { 
                for (int I=1;I<=32;I++,ch--){}
                s1=s1+ch;
            }    
            else
                s1=s1+ch;
        }
        System.out.println("Toggle Sentence : "+ '\n' +s1);
    }
    public void main ()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Sentence.");
        String s = sc.nextLine();
        Transform ob = new Transform ();
        ob.Unique(s);
        ob.Potential(s);
        ob.ToggleCase(s);
    }
}