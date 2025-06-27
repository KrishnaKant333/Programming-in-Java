import java.util.Scanner;
import java.util.Random;

public class Ex02 {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor:");
        int userInput = sc.nextInt();
        sc.close();
        Random r = new Random();
        int computerInput = r.nextInt(3);
        
        if (userInput == computerInput){
            System.out.println("Its a Draw");
        }
        else if (userInput == 0 && computerInput == 1 || userInput == 1 && computerInput == 2 || userInput == 2 && computerInput == 0){
            System.out.println("Computer wins!");
        }
        else{
            System.out.println("You win!");
        }

        if(userInput==0){
            System.out.println("Your choice = Rock");
        }
        if(userInput==1){
            System.out.println("Your choice = Paper");
        }
        if(userInput==2){
            System.out.println("Your choice = Scissor");
        }

        if(computerInput==0){
            System.out.println("Computer's choice = Rock");
        }
        if(computerInput==1){
            System.out.println("Computer's choice = Paper");
        }
        if(computerInput==2){
            System.out.println("Computer's choice = Scissor");
        }

    }
}