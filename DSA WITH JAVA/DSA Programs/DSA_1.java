import java.util.Scanner;
public class DSA_1 {
    int [] arr;
    int size,capacity;
    static int pos;
    static Scanner sc =new Scanner(System.in);

    public DSA_1(int size){
        this.size=size;
        this.capacity=20;
        arr=new int[capacity];
    }

    public void setArr() {
        for(int i=0;i<size;i++) {
            System.out.print("Enter "+(i+1)+" Element of Array ");
            arr[i]=sc.nextInt();
        }
    }

    void CheckValidRange(){
        if(size>capacity){
            System.out.println("Capacity of Array is : "+capacity);
            System.exit(0);
        }
        if(pos>capacity){
            System.out.println("OverFlow");
            System.exit(0);
        }
        if(pos>size){
            System.out.println("PLEASE RE-ENTER THE POSITION IN RANGE 1-"+size);
            System.exit(0);
        }
    }

    public void shift1(int x){
        arr[size] = arr[pos - 1];
        arr[pos - 1] = x;
        size++;
    }

    public void shift2(int x){
        for (int i = size; i !=pos-1 ; i--) {
            arr[i]=arr[i-1];
        }
        arr[pos-1]=x;
        size++;
    }

    public void PrintAllDetails(){
        System.out.println("Size of Array : "+size);
        System.out.println("Elements of the Array -> ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    void Insert_Elements(int x){
        System.out.println("Method 1 : Inserting the element at given position " +
                "and placing the original element to the end ");
        System.out.println("Method 2 : Inserting the element exactly between " +
                "disturbing other elements ");
        System.out.println("Enter 1 or 2 -->");
        int ch=sc.nextInt();
        switch (ch){
            case 1:
                shift1(x);
                break;
            case 2:
                shift2(x);
                break;
            default:
                System.out.println("YAAR EK CHOICE TO SAHI DAAl DO");
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter Size : ");
        int size=sc.nextInt();
        DSA_1 ob=new DSA_1(size);
        ob.CheckValidRange();
        ob.setArr();
        System.out.println("Enter New Element : ");
        int x=sc.nextInt();
        System.out.println("Enter Position of New Element IN RANGE 1-"+size+" : ");
        pos=sc.nextInt();
        ob.CheckValidRange();
        ob.Insert_Elements(x);
        ob.PrintAllDetails();
    }
}
