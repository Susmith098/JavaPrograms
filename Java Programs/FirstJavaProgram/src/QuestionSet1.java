import java.util.Scanner;

public class QuestionSet1 {
    public static void main(String[] args) {
        // problem 1 - convert string to lowercase
        String name = "Susmith";
        name = name.toLowerCase();
        System.out.println(name);

        //problem 2 - replace spaces with underscore
        String a = " How Are You";
        a = a.replace(" ","_");
        System.out.println(a);

        // problem 3 - format name according to input given by user
        Scanner s = new Scanner(System.in);
        String b = s.next();
        System.out.printf("Dear %s, Thanks a lot.\n", b);

        // problem 4 - detect double and triple spaces in a string
        String c = "How  is this   possible";
        System.out.println(c.indexOf("  "));
        System.out.println(c.indexOf("   "));
    }
}
