import java.util.Scanner;

public class QuestionSet2 {
    public static void main(String[] args) {
        //question 1 - promote the people who have 40% more in 3 subjects and each subject with 33 marks above.
//        byte m1, m2, m3;
//        Scanner s= new Scanner(System.in);
//        System.out.print("Enter the marks in Physics: ");
//        m1 = s.nextByte();
//        System.out.print("Enter the marks in Chemistry: ");
//        m2 = s.nextByte();
//        System.out.print("Enter the marks in Mathematics: ");
//        m3 = s.nextByte();
//        float avg = (m1+m2+m3)/3.0f;
//        System.out.println("Overall percent is: " + avg);
//        if(avg>40 && m1>=33 && m2>=33 && m3>=33){
//            System.out.println("Congratulations! You are promoted.");
//        }
//        else{
//            System.out.println("Sorry! You are not promoted.");
//        }

        //question 2 - Income Tax
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your income: ");
//        float income = s.nextFloat();
//        float tax = 0;
//        if (income>2.5f && income<=5.0f){
//            tax = tax + 0.05f * (income - 2.5f);
//        }
//        else if (income>5.0f && income<=10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.20f * (income - 5.0f);
//        }
//        else if (income>10.0f){
//            tax = tax + 0.05f * (5.0f - 2.5f);
//            tax = tax + 0.20f * (10.0f - 5.0f);
//            tax = tax + 0.30f * (income - 10.0f);
//        }
//        else {
//            tax = tax + 0;
//        }
//
//        System.out.print("The total tax paid by employee: " + tax);

        //question 3 - day of the week
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter the date number: ");
//        int day = s.nextInt();
//        switch (day){
//            case 1-> System.out.println("Monday");
//            case 2-> System.out.println("Tuesday");
//            case 3-> System.out.println("Wednesday");
//            case 4-> System.out.println("Thursday");
//            case 5-> System.out.println("Friday");
//            case 6-> System.out.println("Saturday");
//            case 7-> System.out.println("Sunday");
//            default -> System.out.println("Not a day to display here!");
//        }

        //question 4 - find leap year or not from the given input by the user
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = s.nextInt();
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)){
            System.out.println("Leap Year!");
        }
        else {
            System.out.println("Not a Leap Year!");
        }




        //question 5 - identify website url type
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your website URL: ");
//        String website = s.next();
//        if (website.endsWith(".com")){
//            System.out.println("It is an Commercial website!");
//        }
//        else if (website.endsWith(".org")){
//            System.out.println("It is an organisation website!");
//        }
//        else if (website.endsWith(".in")){
//            System.out.println("It is an Indian website!");
//        }


    }
}
