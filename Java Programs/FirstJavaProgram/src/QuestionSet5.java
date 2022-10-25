public class QuestionSet5 {

    //with int mul multiplication table
//    static int mul(int a){
//        int result =0;
//        for (int i=1; i<=10; i++){
//            result = i*a;
//            System.out.printf("%d X %d = %d\n", i, a, result);
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        System.out.println("Multiplication table: ");
//        int b = 5;
//        mul(b);
//    }


    //with void mul same answer for above question
//    static void mul(int n){
//        for (int i=1; i<=10; i++){
//            System.out.printf("%d X %d = %d\n", n, i, n*i);
//        }
//    }
//
//    public static void main(String[] args) {
//        mul(5);
//    }


    //print pattern for n numbers
//    static void pattern(int a){
//        for (int i=0; i<a; i++){
//            for (int j=0; j<i+1; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(10);
//    }

    //print pattern for n numbers in upside down
//    static void pattern(int a){
//        for (int i=a; i>0; i--){
//            for (int j=i; j>0; j--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void main(String[] args) {
//        pattern(5);
//    }

    //recursion function - sum of first n natural numbers
//    static int recSum(int a){
//        if (a==1){
//            return 1;
//        }
//        return a + recSum(a-1);
//    }
//
//    public static void main(String[] args) {
//        int n = recSum(4);
//        System.out.println(n);
//    }

    //n term of fibonacci series eg: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, ..
//    static int fib(int a){
//        if (a == 1 || a==2){
//            return a-1;
//        }
//        else if (a==0) {
//            return 0;
//        }
//        else {
//            return fib(a-1) + fib(a-2);
//        }
//    }
//
//    public static void main(String[] args) {
//        int n = fib(2);
//        System.out.println(n);
//    }

    //pattern using recursion
    static void patRec(int a){
        if(a>0){
            patRec(a-1);
            for(int i=0; i<a;i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        patRec(5);
    }
}
