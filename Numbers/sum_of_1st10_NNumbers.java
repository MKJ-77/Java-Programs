package Numbers;

class sum_of_1st10_NNumbers
{
    public void main()
    {
        int i=1,s=0;
        System.out.println ("the first ten natural number-");
       while(i<11)
       {
           s=s+i;
           System.out.print (i+'\n');
           i++;
       }
       System.out.println ("Sum of first ten natural numbers="+s);
    }
}
           