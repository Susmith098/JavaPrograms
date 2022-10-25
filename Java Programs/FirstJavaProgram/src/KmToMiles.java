import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        System.out.print("Enter your Kilometers: ");
        Double Kilometers, miles;
        Scanner s = new Scanner(System.in);
        Kilometers = s.nextDouble();
        miles = Kilometers/1.609;
        System.out.println(miles + "Miles");
    }
}
