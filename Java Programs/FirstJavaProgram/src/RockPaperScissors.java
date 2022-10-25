import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        //0 - Rock //1 - Paper //2 - Scissors

        //User input the number representing Rock(0), paper(1), Scissors(2)
        Scanner s = new Scanner(System.in);
        System.out.println("You are in Rock-Paper-Scissors Game!");
        int userInput = s.nextInt();


        //Computer input the number representing Rock(0), paper(1), Scissors(2)
        Random r = new Random();
        int computer = r.nextInt(3);

        if (userInput == computer){
            System.out.println("Draw!");
        } else if (userInput!=0 && userInput!=1 && userInput!=2) {
            System.out.println("Wrong Choice!");
        }
        else if (userInput==0 && computer==2 || userInput==2 && computer==1 || userInput==1 && computer==0) {
            System.out.println("You are Winner!");
        }
        else {
            System.out.println("Computer is Winner!");
        }
        System.out.println("Computer Choose: " + computer);

    }
}
