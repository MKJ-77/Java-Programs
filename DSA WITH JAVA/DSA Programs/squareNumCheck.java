public class squareNumCheck {
    public boolean compute(int n) {
        int num = n;
        int digits = 0;
        while (num != 0) {
            digits++;
            num /= 10;
        }
        int square = n * n;
        int c = 0;
        System.out.println(square);
        for (int i = 1, x=10; i <= digits; i++,x*=10) {
            c = square % x;
        }
        System.out.println(c);
        if (n == c)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int n = 25;
        squareNumCheck ob = new squareNumCheck();
        System.out.println(ob.compute(25));
    }
}
