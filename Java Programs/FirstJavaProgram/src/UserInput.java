import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From The User");
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number 1: ");
//        int a = s.nextInt();
//        System.out.print("Enter number 2: ");
//        int b = s.nextInt();
//        int sum = a + b;
//        System.out.print("The sum is: ");
//        System.out.println(sum);
        boolean b1 = s.hasNextInt();
        System.out.println(b1);
    }
}