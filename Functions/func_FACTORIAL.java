package Functions;

public class func_FACTORIAL
{
    public void main(int n)
    {
        
        System.out.println("factorial="+factorial(n));
    }
    public int factorial(int n)
    {
        int fact=1;
        for(int i=1;i<=n;i++)
        {
           fact=fact*i; 
        }
        return fact;
    }
}

