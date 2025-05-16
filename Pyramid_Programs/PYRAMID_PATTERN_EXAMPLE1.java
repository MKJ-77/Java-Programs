package Pyramid_Programs;
/*      1
      2 3 2
    3 4 5 4 3
  4 5 6 7 6 5 4
5 6 7 8 9 8 7 6 5  */
public class PYRAMID_PATTERN_EXAMPLE1
{
    public static void main(String[] args)
    {
        int rows = 5, k = 0, count = 0, count1 = 0;
        for(int i = 1; i <= rows; ++i)
        {
            int l=i*2;
            for(int space = 1; space <= rows - i; ++space)
            {
                System.out.print(" "); ++count; }
            for(k=0;k!=l-1;)
            {
                if (count <= rows - 1)
                {
                    System.out.print((i + k));
                    ++count;
                }                                    
                else
                {
                    ++count1;
                    System.out.print((i + k - 2 * count1));
                }
                ++k;
            }
            count1 = 0; count =0;
            System.out.println();
        }
    }
}