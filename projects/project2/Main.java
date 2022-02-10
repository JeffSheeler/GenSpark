package genspark.projects.project2;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Hello! What is your name?");
        String name = scan.next();
        System.out.println("Well, "+name+" I am think of a number between 1 and 20.");
        int numberToGuess;
        int guesses = 0;
        int userInputNumber = 0;
        boolean wantsToPlay = true;

        while(wantsToPlay == true){
            numberToGuess = rn.nextInt(20) + 1;
            System.out.println(numberToGuess);

            while(userInputNumber != numberToGuess && guesses < 6){
                System.out.println("Take a guess.");
                userInputNumber = scan.nextInt();
                guesses++;

                if(userInputNumber < numberToGuess){
                    System.out.println("Your guess is too low.");
                }
                else if(userInputNumber > numberToGuess){
                    System.out.println("Your guess is too high.");
                }
                else{
                    System.out.println("Good job, "+name+"! You guessed my number in "+guesses+" guesses!");
                }
            }
            if(guesses == 6){
                System.out.println("You took too many guesses, you lose!");
            }
            System.out.print("Would you like to play again? (y or n)");
            String responseToPlay = scan.next();
            guesses = 0;
            if(responseToPlay.equals("n"))
                wantsToPlay = false;
            else
                System.out.println("Let's play again!");
        }
    }
}
