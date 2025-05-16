import java.util.Arrays;

public class LC04_MedianOfSortedArray {

    public double findMedianSortedArrays(int[] n1, int[] n2) {
        int m = n1.length, n = n2.length, c = 0;
        int[] ab = new int[m + n];
        int i, x, j;
        for (i = 0, j = 0, x = 0; i < m + n; ) {
            if (i == m) {
                System.out.println("Breaking n1"+" i = "+i+" j = "+j);
                c = 1;
                break;
            }
            if (j == n) {
                System.out.println("Breaking n2"+" i = "+i+" j = "+j);
                c = 2;
                break;
            }
            System.out.println(" i = "+i+" j = "+j);
            if (n1[i] > n2[j]) {
                ab[x] = n2[j];
                ++j;
                x++;
            } else {
                ab[x] = n1[i];
                ++i;
                x++;
            }
            System.out.println(Arrays.toString(ab));
        }
        System.out.println("After Loop "+Arrays.toString(ab));
        System.out.println(" i = "+i+" j = "+j);
        if (c == 1) {
            for (; j < n; j++,x++) {
                System.out.println(n2[j]);
                ab[x] = n2[j];
            }
        } else if (c == 2) {
            for (; i < m; i++,x++) {
                ab[x] = n1[i];
            }
        }
        System.out.println("After Condition "+Arrays.toString(ab));
        if ((m + n) % 2 == 0) {
            int med = ab[(m + n) / 2 - 1] + ab[(m + n + 2) / 2 - 1];
            return med / 2.0;
        } else {
            int med = ab[(m + n+1) / 2-1];
            return med;
        }
    }

    public static void main(String[] args) {
        int[] n1 = {1, 2};
        int[] n2 = {3,4};
        LC04_MedianOfSortedArray ob = new LC04_MedianOfSortedArray();
        System.out.println(ob.findMedianSortedArrays(n1, n2));
    }
}
