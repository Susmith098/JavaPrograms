import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game (){
        Random r =new Random();
        this.number = r.nextInt(100);
    }
    int UserInput(){
        System.out.print("Guess the number: ");
        Scanner s = new Scanner(System.in);
        inputNumber = s.nextInt();
        return inputNumber;
    }
    boolean IsCorrectGuess() {
        noOfGuesses++;
        if (inputNumber == number) {
            System.out.printf("You Guessed Right Number: %d, Winner!\nYour guessed it in %d attempts\n", number, noOfGuesses);
            return true;
        } else if (inputNumber < number) {
            System.out.println("Wrong Guess!, Too low...");
        } else if (inputNumber > number) {
            System.out.println("Wrong Guess!, Too high...");
        }
        System.out.printf("Attempt No.%d\n",noOfGuesses);
        return false;
    }
}

public class GuessGame {
    public static void main(String[] args) {

        Game g = new Game();
        boolean b = false;
        while (!b){
            g.UserInput();
            b = g.IsCorrectGuess();
        }

    }
}
