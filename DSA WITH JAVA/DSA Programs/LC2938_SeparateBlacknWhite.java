import java.util.Arrays;

public class LC2938_SeparateBlacknWhite {
    int c = 0;

    public long minimumSteps(String s) {
        char[] ar = s.toCharArray();

        System.out.println(Arrays.toString(ar));
        while ((s.indexOf("1") < s.lastIndexOf("0"))) {
            ar = sort(ar);
            s = new String(ar);
        }
        return c;
    }

    char[] sort(char[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i; j <= ar.length - i - 2; j++) {
                if (ar[j] > ar[j + 1]) {
                    char temp = ar[j];
                    ar[j] = ar[j + 1];
                    ar[j + 1] = temp;
                    c++;
                    System.out.println(Arrays.toString(ar));
                }
            }
        }
        return ar;
    }

    public static void main(String[] args) {
        LC2938_SeparateBlacknWhite ob = new LC2938_SeparateBlacknWhite();
        System.out.println(ob.minimumSteps("111111011"));
    }
}
