import java.util.Scanner;

public class SpecificExceptions {
    public static void main(String[] args) {
        int [] marks = {7, 56, 10};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the array index");
        int ind = s.nextInt();
        System.out.println("Enter the number you want to divide");
        int number =s.nextInt();
        try {
            System.out.println("The value at array index is: " + marks[ind]);
            System.out.println("The value array_value/number is: "+ marks[ind]/number);
        }
        catch (ArithmeticException e){
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some other exception occurred!");
            System.out.println(e);
        }
    }
}
