import java.util.Arrays;
import java.util.HashMap;
public class LC2559_vowelWrdQuery {
    public int[] vowelStrings(String[] shabd, int[][] sawal) {
        HashMap<Integer, String> bc = new HashMap<Integer, String>();
        int n = shabd.length;
        String vowels = "aeiou";
        for(int i=0 ; i < n;i++){
            String wrd = shabd[i];
            char starch= wrd.charAt(0);
            char endch= wrd.charAt(wrd.length()-1);
            if(vowels.contains(starch+"") && vowels.contains(endch+"")){
                bc.put(i,wrd);
            }
        }
        System.out.println(bc);
        int m=sawal.length;
        int[] res = new int[m];
        for(int i = 0 ; i < m ; i++){
            int startrange = sawal[i][0];
            int endrange = sawal[i][1];
            int c = 0;
            for(int chabi : bc.keySet()){
                if(chabi >= startrange && chabi <= endrange){
                    c++;
                }
            }
            res[i] = c;
        }
        return res;
    }

    public static void main(String[] args) {
        String[] wrd ={"aba","bcb","ece","aa","e"};
        int [][] query = {{0,1},{0,4},{1,1}};
        System.out.println(Arrays.toString(wrd));
//        System.out.println((Arrays.toString(query)));
        LC2559_vowelWrdQuery ob = new LC2559_vowelWrdQuery();
        System.out.println(Arrays.toString(ob.vowelStrings(wrd, query)));
    }
}
