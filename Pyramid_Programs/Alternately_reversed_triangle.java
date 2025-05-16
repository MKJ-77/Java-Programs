package Pyramid_Programs;
public class Alternately_reversed_triangle
{
    /** P1   |         
     *__________|
     * 1        |             
     * 21       |         
     * 123      |         
     * 4321     |         
     * 12345    |
     * 654321   |
     * 1234567  |
     *__________|  */
    public void main(int rows)
    {
        int r=rows;
        for(int i=1;i<=r;i++)
        {
            for(int k=1,j=i;k<=i;k++,j--)
            {
                if(i%2==0)
                System.out.print(j);
                else
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
