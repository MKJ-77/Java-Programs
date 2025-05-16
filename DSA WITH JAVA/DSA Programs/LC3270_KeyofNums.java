import java.sql.SQLOutput;

public class LC3270_KeyofNums {
    public int generateKey(int num1, int num2, int num3) {
        String n1=Padding(num1),n2=Padding(num2),n3=Padding(num3);
//        int d1=digi(n1,n2,n3,0);
//        int d2=digi(n1,n2,n3,1);
//        int d3=digi(n1,n2,n3,2);
//        int d4=digi(n1,n2,n3,3);
        int result=0;
        for(int i=0;i<4;i++){
            result = result*10+digi(n1,n2,n3,i);
        }
        return result;
    }
    public int digi(String n1,String n2,String n3,int index){
        int a=Integer.parseInt(n1.charAt(index)+"");
        int b=Integer.parseInt(n2.charAt(index)+"");
        int c=Integer.parseInt(n3.charAt(index)+"");
        return a<b?Math.min(a,c):Math.min(b,c);
    }
    public String Padding(int n){
        if(n>0 && n<10)
            return "000"+n;
        else if(n>=10 && n<100)
            return "00"+n;
        else if(n>=100 && n<1000)
            return "0"+n;
        else
            return n+"";
    }

    public static void main(String[] args) {
        LC3270_KeyofNums ob = new LC3270_KeyofNums();
        System.out.println(ob.generateKey(987,879,789));
    }

}

