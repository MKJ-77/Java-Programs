public class LC67_AddBin {
    public String addBinary(String a, String b) {
        String result = "";
        int sum = 0, carry = 0;
        int fl = a.length() - 1, sl = b.length() - 1;
        for (int fn, sn; ; fl--, sl--) {
            if (fl >= 0 || sl >= 0) {
                if (fl >= 0) {
                    fn = Integer.parseInt(STR."\{a.charAt(fl)}");
                } else {
                    fn = 0;
                }
                if (sl >= 0) {
                    sn = Integer.parseInt(STR."\{b.charAt(sl)}");
                } else {
                    sn = 0;
                }
            } else break;
            sum = fn ^ sn ^ carry;
            carry = (carry & (fn ^ sn)) | (fn & sn);
            System.out.println("fn = " + fn + " sn = " + sn + "\nSum : " + sum + " Carry : " + carry);
            result = sum + result;
        }
        if(carry==1)
            result = carry + result;
        return result;
    }

    public static void main(String[] args) {
        LC67_AddBin ob = new LC67_AddBin();
        String a = "0001", b = "100111110011000000000";
        String x = ob.addBinary(a, b);
        System.out.println(x);
    }
}
