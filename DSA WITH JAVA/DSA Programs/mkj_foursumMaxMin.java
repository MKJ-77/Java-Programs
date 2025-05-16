import java.util.ArrayList;
import java.util.List;

public class mkj_foursumMaxMin {
    public static List<Integer> arr;

    public static void input() {
        arr = new ArrayList<>();
        arr.add(256741038);
        arr.add(623958417);
        arr.add(467905213);
        arr.add(714532089);
        arr.add(938071625);
    }

    public static void MaxMin() {
        arr.sort(null);
        System.out.println(arr);
        long sum = 0l;
        for (int i = 0; i < arr.size(); i++) {
            sum += arr.get(i);
        }

        //    long minsum = arr.get(0)+arr.get(1)+arr.get(2)+arr.get(3);//for minimum it gives correct sometimes
        //    long maxsum = arr.get(4)+arr.get(1)+arr.get(2)+arr.get(3);//for maximum it give wrong , it gives in exponential form
        //    System.out.println( minsum + " " + maxsum);//

        long fst = sum - arr.getLast();
        long sec = sum - arr.getFirst();
        System.out.println(fst + " " + sec);
//        System.out.println("min sum : " + df.format(minsum));
//        System.out.println("max sum : " + df.format(maxsum));
//        System.out.println( df.format(minsum) + " " + df.format(maxsum));
    }

    public static void main(String[] args) {
        input();
        System.out.println(arr);
        MaxMin();
    }
}
