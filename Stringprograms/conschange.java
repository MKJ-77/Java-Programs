package Stringprograms;
import java.util.*;
public class conschange
{
    String wrd;
    int i;
    public conschange(String wrd)
    {
        this.wrd=wrd;
    }
    
    void shiftcons()
    {
        wrd=wrd.toLowerCase();
        String v= "aeiou";
        String wd1="",wd2="";
        for(int i=0;i<wrd.length();i++)
        {
            char ch= wrd.charAt(i);
            if(ch>'a' && ch<'z'&& v.indexOf(ch)<1)
            wd1+= ch;
            else
            wd2+= ch;
        }
        this.i=wd1.length();
        wrd=wd1+wd2;
        System.out.println(wrd);
    }
    
    void changecase()
    {
        String v= "aeiou" ,wd1="" ,wd2=wrd.substring(this.i-1) ;char ch='M';
        for(int i=0;;i++)
        {
            ch= wrd.charAt(i);
            if(ch>'b' && ch<'z' && v.indexOf(ch)<1)
            wd1+= Character.toUpperCase(ch);
            else break;
        }
        wrd=wd1+wd2;
        System.out.println(wrd);
    }
    
    public void show()
    {
        System.out.println("Changed wrd"+wrd);
    }
    
    public void main()
    {
        Scanner sc= new Scanner (System.in);
        String wrd=sc.next();
        conschange ob= new conschange (wrd);
        ob.shiftcons();
        ob.changecase();
        ob.show();
    }
     
}
