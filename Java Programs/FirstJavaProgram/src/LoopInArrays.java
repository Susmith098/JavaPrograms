public class LoopInArrays {
    public static void main(String[] args) {
        //int [] marks = {50, 90, 80, 90, 100};
        float [] marks = {50, 90, 80, 90.5f, 100};
//        String [] students = {"harry", "hari", "ram", "raj", "krish"};
//        System.out.println(marks.length);
//        System.out.println(marks[0]);

        //display all data (naive or easy way)
//        System.out.println(marks[0]);
//        System.out.println(marks[1]);
//        System.out.println(marks[2]);
//        System.out.println(marks[3]);
//        System.out.println(marks[4]);

        //display all data (for loop)
//        for (int i = 0; i<marks.length; i++){
//            System.out.println(marks[i]);
//        }

        //display all data in reverse order(for loop)
//        for (int i = marks.length-1; i>=0; i--){
//            System.out.println(marks[i]);
//        }

        //display all data in reverse order(for-each loop)
        for (float data: marks) {
            System.out.println(data);
        }

    }
}
