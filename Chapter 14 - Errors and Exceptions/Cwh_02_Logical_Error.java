public class Cwh_02_Logical_Error {
    public static void main(String[] args) {
        // 2. Logical Error :
        // 2a. Message delivered wrongly
        // 2b. Wrong Time of chats being displayed
        // 2c. Incorrect Redirects

        // Write a program to print all prime numbers between 1 to 10 :
        // System.out.println(2);
        // for(int i = 1; i<5; i++){
        //     System.out.println(2*i+1);
        // }
        // wrong logic as 3, 5, 7 are prime but not 9 so this is a logical error
        // this is the logic to print odd numbers and not prime numbers

        // Correct logic :
        for (int n = 2; n <= 100; n++) {
            boolean isPrime = true;
            for (int i = 2; i*i <= n; i++) {
                if (n%i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(n + " ");
            }
        }
    }
}
