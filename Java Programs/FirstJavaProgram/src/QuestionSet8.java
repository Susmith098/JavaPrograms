class Circle{
    public int radius;

    Circle(int r){
        System.out.println("This is circle constructor");
        this.radius=r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am Cylinder constructor");
        this.height = h;
    }


    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}


public class QuestionSet8 {
    public static void main(String[] args) {
        Circle c = new Circle(12);
        Cylinder1 c1 = new Cylinder1(12, 4);

    }
}
