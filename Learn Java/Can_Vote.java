import java.util.*;
public class Can_Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int age = sc.nextInt();
        if(age<=18) System.out.println("sabar Kro");
        else if(age>=80) System.out.println("Live peacefully bro Please Rest");
        else System.out.println("Vote Karo na Bhai");
    }
}
