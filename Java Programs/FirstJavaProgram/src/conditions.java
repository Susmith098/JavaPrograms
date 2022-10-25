import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        // driving age
//        int age = 22;
//        if(age > 18) {
//            System.out.println("Yes, Boy you can drive!");
//        }
//        else {
//            System.out.println("No, Boy You cannot drive till 18!");
//        }

        // experience by age
        int age;
        System.out.print("Enter your age: ");
        Scanner s = new Scanner(System.in);
        age = s.nextInt();


        //using else if statement
//        if (age>56){
//            System.out.println("You are experienced");
//        }
//        else if(age>46){
//            System.out.println("You are semi-experienced");
//        }
//        else if(age>36){
//            System.out.println("You are semi-semi-experienced");
//        }
//        else{
//            System.out.println("You are not experienced");
//        }


        //using switch case
//        switch (age){
//            case 18:
//                System.out.println("You are about start college life!");
//                break;
//            case 23:
//                System.out.println("You are about to start a job!");
//                break;
//            case 60:
//                System.out.println("You are about to retire from your job!");
//                break;
//            default:
//                System.out.println("Enjoy your life!");
//        }
//        System.out.println("Age is not the end or beginning for enjoyment, Do what you want do.");

        //using enhanced switch case
        switch (age) {
            case 18 -> System.out.println("You are about start college life!");
            case 23 -> System.out.println("You are about to start a job!");
            case 60 -> System.out.println("You are about to retire from your job!");
            default -> System.out.println("Enjoy your life!");
        }
        System.out.println("Age is not the end or beginning for enjoyment, Do what you want do.");
    }
}
