public class Cwh_10_Finally_block {
    public static int greet(){
        try {
            int a = 50;
            // int b = 10; // returns 5 but still executes finally block, k = 5
            int b = 0; // returns excpetion but still executes finally block, k = -1
            int c = a/b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        }
        finally{
            System.out.println("Cleaning up resources.. This is the end of the function.");
        }
        return -1;
    }
    public static void main(String[] args) {
        int k = greet();
        System.out.println(k);
    }
}
