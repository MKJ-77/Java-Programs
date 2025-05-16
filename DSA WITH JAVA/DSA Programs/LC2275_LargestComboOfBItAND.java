import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LC2275_LargestComboOfBItAND {

    public int largestCombination(int[] candidates) {
        List<Integer> a= new ArrayList<Integer>();
        for(int i=0;i<candidates.length;i++){
            int xor=candidates[i],and=1;
            for(int j=i+1;j<candidates.length;j++){
                if((xor & candidates[j])>0){
                    and++;
                }
            }
            a.add(and);
        }
        return Collections.max(a);
    }

    public static void main(String[] args) {
        LC2275_LargestComboOfBItAND ob = new LC2275_LargestComboOfBItAND();
        int [] a={16,17,71,62,12,24,14};
        System.out.println(ob.largestCombination(a));
    }
}
