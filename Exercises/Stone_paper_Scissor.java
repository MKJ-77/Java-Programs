package Exercises;
import java.util.*;
class Stone_paper_Scissor
{
    static int n;//no. of rounds
    static int p,c;//Player's and Computer's Score
    static String[] o = {"stone", "paper", "scissor"};
    static String ch;
    static Scanner sc = new Scanner(System.in);  
    static Stone_paper_Scissor ob = new Stone_paper_Scissor();
    public Stone_paper_Scissor(){
        n=0;
        p=0;
        c=0;
        ch="";
    }

    public static void main(String[] args)
    {
        Stone_paper_Scissor sps =new Stone_paper_Scissor();
        sps.Rounds();
        sps.GameBegun();
    }

    public void GameBegun () {
        System.out.println("NOW GAME BEGINS");
        for (int i = 1; i <= n; i++)
        {
            String pc = ob.PLayer_Choice();
            String my = ob.MY_Choice();
            ob.Let_SEE_Who_WIN(pc,my);
        }
    }

    public void Rounds(){
        do {
            System.out.println("ENTER THE NUMBER OF ODD ROUNDS YOU WANT TO PlAY");
            n=sc.nextInt();
        }while(n%2==0);
    }

    public String PLayer_Choice(){
        System.out.println("Enter 'stone' or 'paper' or 'scissor' as your Choice" +'\n'+
            "And if you want to Quit enter 'quit'");
        String pc = sc.next();
        return pc.toLowerCase();
    }

    public String MY_Choice(){
        int r = (int) (Math.random() * 3);
        return o[r];
    }

    public void Let_SEE_Who_WIN(String pc ,String my){
        if (pc.equalsIgnoreCase("quit")) {
            System.out.println("THANKS FOR PLAYING WITH ME");
            System.exit(0);
        }
        System.out.println("I Choose : "+my);
        if (pc.equalsIgnoreCase("paper") && my.equalsIgnoreCase("scissor")
        || pc.equalsIgnoreCase("stone") && my.equalsIgnoreCase("paper")
        || pc.equalsIgnoreCase("scissor") && my.equalsIgnoreCase("stone"))
        {
            System.out.println("I WON THIS ROUND !!!!");
            c++;
        }

        else if (pc.equalsIgnoreCase(my)) {
            System.out.println("THERE IS A TIE B/W ME N YOU !!!!");
        }
        else
        {
            System.out.println("YOU WON THIS ROUND");
            p++;
        }
    }

    public void GameEnd () {
        if (p > c)
        {
            System.out.println("YOU WON THE MATCH OF " + n + " ROUNDS BY " + (p - c) + " POINTS !!!");
            System.out.println("BUT I'LL BE READY NEXT MATCH");
        }
        else if (p == c)
            System.out.println("THERE'S A TIE BETWEEN YOU AND ME IN THIS MATCH !!!");
        else
            System.out.println("I WON THE MATCH BY " + (c - p) + " PONITS !!!");
        System.out.println("THANKS FOR PLAYING WITH ME");
    }
}