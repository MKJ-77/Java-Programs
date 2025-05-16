package Numbers;

/**
 * HCF_Of_Two Numbers
 */
public class HCF_Of_Two_Numbers
{   public void main(int a , int b)
    {
        int i, hcf = 0;
        for(i = 1; i <= a || i <= b; i++) 
        {
            if( a%i == 0 && b%i == 0 )
                hcf = i;
        }
        System.out.println("HCF of given two numbers is ::"+hcf);
    }
}