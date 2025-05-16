import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class mkj_findRatio {
    public static List<Integer> arr;

    public mkj_findRatio() {
        arr = new ArrayList<>();
    }

    public static void addElements() {
        arr.add(1);
        arr.add(2);
        arr.add(120);
        arr.add(-20);
        arr.add(-50);
        arr.add(-1);
    }

    public static void main(String[] args) {
        mkj_findRatio ob=new mkj_findRatio();
        addElements();
        System.out.println(arr);
        plusMinus();
    }

    public static void plusMinus() {
        // Write your code here
        double zeros = 0;// No. of Zeros
        double pos = 0, neg = 0;// Positive numbers && Negative numbers
        arr.sort(null);
        System.out.println(arr);
        if (arr.contains(0)) {
            neg = arr.indexOf(0);
            zeros = arr.lastIndexOf(0) - neg + 1;
            pos = arr.size() - 1 - arr.lastIndexOf(0);
        } else {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) < 0) {
                    neg++;
                } else {
                    break;
                }
            }
            pos=arr.size()-neg;
        }
        pos /= arr.size();
        neg /= arr.size();
        zeros /= arr.size();
        DecimalFormat df = new DecimalFormat("0.000000");
        System.out.println(df.format(pos));
        System.out.println(df.format(neg));
        System.out.println(df.format(zeros));
    }
}
