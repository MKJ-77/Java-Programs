import java.util.Arrays;

public class LC238_ProductExceptSelf {
    public static void main(String[] args) {
        int [] num = {1,9,0,-6};
        LC238_ProductExceptSelf ob = new LC238_ProductExceptSelf();
        System.out.println(Arrays.toString(ob.productExceptSelf(num)));
    }
    public int[] productExceptSelf(int[] num) {
        int l=num.length;
        int p = 1 , c = 0  ;
        for(int i = 0 ; i < l ; i++){
            if(num[i] == 0){
                c++; continue;
            }else
                p *= num[i];
        }
        if(c == l) p = 0;
        for(int i = 0 ; i < l ; i++){
            if(num[i] != 0 ){
                if( c != 0 )
                    num[i] = 0;
                else
                    num[i] = p / num[i];
            }else{
                num[i] = p;
            }
        }
        return num;
    }

}
