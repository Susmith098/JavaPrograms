public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("Using Break and Continue ");
//        for (int i=0; i<5; i++){
//            System.out.println(i);
//            if(i==2){
//                System.out.println("loop break");
//                break;
//            }
//        }
        for (int i=0; i<5; i++){
            System.out.println(i);
            if(i==2){
                System.out.println("loop break");
                continue;
            }
        }
    }
}
