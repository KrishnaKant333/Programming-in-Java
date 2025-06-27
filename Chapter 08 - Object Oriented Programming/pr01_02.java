class Employee{
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

public class pr01_02 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        harry.setName("CodeWithHarry"); 
        harry.salary = 233;  
        System.out.println(harry.getName());
        System.out.println(harry.getSalary());
    }    
}
