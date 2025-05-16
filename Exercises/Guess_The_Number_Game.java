package Exercises;
import java.util.Scanner;
class Game
{
    private int guess ;
    private final int Num;
    Game()
    {
        guess=0;
        Num=(int) (Math.random()*100)+1;
    }

    /*public void setGuess(int n)
    {
    guess=n ;
    }*/
    public int takeUserInput()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Try To Guess it Dude");
        guess++;
        return sc.nextInt();
    }

    public int getGuess()
    {
        return guess;
    }

    public int isCorrect(int n)
    {
        if(n==Num)
            return 0;
        else 
        {
            System.out.println("OOPs You missed!!!");
            if(n>Num)
            {
                System.out.println("The Number Guessed is Bigger !!!");
                return 1;
            }
            else
            {
                System.out.println("The Number Guessed is Smaller !!!");
                return 1;
            }
        }
    }
    
}
public class Guess_The_Number_Game
{
    public static void main(String[] args)
    {
        Game gs = new Game();
        System.out.println("Guess the Number Between 1-100");
        int g;
        do
        g = gs.takeUserInput();
        while (gs.isCorrect(g)!=0);
        System.out.println("Hooraayyyy !!! YOU GUESSED IT");
        System.out.println("Points Scored are "+ (101-gs.getGuess()) );
    }
}