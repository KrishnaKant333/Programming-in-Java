public class Cwh_03_Change {
    static void change(int x) {
        x = 34;
    }
    static void change_arr(int []z) {
        z[0] = 21;
    }
    public static void main(String[] args) {
        int a = 23;
        change(a);
        System.out.println(a); // wont change

        int [] arr = {12, 34, 56, 78};
        change_arr(arr);
        System.out.println(arr[0]); // will change
    }
}
// any objects passing to the methods can have access to the reference 