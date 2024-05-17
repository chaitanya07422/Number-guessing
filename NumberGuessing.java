//task 2

import java.util.*;

class Game {

    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game() {
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }

    Boolean isCorrectNumber() {
        noOfGuesses++;
        if (inputNumber == number && noOfGuesses < 6) {
            System.out.format("Yes, you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            System.out.println(" ");
            return true;
        } else if (noOfGuesses == 5) {
            System.out.println("No of Attempts is over. You lost the Game ");
            return true;
        } else if (inputNumber < number && noOfGuesses < 5) {
            System.out.println("Too low...");
        } else if (inputNumber > number && noOfGuesses < 5) {
            System.out.println("Too high...");
        }
        return false;
    }
}

public class NumberGuessing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int s = 1; // Initialize s to start the game
        while (s == 1) {
            Game g = new Game();
            boolean b = false;
            while (!b) {
                g.takeUserInput();
                b = g.isCorrectNumber();
            }
            count++;
            System.out.println("Total no of rounds played: " + count);
            System.out.println("*********************************************************************************************************************************************************");
            System.out.println("Do you want to play the game again? If yes, press 1; else, press 0");
            s = sc.nextInt();
        }
        if (s == 0) {
            System.out.println("Thank You! See you next time ");
        } else {
            System.out.println("Invalid option. Exiting the game.");
        }
    }
}

