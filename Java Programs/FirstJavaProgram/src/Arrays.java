public class Arrays {
    public static void main(String[] args) {
        //declaring each variable requires more time eg: int a = 10, int b = 2, ...
        // so use array for similar data int marks[] = {10, 2, 3}

        // to insert 500 variables 2 ways
        // 1. create 500 variables
        // 2. use arrays

        //Array
        //Declaration Types

        //Type 1
//        int [] marks;
//        marks = new int[5];

        //Type 2 - declaration then memory allocation
//        int [] marks = new int[5];
//        marks[0] = 100;
//        marks[1] = 90;
//        marks[2] = 60;
//        marks[3] = 70;
//        marks[4] = 80;
//        System.out.println(marks[3);

        //Type 3 - declaration , memory allocation and initialisation together
        int [] marks = {100, 20, 30, 40, 90};
        System.out.println(marks[3]);


    }
}
