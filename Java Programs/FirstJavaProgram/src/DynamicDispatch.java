class one{
    public void name(){
        System.out.println("My name is Java in class one!");
    }
    public void greet1(){
        System.out.println("GoodMorning");
    }
}

class Two extends one{
    public void name(){
        System.out.println("My name is Java in class Two!");
    }

    public void greet2(){
        System.out.println("GoodMorning in 2");
    }
}

public class DynamicDispatch {
    public static void main(String[] args) {

//        one o = new one(); //allowed
//        o.name();
//
//        Two t = new Two(); //allowed
//        t.name();

        one o = new Two();//allowed
        o.name();
        o.greet1();
//        o.greet2();// this is wrong, parent won't take from child unless it has same name
//        Two t = new one();//Not allowed
    }
}
