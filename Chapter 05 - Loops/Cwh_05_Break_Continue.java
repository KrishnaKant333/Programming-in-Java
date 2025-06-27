public class Cwh_05_Break_Continue {
    public static void main(String[] args) {
        //break
        for(int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if(i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loop ends here\n");

        //continue
        for(int i = 0; i<5; i++){
            if(i==2){
                System.out.println("Skip the loop when i is 2");
                continue;
            }
            System.out.println(i);
            System.out.println("Java is great");
        }
    }
}