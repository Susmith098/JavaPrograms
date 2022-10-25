public class Methods1 {
    //method value returns in void main
//    static void jokes(){
//        System.out.println("I am not a human\n" + "I am a dust");
//    }
//
//    public static void main(String[] args) {
//        jokes();
//    }

//    //value change function but this case won't change
//    static void change(int a){
//        a = 98;
//    }
//
//    public static void main(String[] args) {
//        int x = 45;
//        change(98);
//        System.out.println(x);
//    }

    //value will change in this case
//    static void change(int [] arr){
//        arr[1] = 98;
//    }
//
//    public static void main(String[] args) {
//        int [] marks = {54, 60, 64, 70, 84};
//        change(marks);
//        System.out.println(marks[1]);
//    }

    //Method overloading
    static void foo(){
        System.out.println("Good Morning Bro!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }

    static void foo(String a){
        System.out.println("Good Morning " + a + " Bro!");
    }

    static void foo(String a, int b){
        System.out.println("Good Morning " + a + " Bro! Code: "+ b );
    }

    public static void main(String[] args) {
        foo();
        foo(100);
        foo("Susmith");
        foo("Harry", 100);
    }
}
