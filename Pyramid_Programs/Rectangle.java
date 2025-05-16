package Pyramid_Programs;
import java.util.Scanner;

public class Rectangle {
    short length,breadth;
    public Rectangle(short length , short breadth){
        this.length=length;
        this.breadth=breadth;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Lambai batao");
        short lambai= sc.nextShort();
        System.out.println("Chaudai batao");
        short chaudai= sc.nextShort();
        Rectangle ob=new Rectangle(lambai,chaudai);
        ob.Rect_Banao();
    }
//    j=1         j=length
//    *************  i=1
//    *           *
//    ************* i=breadth
    public void Rect_Banao() {
        for (int i = 1; i <= breadth; i++) {
            for (int j = 1; j <= length; j++) {
                if (i == 1 || i == breadth)
                    System.out.print("*  ");
                else if (j == 1 || j == length)
                    System.out.print("*  ");
                else
                    System.out.print("   ");
            }
            System.out.println();
        }
    }
}