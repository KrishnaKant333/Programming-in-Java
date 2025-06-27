class Employee{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
        id = i;
    }
}

public class Cwh_01_Intro {
    public static void main(String[] args) {
        Employee harry = new Employee();
        
        harry.setName("CodeWithHarry");
        System.out.println(harry.getName());

        harry.setId(14);
        System.out.println(harry.getId());

    }    
}