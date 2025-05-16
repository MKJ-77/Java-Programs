package Numbers;

/**
 * A neon number is a number where the sum of digits of square of the number is
 * equal to the number. The task is to check and print neon numbers in a range.... 
 * Input : 9 Output : Neon Number 
 * Explanation: square is 9*9 = 81 and sum of the digits of the square is 9.
 */
public class Neon_Number
{    
    public void main(int num)//Pure Method
    {
        if (Is_NeonNumber(num)== true)
        System.out.println(num+"  Is A Neon Number!!!!");
        else
        System.out.println(num+"  Is Not A Neon Number!!!!");
    }
    public boolean Is_NeonNumber (int num)//Impure Method
    {
        int n = num;
        num = num * num;
        int sum=0 ,p=1, rem,c=0;
        while (num!=0)
        {
            rem = num % 10 ; // To Extract Digits From The Once Digits //
            c++;
            sum = sum + rem ; // Sum Of Digits //
            num = num / 10 ;
        }
        if (sum == n)
        return true ;
        else 
        return false ;
    }   
}
