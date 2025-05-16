package Numbers;

class DigitSumPalindrome{
	int isDigitSumPalindrome(int N) 
    {   
        int sd=0;
        while(N!=0)
        {
            int d= N%10;
            sd+=d;
            N/=10;
        }
        int m=sd;
        int n=0;
        while(sd!=0)
        {
            int r = sd%10;
            n+=r;
            sd/=10;
            if(sd>0)
            n*=10;
        }
        if(n==m)
        return 1;
        else 
        return 0;        
    }
}