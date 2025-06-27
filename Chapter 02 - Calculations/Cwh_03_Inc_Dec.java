public class Cwh_03_Inc_Dec {
    public static void main(String[] args) {
        int i = 56;
        System.out.println(i++); // Post Increment
        System.out.println(i);
        System.out.println(++i); // Pre Increment
        System.out.println(i);
        System.out.println(i--); // Post Decrement
        System.out.println(i);
        System.out.println(--i); // Pre Decrement
        System.out.println(i);
        
        int y = 7;
        int x = ++y * 8;
        System.out.println(x);
    }
}
