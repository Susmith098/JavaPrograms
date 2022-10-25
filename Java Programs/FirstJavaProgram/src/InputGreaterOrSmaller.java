import java.util.Scanner;

public class InputGreaterOrSmaller {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(a>8);
    }
}
