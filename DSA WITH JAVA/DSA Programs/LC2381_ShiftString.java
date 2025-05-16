import java.util.Arrays;

public class LC2381_ShiftString {
    public String shiftingLetters(String s, int[][] sarkao) {
        int n = sarkao.length;
        int l = s.length();
        char[] ch = s.toCharArray();
        int[] ks = new int[l];//Overall sarkana hai
        for (int i = 0; i < n; i++) {
            int str = sarkao[i][0];
            int end = sarkao[i][1];
            int AP = sarkao[i][2];
//            System.out.println(Arrays.toString(ks));
            for (; str <= end; str++) {
                if (AP == 1)
                    ks[str]++;
                else
                    ks[str]--;
            }
        }
//        System.out.println(Arrays.toString(ks));
        for (int i = 0; i < l; i++) {
            int KitnaSarkaoge = ks[i];
            ch[i] += KitnaSarkaoge;
        }
        s = String.valueOf(ch);
        return s;
    }

    public static void main(String[] args) {
        String s = "abc";
        int[][] ar = {{0, 1, 0}, {1, 2, 1}, {0, 2, 1}};
        LC2381_ShiftString ob = new LC2381_ShiftString();
        String res = ob.shiftingLetters(s, ar);
        System.out.println(res);
    }
}
