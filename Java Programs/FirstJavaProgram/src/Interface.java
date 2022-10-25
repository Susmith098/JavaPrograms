interface Bicycle{
    int a =45; //it is final value //unchangeable
    int applyBrake(int decrement);
    int speedUp(int increment);
}

class hero implements Bicycle{
    int speed =7;
    public int applyBrake(int decrement){
        speed = speed-decrement;
        System.out.printf("Applied Brake, Speed: ");
        return speed;
    }
    public int speedUp(int increment){
        speed = speed+increment;
        System.out.printf("Applied Speed, Speed: ");
        return speed;
    }
}

public class Interface {
    public static void main(String[] args) {
        hero h = new hero();
        System.out.printf("Actual speed: %d\n", h.speed);
        System.out.println(h.applyBrake(2));
        System.out.println(h.speedUp(2));
        System.out.println(h.a);
    }
}
