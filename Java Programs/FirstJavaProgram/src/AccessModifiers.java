class Employee2{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        this.id = i;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {

        Employee2 e1 = new Employee2();
//        e1.id = 12;
//        e1.name = "Harry"; --> Throws error because private access
        e1.setName("Susmith");
        System.out.println(e1.getName());
        e1.setId(234);
        System.out.println(e1.getId());

    }
}
