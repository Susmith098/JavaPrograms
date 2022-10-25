import java.util.Scanner;

public class CbseCgpa {
    public static void main(String[] args) {
//        float s1 = 45;
//        float s2 = 56;
//        float s3 = 80;
//        float cgpa = (s1+s2+s3)/30;
//        System.out.println(cgpa);

        System.out.println("CBSE Percentage Calculator");
        float English, Maths, Science, Social_Science, Second_Language;
        double total_marks, average_marks, percentage;
//        double cgpa;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter marks of English: ");
        English = s.nextFloat();
        System.out.print("Enter marks of Maths: ");
        Maths = s.nextFloat();
        System.out.print("Enter marks of Science: ");
        Science = s.nextFloat();
        System.out.print("Enter marks of Social_Science: ");
        Social_Science = s.nextFloat();
        System.out.print("Enter marks of Second_Language: ");
        Second_Language = s.nextFloat();

        //Calculate total marks, average marks and percentage
        total_marks = English+Maths+Science+Social_Science+Second_Language;
        System.out.println("Total marks: " +total_marks);
        average_marks = total_marks/5;
        System.out.println("Average marks: " +average_marks);
        percentage = (average_marks/500)*100;
        System.out.println("Percentage: " +percentage);
//        cgpa = 9.5*average_marks;
//        System.out.println("CGPA: " +cgpa);
    }
}
