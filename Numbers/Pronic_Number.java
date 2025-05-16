package Numbers;

/**
 * A pronic number is a number which is the product of two consecutive integers
 * The first few pronic numbers are:
 * 0, 2, 6, 12, 20, 30, 42, 56, 72, 90, 110, 132, 156, 182, 210, 240…
*/
public class Pronic_Number
{
    public void main(int num)
    {
        if (Is_PronicNumber (num) == true )
            System.out.println(num + "  Is A Pronic Number !!! ");
        else
            System.out.println(num + "  Is A Pronic Number !!! ");
    }
    public boolean Is_PronicNumber(int num)
    {
        for (int i = 0 , a = i+1; i <= num ; i++,a++)
        {
            if ( i * a == num)
                return true ;
        }
        return false ;
    }
}
