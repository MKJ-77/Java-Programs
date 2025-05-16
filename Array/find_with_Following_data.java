package Array;
public class find_with_Following_data
{
    /**
     * Write a program to find from the following data: 17, 20, 24, 29, 16, 87, 19, 52
     * i) The largest and smallest element 
     * b) Product of the odd numbers 
     * c) sum of the even numbers
     */
    public void main()
    {
        int a[]={17, 20, 24, 29, 16, 87, 19, 52};
        int i,j,even=0,odd=1,max=0,min=100;
        for(i=0 ;i<=7;i++)
        {
            max=Math.max(max,a[i]);
            min=Math.min(min,a[i]);
            if(a[i]%2!=0)
                odd*=a[i];
            else
                even+=a[i];
        }
        System.out.println("Maximum Number := "+max);
        System.out.println("Minimum Number := "+min);
        System.out.println("Sum of Even Numbers := "+even);
        System.out.println("Product of Odd Numbers := "+odd);
    }
}
