import java.util.Scanner;

public class NestedTry {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag)
            try {
                System.out.println("Try game");
                try {
                    System.out.println("nested try");
                    flag = false;
                } catch (Exception e) {
                    System.out.println(e);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
    }
    }
