public class LC2270_SplitArray {
    public static void main(String[] args) {
        LC2270_SplitArray ob = new LC2270_SplitArray();
//        System.out.println(ob.waysToSplitArray(n));
    }

    public int waysToSplitArray(int[] n) {
        int total = 0;
        int kitne = n.length;
        for (int i = 0; i < kitne; i++) {
            total += n[i];
        }
        int gold = 0, chotigold = 0;
        System.out.println(total);
        for (int i = 0; i < kitne - 1; i++) {
            chotigold += n[i];
            total -= n[i];
            if (chotigold >= total)
                gold++;
        }
        return gold;
    }
}