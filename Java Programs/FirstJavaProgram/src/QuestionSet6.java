    class Employee1{
        int salary;
        String name;
        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }
        public void setName(String n){
            name = n;
        }
    }

    class cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    }
    class square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    }
    public class QuestionSet6 {
    public static void main(String[] args) {
        Employee1 e1 = new Employee1();
        e1.setName("Harry");
        System.out.println(e1.getName());

        cellphone nokia = new cellphone();
        nokia.ring();
        nokia.vibrate();

        square s = new square();
        s.side = 3;
        System.out.println(s.area());
        System.out.println(s.perimeter());



    }

}
