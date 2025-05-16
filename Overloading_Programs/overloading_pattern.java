public class overloading_pattern
{
    public void  pattern(char ch,int n)
    {
        for (int i=1;i<=n;i++)
        {
            for (int k=1;k<=i;k++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public double pattern(double x, double n)
    {
        double s=x/n;
        for (int i=-1;i<=1;i++)
        {
            s=s+x/(n-i);
        }
        return s;
    }
    void main(double x, double n)
    {
        double s=pattern(x,n);
        System.out.println( "sum of series= "+s);
    }
}
