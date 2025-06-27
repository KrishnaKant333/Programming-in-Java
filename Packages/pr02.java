package Java.Packages;

import java.util.Scanner;

class Greet{
    Scanner sc = new Scanner(System.in);
    public void Greetings(){
        System.out.println("Good morning");
        String userInput = sc.nextLine();
    }
}

public class pr02 {
    public static void main(String[] args) {
        Greet g = new Greet();
        g.Greetings();
    }
}
