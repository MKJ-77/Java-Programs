import java.sql.SQLOutput;

public class LC231_PowerOf2 {
    public boolean isPowerOfTwo(int n) {
        double lg=Math.log(n)/Math.log(2);
        System.out.println(Math.log(n));
        System.out.println(Math.log(2));
        System.out.println(lg);
        int in=(int) lg;
        if(lg-in == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        LC231_PowerOf2 ob = new LC231_PowerOf2();
        System.out.println(ob.isPowerOfTwo(536870912));
    }

}
