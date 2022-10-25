public class VarArgs {

//    static int sum(int a, int b){
//        return a+b;
//    }
//    static int sum(int a, int b, int c){
//        return a+b+c;
//    }
//    static int sum(int a, int b, int c, int d){
//        return a+b+c+d;
//    }
//    public static void main(String[] args) {
//        System.out.println("varargs Program");
//        System.out.println(sum(1,2));
//        System.out.println(sum(1,2,3));
//        System.out.println(sum(1, 2, 3, 4));
//    }

    // the above program requires more lines. this can be replaced by varargs
    static int sum(int ...arr){
        int result = 0;
        for (int a:arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("varargs Program");
        System.out.println(sum(1,2));
        System.out.println(sum(1,2,3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 4, 10, 10, 10, 10));
    }
}
