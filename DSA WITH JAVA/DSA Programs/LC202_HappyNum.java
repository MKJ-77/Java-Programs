public class LC202_HappyNum {
    public void main(String[] args) {
        System.out.println(chkHappy(7));
    }
    public boolean chkHappy(int n){
        if(n==1 || n==7)
            return true;
        else if(n<10)
            return false;
        int sum = 0;
        while( n != 0 ){
            int d =n%10;
            sum += (d)*(d);
            n /= 10;
        }
        return chkHappy(sum);
    }
}
