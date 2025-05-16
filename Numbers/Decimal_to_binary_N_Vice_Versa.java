package Numbers;

class Decimal_to_binary_N_Vice_Versa
{
    public void DecimalToBinary(int Decimal_num)
    {
        int n=Decimal_num, count = 0, a;
        String x = "";
        while(n > 0)
        {
            a = n % 2;
            if(a == 1)
            {
                count++;
            }
            x = a + "" + x;
            n = n / 2;
        }
        System.out.println("Binary number:"+x);
    }
    public void BinaryToDecimal(int Binary_num)
    {
        int d=0,n=Binary_num;
        for( int m=n , i=0 ; m!=0 ; i++, m/=10)
        {
            d+=(m%10)*Math.pow(2,i);
        }
        System.out.println(d);
    }
}