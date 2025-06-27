public class pr02_05 {
    public static void main(String[] args) {
        char grade = 'B';
        grade = (char) (grade + 8); // encrypted grade
        System.out.println("Encrypted grade = " + grade);
        grade = (char) (grade - 8); // decrypted grade
        System.out.println("Decrypted grade = " + grade);
    }
}
