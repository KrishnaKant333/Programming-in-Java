public class Cwh_02_DoWhile {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 3);

        int j = 283872;
        do {
            System.out.println(j);
            j++;
        } while (j <= 5);
    }
}

// while loop is entry controlled loop i.e. it checks the condition first and then enters the loop
// do while loop is exit controlled loop i.e. it enters the loop first and then checks the condition