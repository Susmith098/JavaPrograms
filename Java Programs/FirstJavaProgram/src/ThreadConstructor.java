class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
//        int i =34;
        System.out.println("thank you");
//        while (true) {
//            System.out.println("I am a thread");
//        }
    }
}

public class ThreadConstructor {
    public static void main(String[] args) {
        MyThread t = new MyThread("Susmith");
        t.start();
        System.out.println("ID of this thread "+ t.getId());
        System.out.println("name of this thread "+ t.getName());

    }
}
