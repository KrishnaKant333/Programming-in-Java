public class Cwh_02_Logic {
    public static void main(String[] args) {
        boolean a = true, b = false;
        if(a && b) // Logical AND
        {
            System.out.println("Y"); // only if all are true
        }
        else
        {
            System.out.println("N"); // otherwise
        }

        if(a || b) // Logical OR
        {
            System.out.println("Y"); // if atleast one of them are true
        }
        else
        {
            System.out.println("N"); // only if all are false
        }

        // Logical NOT
        System.out.println("a : " + a + "\nNot a: "+!a);
    }
}