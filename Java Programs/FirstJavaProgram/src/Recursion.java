public class Recursion {
    // find factorial of n number
    //equation
    //factorial(n) = n*factorial(n-1)
    static int factorial(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if (n==0 || n==1){
            return 1;
        }
        else{
            int product =1;
            for (int i = 1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        int a=5;
        System.out.println(factorial(a));
        System.out.println(factorial_iterative(a));

    }
}
