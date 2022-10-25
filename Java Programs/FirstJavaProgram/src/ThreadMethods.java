class MyT1 extends Thread{
    public void run(){
        int i=0;
        while (i<5666){
            System.out.println(" Thank you "+getName());
        }
    }
}

class MyT2 extends Thread{
    public void run(){
        int i=0;
        while (i<5666){
            System.out.println(" Thank you "+getName());
        }
    }
}

public class ThreadMethods {
    public static void main(String[] args) {

        MyT1 t1 = new MyT1();
        MyT2 t2 = new MyT2();
        t1.start();
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }
        t2.start();


    }
}
