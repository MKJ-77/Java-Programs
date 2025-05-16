public class LC204_CountPrimes {
    public static void main(String[] args) {
        LC204_CountPrimes ob = new LC204_CountPrimes();
        System.out.println(ob.countPrimes(499911));
    }

    public int countPrimes(int n) {
        boolean[] ar = new boolean[n+1];
        ar[0]=false;
        ar[1]=false;
        for (int i = 2; i < n; i++) {
            ar[i] = true;
        }
        for (int p = 2; p*p < n; p++) {
            if (ar[p] == true) {
                for (int j = p*p; j < n; j+=p) {
                    ar[j]=false;
                }
            }
        }
        int c=0;
        for (int i = 2; i <= n; i++) {
            if (ar[i] == true) c++;
        }
        return c;
    }

//    public int countPrimes(int n) {
//        int c=0,mid;
//        if(n/2==0){
//            mid =n/2;
//        }else mid = (n+1)/2;
//
//        for(int i=2,j=n-1;i <= mid && j>=mid ;i++,j--){
//            System.out.println(i+" "+j);
//            if(isPrime(i)){
//                c++;
//                System.out.println("i = " +i);
//            }
//                if(i==j)break;
//            if(isPrime(j)){
//                c++;
//                System.out.println("j = "+j);
//            }
//        }
//        return c;
//    }

//    public boolean isPrime(int a) {
//        int c1, c2;
//        for (int i = 2, j = a - 1; i < a / 2 || j > a / 2; i++, j--) {
//            if (a % i == 0 || a % j == 0)
//                return false;
//        }
//        return true;
//    }
}
