public class QuestionSet3 {
    public static void main(String[] args) {

        //pattern of 5 stars decreasing to 1-star
//        int n = 5;
//        for (int i = n; i>0; i--){
//            for (int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.print("\n");

        //sum of n even numbers
//        int sum =0;
//        int n = 10;
//        for (int i =0; i<n; i++){
//            if(i%2==0){
//                sum = i+i;
//                System.out.println(sum);
//            }
//        }

        //sum of first n even numbers
//        int sum = 0;
//        int n = 5;
//        for (int i =0; i<n; i++){
//            if(i%2==0) {
//                sum = sum+i;
//            }
//        }
//        System.out.println(sum);

        //print multiplication table of an n number
//        int n = 5;
//        int mul = 0;
//        for(int i = 1; i<=10; i++){
//            mul = (n*i);
//            System.out.printf("%d X %d = %d \n", i, n, mul);
//        }

        //print multiplication table in reverse order
//        int n = 10;
//        int mul = 0;
//        for(int i = 10; i>=1; i--){
//            mul = (n*i);
//            System.out.printf("%d X %d = %d \n", i, n, mul);
//        }

        //factorial using while loop
        // factorial eg: 5! = 5*4*3*2*1, or n*(n-1)*(n-2)*....
//        int n = 5;
//        int i = 1;
//        int fact = 1;
//        while (i<=n){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println(fact);


        //sum of numbers occurring in multiplication table of 8
        int n = 8;
        int sum =0;
        for(int i = 1; i<=10; i++){
            sum += (n*i);
        }
        System.out.println(sum);
    }
}
