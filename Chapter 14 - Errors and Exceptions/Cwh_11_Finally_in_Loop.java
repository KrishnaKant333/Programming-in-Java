public class Cwh_11_Finally_in_Loop {
    public static void main(String[] args) {
        int a = 9;
        int b = 5;
        while (true) {
            try {
                System.out.println(a/b);
            } catch (Exception e) {
                System.out.println(e);
                break;
            }            
            finally{
                System.out.println("I am finally with b = " + b);
            }
            b--;
        }
    }
}
// finally will run even if there is no catch for exception handling but try wont run alone i.e. without both catch and finally, it needs either of them