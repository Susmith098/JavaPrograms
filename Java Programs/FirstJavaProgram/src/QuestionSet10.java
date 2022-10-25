class good extends Thread{
    public void run(){
        while (true){
            System.out.println("Good Morning");
        }
    }
}

class welcome extends Thread{
    public void run(){
        while (true){
            try {
                Thread.sleep(200);
            }
            catch (Exception e){
                System.out.println(e);
            }
            System.out.println("Welcome");
        }
    }
}


public class QuestionSet10 {
    public static void main(String[] args) {
        good g = new good();
        welcome w = new welcome();
//        g.setPriority(6);
//        w.setPriority(9);
        System.out.println(g.getPriority());
        System.out.println(w.getPriority());
        System.out.println(g.getState());
        System.out.println(w.getState());
        System.out.println(Thread.currentThread().getState());
//        g.start();
//        w.start();

    }
}
