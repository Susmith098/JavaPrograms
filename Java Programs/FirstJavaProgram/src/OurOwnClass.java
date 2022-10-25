
class Employee{
    int id;
    String name;
    int salary;
    public void printDetails(){
        System.out.println("\nMy id is: " + id);
        System.out.println("My name is : " + name);
    }

    public int getSalary() {
        System.out.println("Salary is: "+ salary);
        return salary;
    }
}


public class OurOwnClass {
    public static void main(String[] args) {
        System.out.println("This is our own class");
        Employee e1 = new Employee();// Initiating new employee object
        Employee e2 = new Employee();

        //Setting attributes e1
        e1.id =12;
        e1.name = "Susmith";
        e1.salary = 34000;

        //Setting attributes e2
        e2.id = 15;
        e2.name = "Sam";
        e2.salary = 54000;

        //print details
        e1.printDetails();
        e1.getSalary();
        e2.printDetails();
        e2.getSalary();

//        System.out.println(e.id);
//        System.out.println(e.name);
    }
}
