package Numbers;

class Power_of_Number
{
    public void main(int number,int power)
    {
        double value=1;
        for(int i=1;i<=power;i++)
        {
            value=value*number ;
        }
        System.out.println(value);
    }
}
        
        
            