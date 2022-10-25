abstract class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("write");
    }

    void refill(){
        System.out.println("refill");
    }

    void changeNib(){
        System.out.println("Changing Nib");
    }
}

class monkey {
    void jump(){
        System.out.println("jump");
    }
    void bite(){
        System.out.println("bite");
    }
}


interface basicAnimal{
    void eat();
    void sleep();
}

class human extends monkey implements basicAnimal{
    void speak(){
        System.out.println("speak");
    }

    @Override
    public void eat() {
        System.out.println("eating...");
    }

    @Override
    public void sleep() {
        System.out.println("sleeping...");
    }
}

public class QuestionSet9 {
    public static void main(String[] args) {
        FountainPen f= new FountainPen();
        f.write();
        f.changeNib();

        human h =new human();
        h.sleep();

        basicAnimal b = new human();
        b.eat();
    }
}
