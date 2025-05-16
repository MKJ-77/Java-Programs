public class LC07_ReverseNum {
    public int reverse(int x) {
        String s;
        StringBuilder sb ;
        if (x < 0){
            s = STR."\{x}";
            sb = new StringBuilder(s.substring(1));
            System.out.println("Negative");
        }
        else{
            s = STR."\{x}";
            sb = new StringBuilder(s);
            System.out.println("Positive");
        }

        System.out.println(x<0);
        System.out.println(sb);
        System.out.println(Math.pow(2,31));
        System.out.println(Double.parseDouble(sb.toString()) < (Math.pow(2, 31) - 1));
        sb.reverse();
        if (Double.parseDouble(sb.toString()) < (Math.pow(2, 31) - 1) && Double.parseDouble(sb.toString()) > Math.pow(-2,31)) {
            if (x < 0)
                return -Integer.parseInt(sb.toString());
            else
                return Integer.parseInt(sb.toString());

        }else return 0;
    }

    public static void main(String[] args) {
        int num = 123;
        LC07_ReverseNum ob = new LC07_ReverseNum();
        System.out.println(ob.reverse(num));
    }

}
