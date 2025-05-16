package Stringprograms;
/**
 * Write a program to input a string and change the case 
 * of each letter of the string. Display the new string.
 * Eg.Input : WelComE TO SchOOl
 *    Output : wELcOMe to sCHooL
 */
public class Toggle_Case
{
    public void main (String Sentence)
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
}