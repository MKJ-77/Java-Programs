public class mkj_RepeatedString {
    String s;
    int n;

    public void input() {
        s = "aba";
        s = s.toLowerCase();
        n = 10;
    }

    public int CalculateX(char X) {
        int c = 0;
        int l = s.length();
        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == X)
                c++;
        }
        if (n % l == 0) {
            return (n / l) * c;
        } else {
            int left = (n % l);
            int x = c*( (int) n / l);
            for (int i = 0; i < left; i++) {
                if (s.charAt(i) == X)
                    x++;
            }
            return x;
        }


    }

    public static void main(String[] args) {
        mkj_RepeatedString ob = new mkj_RepeatedString();
        ob.input();
        System.out.println(ob.s);
        System.out.println(ob.n);
        System.out.println(ob.CalculateX('a'));
    }
}
