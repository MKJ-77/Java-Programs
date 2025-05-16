public class LC670_Maximum_Swap {
    public int maximumSwap(int num) {
        String nu = STR."\{num}";
        char [] n= nu.toCharArray();
        char max= '0';
        int c = 0;
        for (int i = 0; i < n.length; i++ ) {
            char a = n[i];
            if (a >= max) {
                max = a;
                c = i;
            }
        }

        int result = 0;

        for (int i = 0; i < c; i++) {
            char a = n[i];
            if (a < max) {
                n[i] = n[c];
                n[c] = a;
            }
        }
        return result;
    }
}