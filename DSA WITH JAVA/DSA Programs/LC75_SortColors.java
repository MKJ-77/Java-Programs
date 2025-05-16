public class LC75_SortColors {
    public static void main(String[] args) {
        LC75_SortColors ob = new LC75_SortColors();
        int []a={1,1,1,1,2,2,2,2,2,2,0,0,0,0,0,0};
        ob.sortColors(a);
    }
    public void sortColors(int[] niggu) {
        int laal=0,safed=0,neel=0,lambai = niggu.length;
        for(int i = 0 ;i < lambai ; i++){
            if(niggu[i]==0) laal++;
            else if(niggu[i]==1) safed++;
            else neel++;
        }
        int i = 0 ;
        for(;i < laal;i++){
            niggu[i] = 0;
        }
        for(;i < safed+laal;i++){
            niggu[i] = 1;
        }
        for(;i < lambai;i++){
            niggu[i] = 2;
        }
    }
}
