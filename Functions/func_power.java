package Functions;

class func_power
{
    int power(int a,int b)
    {
        int i,p=1;
        for(i=1; i<=b ;i++)
        {
            p=a*p;
        }
        return p;
    }
    public void main (int x,int y)
    {
        int res = power(x,y);
        System.out.println("power is "+ res);
    }
}