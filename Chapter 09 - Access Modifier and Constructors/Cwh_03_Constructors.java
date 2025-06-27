import java.util.Scanner;

class Employee{
    private final int id;
    private final String name;    

    // public Employee(){
    //     id = 10;
    //     name = "Dv";
    // }

    public Employee(String myName, int myId){
        this.id = myId;
        this.name = myName;
    }

    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
}
public class Cwh_03_Constructors {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name :");
        String n = sc.nextLine();
        System.out.println("Enter the Id:");
        int i = sc.nextInt();
        sc.close();
        Employee kks = new Employee(n,i);
        System.out.println(kks.getId());
        System.out.println(kks.getName());
    }
}