package Exercises;
import java.util.Random;
import java.util.*;
public class Hand_Cricket_With_Computer 
{
    int ch;
    public void Toss(int ch)
    {
        ch=ch;
    }

    public void check_ImplementChoice()
    {
        if (ch==1)
        {
            Coin();
        }
        else if(ch==2)
        {
            EVEN_ODD();
        }
    }

    public int Coin()
    {
        System.out.println("Enter Head or Tail.");
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter Your Choice 'Head' or 'Tail'");
        String ch=sc.next();
        ch= ch.toUpperCase();
        String ch1[]= {"HEAD","TAIL"};
        int i =(int) (Math.random()*2);
        System.out.println("Toss :"+ch1[i]);
        if(ch1[i].equals(ch))
        {
            System.out.println("You Won the Toss");
            System.out.println("Choose 'Bat' or 'Ball'");
            String d = sc.next();
            if (d.equalsIgnoreCase("BAT"))
                return 1;//Player is batting
            else if (d.equalsIgnoreCase("Quit") || d.equalsIgnoreCase("Exit"))
            {
                return 2;
            }
            else
                return 0;//Player is Balling
        }
        else
        {
            System.out.println("Computer Won the Toss");
            int c=(int) (Math.random()*2);
            if(c==0)
            {
                System.out.println("Computer Chooses Ball first");
                return 1;
            }
            else
            {
                System.out.println("Computer Chooses Bat first");
                return 0;
            }
        }
    }

    public int EVEN_ODD ()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter Your Choice 'ODD' or 'EVEN'");
        String ch=sc.next();
        ch= ch.toUpperCase();
        if(ch.equalsIgnoreCase("Quit") || ch.equalsIgnoreCase("exit"))
            return 2;
        System.out.println("Enter your run");
        int r=sc.nextInt();
        String d;
        int c =(int) (Math.random()*6)+1;
        System.out.println("Computer Chose : " + c);
        if((r+c)%2==0) {
            d= "EVEN";
            System.out.println("The Sum Is Even");
        } else {
            System.out.println("The Sum Is Odd");
            d= "ODD";
        }
        if(d.equalsIgnoreCase(ch))
        {
            System.out.println("You Won the Toss");
            System.out.println("Choose 'Bat' or 'Ball'");
            d = sc.next();
            if (d.equalsIgnoreCase("BAT"))
                return 1;//Player is batting
            else if (d.equalsIgnoreCase("Quit") || d.equalsIgnoreCase("Exit"))
            {
                return 2;
            }
            else
                return 0;//Player is Balling
        }
        else
        {
            System.out.println("Computer Won the Toss");
            c=(int) (Math.random()*2);
            if(c==0)
            {
                System.out.println("Computer Chooses Ball first");
                return 1;
            }
            else
            {
                System.out.println("Computer Chooses Bat first");
                return 0;
            }
        }
    }



    public  void main(String[] Args)
    {
        System.out.println("Welcome to Hand Cricket With Computer");
        System.out.println(
            "You have to choose a Number from 1 to 6 and Start playing the game. \n"+
            "If you want to exit the game Enter 'exit' or 'quit' \n"+
            "The Match will be of 5 Overs \n"+
            "After every Over the Runs will be Displayed \n"+
            "Lets start \n");
        System.out.println("Enter the Choice of Toss Using \n\"COIN\" or \"By Choosing any ODD & EVEN\"");
        System.out.println("Enter 1 for Toss using Coin \nor\n 2 for Choosing ODD & EVEN Method");
        int ch = Coin();
        if(ch==2)
        {
            System.out.println("Thanks For Playing");
            System.exit(0);
        }
        int s=play(ch);
        int a=ch==0?1:0;
        play(a,  s);
    }

    public static int play(int ch, int ... arr)
    {
        int c,runs=0;
        for( int i: arr)
        {
            runs+=i;
        }
        String d,p;
        if(ch==0)
            d = "Computer";
        else
            d = "Player";
        if(runs == 0)
            c=2;
        else
            c=0;
        int pr=0,cr,tr=0;
        Scanner sc= new Scanner(System.in);
        for (int i=1;i<=5*6;i++)
        {
            if(i%6==0)
            {
                System.out.println("Total run After "+i+" balls are:"+tr);
            }
            System.out.println("Enter Your run");
            p=sc.next();
            if(p.equalsIgnoreCase("Quit") || p.equalsIgnoreCase("Exit"))
            {
                System.out.println("Thanks For Playing");
                System.exit(0);
            }
            else
                pr= Integer.parseInt(p);
            cr = (int) (Math.random()*6)+1;
            System.out.println("Computer Chose : " + cr);
            if(pr==cr)
            {
                System.out.println(d+" is Out !!");
                break;
            }

            else if(ch==0)
                tr += cr;
            else if (ch==1)
                tr += pr;
            if( runs<tr && runs!=0)
            {
                System.out.println("Total runs made by "+d+" are : "+tr);
                System.out.println(d+ " Won the Match!!!");
                System.out.println("Thanks For Playing");
                System.exit(0);
            }
        }
        if( c==0)
        {
            System.out.println(d + " lost the Match!!!");
            System.out.println("Thanks For Playing");
            System.exit(0);
        }
        System.out.println("Total runs made by "+d+" are : "+tr+'\n'+"Target is :"+(tr+1));
        return tr+1;
    }

}