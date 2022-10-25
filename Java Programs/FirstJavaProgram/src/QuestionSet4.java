public class QuestionSet4 {
    public static void main(String[] args) {
        System.out.println("Quizzes on Arrays: ");

        //find the sum array elements with 5 floats
//        float [] marks = {50, 60, 70.5f, 100, 90};
//        float sum = 0;
//        for (int  i=0; i<marks.length; i++){
//            sum = sum +marks[i];
////            System.out.println(marks[i]);
//
//        }
//        System.out.println("The sum is: "+sum);


        //given integer present in the array or not
//        float [] marks = {50, 60, 70.5f, 100, 90};
//        float num = 5;
//        boolean isInArray = false;
//        for (float element: marks){
//            if(num==element){
//                isInArray =true;
//                break;
//            }
//        }
//        if (isInArray){
//            System.out.println("The element is present!");
//        }
//        else{
//            System.out.println("Not present!");
//        }

        //Average marks in an array use for-each loop
//        float [] marks = {50, 60, 70.5f, 100, 90};
//        float sum = 0;
//        for (float element: marks){
//            sum = sum +element;
//        }
//        System.out.println("The sum is: "+sum/ marks.length);

        //create 2d array and add two matrices
//        int [][] mat1 = {{1, 2, 3},
//                         {4, 5, 6}};
//        int [][] mat2 = {{2, 3, 4},
//                         {5, 6, 7}};
//        int [][] result = {{0, 0, 0},
//                           {0, 0, 0}};
//        for (int i=0; i< mat1.length; i++){ //row number of times
//            for (int j=0; j< mat1[i].length; j++){ //column number of times
//                result [i][j] = mat1[i][j]+mat2[i][j];
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println("");
//        }

        //Reverse an array
//        int [] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int l = arr.length;
//        int n = Math.floorDiv(l, 2);
//        int temp;
//
//        for (int i=0; i<n; i++){
//            //swap a[i] and a[l-1-i]
//            temp = arr[i];
//            arr[i] = arr[l-1-i];
//            arr[l-1-i] = temp;
//        }
//        for (int element: arr) {
//            System.out.print(element + " ");
//        }

        //find minimum element in array
//        int [] arr = { 2, 34, 89, 13, 4};
//        int min=Integer.MAX_VALUE;
//        for (int element: arr) {
//            if(element<min){
//                min = element;
//            }
//        }
//        System.out.println("The minimum number is: " +min);

        //find maximum element in array
//        int [] arr = { 2, 34, 89, 1, 4};
//        int max=0;
//        for (int element: arr) {
//            if(element>max){
//                max = element;
//            }
//        }
//        System.out.println("The maximum number is: " + max);


        //Is the array sorted or not
        int [] arr = { 2, 34, 5, 6, 9, 1};
        boolean isSorted = true;
        for (int i=0; i< arr.length-1; i++){
            if (arr[i]>arr[i+1]){
                isSorted =false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted");
        }
        else{
            System.out.println("The array is not sorted");
        }

    }
}
