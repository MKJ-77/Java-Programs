public class LC168_ColoumnName {
    public String convertToTitle(int cN) {
        String S = "";
        char[] alpha = {'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y'};
        while (cN >= 1) {
            int x = cN % 26;
            if (x == 0) {
                S = alpha[x] + S;
                cN = cN / 26 - 1;
            } else {
                S = alpha[x] + S;
                cN/=26;
            }

//            System.out.println(S);
        }
        return S;
    }

    public static void main(String[] args) {
        LC168_ColoumnName ob = new LC168_ColoumnName();
        System.out.println(ob.convertToTitle(53));
    }
}
