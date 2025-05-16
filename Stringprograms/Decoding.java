package Stringprograms;
import java.util.*;
public class Decoding
{
    String hm,dm;
    public Decoding()
    {
        hm="";
        dm="";
    }

    public void Take_code()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("CODE DO MUJHE");
        hm=sc.nextLine().toUpperCase();
        if(hm.length()>200 || hm.contains(" ") )
        {
            System.out.println("GALAT CODE BRO");
            System.exit(0);
        }
    }

    public void Decode()
    {
        String wrd=hm; char ch;
        for(int i=0;i<=hm.length()-1;i++)
        {
            ch=wrd.charAt(i);
            if(i!=hm.length()-1 && ch=='K' && wrd.charAt(i+1)=='K')
            {
                dm+=" ";
                i++;
            }
            if(i>1 && i<hm.length()-1 && (ch=='K'&& wrd.charAt(i+1)=='K'&& wrd.charAt(i-1)=='K'&& wrd.charAt(i-2)=='K'))
            {
                i=i+1;
            }
            else
            {
                if(ch >='A' && ch<='X') ch+=2;
                else if(ch=='Y') ch='A';
                else if(ch=='Z') ch='B';
                dm+=ch;
            }
        }
    }

    public void Capitalise()
    {
        dm= dm.toLowerCase();
        String st=dm;
        String wrd;
        dm="";
        for(int i=0;i<st.length();i++)
        {    
            char ch=st.charAt(i);
            if(i==0 && ch>='a' && ch<'z') dm+=Character.toUpperCase(ch);
            else
            {
                if(Character.isLetter(ch)==false && i!=st.length()-1 ) 
                {
                    dm+=ch+""+Character.toUpperCase(st.charAt(i+1));
                    i++;
                }
                else  dm+=ch;
            }
        }
    }

    void Display()
    {
        System.out.println("Encoded Message : "+hm);
        System.out.println("CODE YE HAI !! : "+dm);
    }

    public static void main()
    {
        Decoding obj=new Decoding();
        obj.Take_code();
        obj.Decode();
        obj.Capitalise();
        obj.Display();
    }
}