class Base1{
    int x;
    Base1(){
        System.out.println("I am a base class constructor");
    }

    Base1(int a ){
        System.out.println("I am an overloaded constructor with " + a);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived1 extends Base1{

    int y;
    Derived1(){
        super(1);
        System.out.println("I am a derived class constructor");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    public void meth(){
        System.out.println("method for override 1");
    }

}

class Derived2 extends Derived1{
    @Override

    public void meth(){
        System.out.println("method for override 2");
    }
    int y;
    Derived2(){
        System.out.println("I am a derived2 class constructor");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
//    Base1 b =new Base1();
    Derived1 d = new Derived1();
        Derived2 d1 = new Derived2();
        d1.meth();
    }
}
