import java.util.ArrayList;
import java.util.List;

// Explanation:
// ForExample
// https://www.blogoncode.com/2021/08/between-two-sets-java.html
/*
There will be two arrays of integers. Determine all integers that satisfy the following two conditions:

        The elements of the first array are all factors of the integer being considered
        The integer being considered is a factor of all elements of the second array
        These numbers are referred to as being between the two arrays. Determine how many such numbers exist.

        So we have to all common numbers that are

        Multiple of first array and
        Factors of second array
*/
public class mkj_Between2Sets {
    public static List<Integer> a, b;
    public static List<Integer> X;

    public static void geta() {
        a = new ArrayList<>();
        a.add(100);
        a.add(99);
        a.add(98);
        a.add(97);
        a.add(96);
        a.add(95);
        a.add(94);
        a.add(93);
        a.add(92);
        a.add(91);
        a.sort(null);
    }

    public static void getb() {
        b = new ArrayList<>();
        b.add(1);
        b.add(2);
        b.add(3);
        b.add(4);
        b.add(5);
        b.add(6);
        b.add(7);
        b.add(8);
        b.add(9);
        b.add(10);
        b.sort(null);
    }

    public static double gcd(double num1, double num2) {
        if (num1 == 1 || num2 == 1) {
            return 1;
        }
        double gcd = 1;
        for (int i = 2; i <= Math.max(num1, num2); i++) {
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;
        }
        return gcd;
    }

    public static double lcm(double num1, double num2) {
        if (num1 == 0 || num2 == 0)
            return 0;
        double lcm = 1;
//        for (int i = 2; num1 != 0 || num2 != 0; i++) {
//            if (num1 % i == 0 && num2 % i == 0) {
//                num1 /= i;
//                num2 /= i;
//                lcm *= i;
//            } else if (num1 % i == 0 && num2 % i != 0)
//                num1 /= i;
//                if (num1 % i == 0){
//
//                }
//        }
        lcm = (num1 * num2) / gcd(num1, num2);
        return lcm;
    }

    public static int GetTotalX() {
        double gcd = b.get(0);
        for (int i = 0; i < b.size(); i++) {
            if (b.contains(1)) {
                gcd = 1;
                break;
            }
            gcd = gcd(gcd, b.get(i));
        }
        System.out.println(gcd);

        double lcm = 1;
        for (int i = 0; i < a.size(); i++) {
            if (lcm == 0)
                break;
            lcm = lcm(lcm, a.get(i));
        }
        System.out.println(lcm);

        double lcmMultiple = lcm;
        int result = 0;
        while (lcmMultiple <= gcd) {
//            System.out.println(lcmMultiple);
            if (gcd % lcmMultiple == 0) {
                result++;
            }
            lcmMultiple += lcmMultiple;
        }
        System.out.println(X);
        return result;
    }

    public static void main(String[] args) {
        geta();
        getb();
        X = new ArrayList<>();
        System.out.println(GetTotalX());
    }
}
