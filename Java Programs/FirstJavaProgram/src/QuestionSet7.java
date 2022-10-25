class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea(){
        return 2*Math.PI*radius*radius + 2*Math.PI*radius*height;
    }
    public  double volume(){
        return Math.PI*radius*radius*height;
    }
}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
}

public class QuestionSet7 {
    public static void main(String[] args) {

        Cylinder c = new Cylinder(9, 12);
//        c.setHeight(12);
        System.out.println(c.getHeight());
//        c.setRadius(9);
        System.out.println(c.getRadius());
        System.out.println(c.surfaceArea());
        System.out.println(c.volume());

        Rectangle r = new Rectangle(12, 6);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());


    }
}
