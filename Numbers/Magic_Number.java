package Numbers;

/**
 *In simple and true words, a magic number is a three-digit
 *number,whose sum of the squares of the first two digits is
 *equal to the third one.
 *Ex-202, as, 2*2 + 0*0 = 2*2.
 */
public class Magic_Number
{
    public void main(int num)
    {
        int t = num % 10; //Third Digit
        int a = num / 10;
        int s = a % 10  ; //Second Digit
        int f = a / 10  ; //First Digit
        if (f*f + s*s == t*t)
        System.out.println(num+" is a Magic Number");
        else if ( num >= 1000 )
        System.out.println("Not a Magic Number"+'\n'+"Input a Three Digit Number ");
        else
        System.out.println("Not a Magic Number");
    }
}
