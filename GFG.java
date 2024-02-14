import java.util.Random;
import java.util.Scanner;

public class GFG {
    public static void main(String[] args)
     {

        int answer, guess;

        final int MAX = 100;

        Scanner in = new Scanner(System.in);

        Random rand = new Random();

        int guessCount = 0;

        answer = rand.nextInt(MAX) + 1;

        while (true) {

            System.out.println("Guess a number between 1 and 100: ");
            guess = in.nextInt();

            guessCount++;

            if (guess > answer)
             {
                System.out.println("Too high, try again");
            }

            else if (guess < answer)
             {
                System.out.println("Too low, try again");
            }

            else {
                System.out.println("Yes, you guessed the number.");
                System.out.println("It took you " + guessCount + " guesses.");
                break;
            }
        }

        in.close();
    }
}