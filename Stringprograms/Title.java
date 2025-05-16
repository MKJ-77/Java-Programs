package Stringprograms;
import java.util.*;
public class Title
{
    String str;
    int ln;
    public Title(String Sentence)
    {
        ln=Sentence.length();
        str=Sentence;
    }

    public int IsUpperCase(String wrd)
    {
        if(wrd.charAt(0)>='a' && wrd.charAt(0)<='z')
            return -1;
        else
            return 1;
    }

    public void Arrange()
    {
        StringTokenizer st= new StringTokenizer(str);
        String sen="";
        while(st.hasMoreTokens())
        {
            String wrd=st.nextToken();
            StringTokenizer st1= new StringTokenizer(str);
            while(st1.hasMoreTokens())
            {
                String wrd1 = st1.nextToken();
                if(wrd.compareToIgnoreCase(wrd1)>0)
                    wrd=wrd1;
            }
            sen+=wrd +" ";   
        }
        str=sen;
        System.out.println(str);
    }
    
    void titleCase()
    {
        StringTokenizer st= new StringTokenizer(str.toLowerCase());
        str="";
        while(st.hasMoreTokens())
        {
            String wrd=st.nextToken();
            str+= Character.toUpperCase(wrd.charAt(0))+""+ wrd.substring(1)+" ";
        }
        System.out.println(str);
    }
    
    void Display()
    {
        System.out.println("Ye le BSDK Arranged Title Case Sentence :"+'\n'+str);
    }
    
    static void main()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Ae chutiya aadmi Enter a sentence!!");
        String s=sc.nextLine();
        Title ob=new Title(s);
        ob.titleCase();
        ob.Arrange();
        ob.Display();
    }
}
