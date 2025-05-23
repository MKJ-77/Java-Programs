import java.util.Arrays;
import java.util.Scanner;

//You are given an integer array score of size n, where score[i] is the score of the
// ith athlete in a competition. All the scores are guaranteed to be unique.
//The athletes are placed based on their scores, where the 1st place athlete
// has the highest score, the 2nd place athlete has the 2nd highest score, and so on.
// The placement of each athlete determines their rank:
//
//The 1st place athlete's rank is "Gold Medal".
//The 2nd place athlete's rank is "Silver Medal".
//The 3rd place athlete's rank is "Bronze Medal".
//For the 4th place to the nth place athlete,
// their rank is their placement number (i.e., the xth place athlete's rank is "x").
//    Return an array answer of size n where answer[i] is the rank of the ith athlete.
//  Example 1:
//
//        Input: score = [5,4,3,2,1]
//  Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
//  Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
public class LC506_RelativeRank {
    static Scanner sc=new Scanner(System.in);

    public int[] setScore(int n) {
        int[] score = new int[n];
        for (int i = 0; i < score.length; i++) {
            System.out.println("Enter the Score : ");
            score[i] = sc.nextInt();

        }
        return score;
    }
//    String [] medal=new String[score.length];
//    String[] m={"Gold Medal","Silver Medal","Bronze Medal"};
//    public String[] givemedals(int max,int[]score)
//    {
//        String[] m={"Gold Medal","Silver Medal","Bronze Medal"};
//        if(score[max]==-1)
//            return medal;
//        for(int j=0 ; j<score.length-1 ;j++){
//            if(score[max] <= score[j+1])
//                max=j+1;
//        }
//        givemedals();
//    }

    public String[] GiveMedals(int[]score){
        String [] medal=new String[score.length];
        String[] m={"Gold Medal","Silver Medal","Bronze Medal"};
        for(int i=0 , max=0 ; i<score.length ; i++ , max=0 ){
            for(int j=0 ; j<score.length-1 ;j++){
                if(score[max] <= score[j+1])
                    max=j+1;
            }
//            System.out.println(max);
            score[max]=-1;
//            System.out.println(Arrays.toString(score));
            if(i<=2)
                medal[max]=m[i];
            else
                medal[max] = String.valueOf(i+1);

        }
        return medal;
    }

    public static void main(String[] args) {
        LC506_RelativeRank ob = new LC506_RelativeRank();
        System.out.println("Enter total No. of Candidates : ");
        int n=sc.nextInt();
        int [] score=ob.setScore(n);
        System.out.println(Arrays.toString(score));
        System.out.println(Arrays.toString(ob.GiveMedals(score)));
        System.out.println(Arrays.toString(score));
    }
}
