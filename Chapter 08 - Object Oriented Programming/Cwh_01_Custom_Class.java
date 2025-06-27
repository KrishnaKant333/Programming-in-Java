class Employee{
    int id;
    int salary;
    String name;

    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return salary;
    }
}

public class Cwh_01_Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee harry = new Employee();
        Employee john = new Employee();

        // setting attributes/properties
        harry.id = 12;
        harry.salary = 34;
        harry.name = "CodeWithHarry";

        john.id = 17;
        john.salary = 23;
        john.name = "John Tripathi";

        //printing the attributes manually
        // System.out.println(harry.id);        
        // System.out.println(harry.name);   
        
        harry.printDetails();
        john.printDetails();
        int salary = john.getSalary();
        System.out.println(salary);
    }
}