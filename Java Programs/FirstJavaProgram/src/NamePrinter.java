import java.util.Scanner;

public class NamePrinter {
    public static void main(String[] args) {
        System.out.println("What is your name?");
        Scanner s = new Scanner(System.in);
        String name = s.next();
        System.out.println("Hello " + name + ", Have a good day.");
    }
}
