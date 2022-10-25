import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString() {
        return " I am a toString";
//        return super.toString() + " I am a toString";
    }

    @Override
    public String getMessage() {
        return " I am getMessage";
//        return super.getMessage() + " I am getMessage";
    }
}

public class ExceptionClass {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        if(a<9){
            try {
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes finished");
        }

    }
}
