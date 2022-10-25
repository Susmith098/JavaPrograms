public class Trycatch {
    public static void main(String[] args) {
        int a =200;
        int b =0;
        int c;
        try {
            c = a/b;
            System.out.println("the result is: "+ c);
        }
        catch (Exception e){
            System.out.println("Failed to divide, Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");
    }
}
