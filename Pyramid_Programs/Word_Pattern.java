package Pyramid_Programs;
import java.util.*;
public class Word_Pattern
{
    public void main(String[] args)
    {
        String wrd ="Moral";
        for(int i=0,k=0;i<wrd.length();i++)
        {
            for(int j=0;j<wrd.length();j++)
            {
                if(i>0 && j<k)
                System.out.print("*");
                else
                System.out.print(wrd.charAt(j));
            }k++;
            System.out.println();
        }
    }
}