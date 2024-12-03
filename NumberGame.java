// Task 1: creating a program that lets user guess the randomly generated number with rounds and number of attempts

import java.util.Scanner;
public class NumberGame{
    int random;
    public  NumberGame(){
        random = (int)((Math.random()*100)+1); // random number from 1 to 100
        Scanner scanner = new Scanner(System.in);
        int attempt = 6;
        // Round 1:
        System.out.println("This is round 1 and you have a total of 6 attempt to guess the correct randomly generated random number.");
        while(attempt >= 1){
            System.out.println("Guess the random generated number");
            int guess = scanner.nextInt();
            if(guess > random)
                System.out.println("Too high, try again");
            else if(guess < random)
                System.out.println("Too low, try again");
            else 
            {
                System.out.println("Congratulations! You guessed the correct number");
                break;
            }
            attempt--;
            if (attempt == 0)
                System.out.println("You've run out of attempts. The correct number was: " + random);
        }
        // Round 2:
        System.out.println("This is round 2 and you have a total of 4 attempt to guess the correct randomly generated random number.");
        int attempt2 = 4;
        random = (int)((Math.random()*100)+1);
        while(attempt2 >= 1){
            int guess2 = scanner.nextInt();
            System.out.println("Guess the random generated number");
            if(guess2 > random)
                System.out.println("Too high, try again");
            else if(guess2 < random)
                System.out.println("Too low, try again");
            else 
            {
                System.out.println("Congratulations! You guessed the correct number");
                break;
            }
            attempt2--;
            if (attempt2 == 0)
                System.out.println("You've run out of attempts. The correct number was: " + random);
        }
        scanner.close();
    }
    public static void main(String[] args) {
        new NumberGame();
    }
}