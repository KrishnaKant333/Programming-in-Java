import java.util.ArrayList;

public class Cwh_04_Generics {
    public static void main(String[] args) {
        // ArrayList arrayList = new ArrayList(); // raw type

        // ArrayList<int> arrayList = new ArrayList<>();
        // primitive data type like int is not allowed

        ArrayList<Integer> arrayList = new ArrayList<>();

        // arrayList.add("Str1"); // this will throw error becoz object type is integer
        // and we're adding string

        arrayList.add(6);
        arrayList.add(543);

        // int a = (int) arrayList.get(2); // even tho 543 is an integer, java will not
        // assign it to a in case of any type mismatch, so we must either specify the
        // generic or type cast the output value to prevent type mismatch

        int a = arrayList.get(1);
        // to prevent such mistake we use generics in the declaration of a collection
        System.out.println(a);
    }
}
