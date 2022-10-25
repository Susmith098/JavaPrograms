class Employee3{
    private int id;
    private String name;

//    public Employee3(){  ---> Constructors
//        id =44;
//        name = "Name-Required";
//    }

    public Employee3(String myName, int  myId){
        id =myId;
        name = myName;
    }
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

public class Constructors {
    public static void main(String[] args) {
        Employee3 e1 = new Employee3("Susmith",56);
//        e1.setName("Harrry");
//        e1.setId(23);
        System.out.println(e1.getId());
        System.out.println(e1.getName());
    }
}
