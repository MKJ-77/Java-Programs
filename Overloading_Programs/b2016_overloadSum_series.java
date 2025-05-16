package Overloading_Programs;

 
/**______________________________________________________________|
      Board paper 2016 question 7 to print the sum of the series |
--------------void sumseries(int n, double x)--------------------|
      sum=x/1-x/2+x/3.........n                                  |
--------------void sumseries()-----------------------------------|
      sum=1+(1*2)+(1*2*3)+(1*2*3*4)+...........+(1*2*3*4*...*20);|
_________________________________________________________________|        
 */
class b2016_overloadSum_series
{
    void Sum_series(int n, double x)
    {
        double s1=0,sum=0.0;
        for (int i=1 ;i<=n;i+=2)
        {
            s1 = s1 + (x/i);
        }
        for (int i=2 ; i<=n ; i=i+2)
        {
            sum = sum + (x/i);
        }
        sum = s1 - sum ;
        System.out.println("Sum of Series : " + sum);
    }
    void Sum_series()
    {
        int sum = 0 , product =1;
        for (int i=1; i<=20; i++)
        {
            for (int k=1 ;k<=i ;k++)
            {
                product =product*k;
            }
            sum=sum+product;
        }
        System.out.println("Sum of series : " +sum);
    }
}
