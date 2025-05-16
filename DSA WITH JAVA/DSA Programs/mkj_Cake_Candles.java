import java.util.ArrayList;
import java.util.List;

public class mkj_Cake_Candles {
    public static List<Integer> candles;

    public static void GetCandles() {
        candles = new ArrayList<>();
        candles.add(1);
        candles.add(1);
        candles.add(2);
        candles.add(3);
        candles.add(4);
        candles.add(2);
        candles.add(3);
        candles.add(4);
        candles.add(2);
        candles.add(3);
        candles.add(4);
        candles.add(4);
    }

    public static void main(String[] args) {
        GetCandles();
        System.out.println(candles);
        System.out.println(birthdayCakeCandles());
    }

//     Solving the Question in Big O(n)
//    Where n= total number of candles
    public static int birthdayCakeCandles() {
//     Write your code here
        int bigCandle = 0;  //storing the biggest candle size
//    Finding the Biggest Candle Size in the Candles arraylist
        for (int i = 0; i < candles.size(); i++) {
            bigCandle = Math.max(bigCandle, candles.get(i));
        }
        int count = 0; //counter to count number of big candles
        for (int i = 0; i < candles.size(); i++) {
            if (bigCandle == candles.get(i)) count++;
        }
        return count;
    }
}
