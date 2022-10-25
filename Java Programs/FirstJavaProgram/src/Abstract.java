abstract class Parent{
    public Parent(){
        System.out.println("I am constructor from Base2");
    }

    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}

class Child extends Parent{
    @Override
        public void greet(){
            System.out.println("Good Morning");
        }
}


public class Abstract {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        c.sayHello();
    }
}
