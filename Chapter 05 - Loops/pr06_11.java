public class pr06_11 {
    public static void main(String[] args) {
        int n = 8, sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += (n*i);
        }
        System.out.println("Sum of the numbers occuring in the multiplication table of 8 = " + sum);
    }
}