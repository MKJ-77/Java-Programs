public class rev_num {
    public static void main(String[] args) {
        int n = 1789;
        int rev_num = 0;
        while (n != 0) {
            int rem = n % 10;
            rev_num = (rev_num * 10) + rem;
            n /= 10;
        }
        System.out.println(rev_num);
        rev_num ob =new rev_num();
        ob.armstrong();
    }

    void armstrong(){
        int n = 153;
        int num=n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += (rem*rem*rem) ;
            n /= 10;
        }
        System.out.println(sum==num);
    }
//    void add(int a,int b){
//        System.out.println(a+b);
//    }
}
