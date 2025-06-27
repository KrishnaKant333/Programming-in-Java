import java.util.Scanner;

class MaxInputException extends Exception{
    @Override
    public String toString() {
        return "One or both the inputs is greater than or equal to 100000. Limit reached.";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class MaxMultiplierReachedException extends Exception{
    @Override
    public String toString() {
        return "Multiplier limit is 7000 or less. Limit reached.";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}

class InvalidInputException extends Exception{
    @Override
    public String toString() {
        return "Cannot divide by 0";
    }

    @Override
    public String getMessage() {
        return super.getMessage();
    }
}


class CustomCalculator{
    private final int MAX_INPUT = 100000;
    double add(double a, double b) throws MaxInputException{
        if(a>=MAX_INPUT || b>=MAX_INPUT){
            throw new MaxInputException();
        }
        return a+b;
    }
    double subtract(double a, double b) throws MaxInputException{
        if(a>=MAX_INPUT || b>=MAX_INPUT){
            throw new MaxInputException();
        }
        return a-b;
    }
    double multiply(double a, double b) throws MaxMultiplierReachedException, MaxInputException{
        if(a>=MAX_INPUT || b>=MAX_INPUT){
            throw new MaxInputException();
        }
        else if(a>=7000 || b>=7000){
            throw new MaxMultiplierReachedException();
        }
        return a*b;
    }
    double divide(double a, double b) throws InvalidInputException, MaxInputException{
        if(a>=MAX_INPUT || b>=MAX_INPUT){
            throw new MaxInputException();
        }
        if(b==0){
            throw new InvalidInputException();
        }
        return a/b;
    }
}

public class Ex06 {
    public static void main(String[] args) throws InvalidInputException, MaxInputException, MaxMultiplierReachedException {
        try (Scanner sc = new Scanner(System.in)) {
            CustomCalculator c = new CustomCalculator();
            System.out.println("\nWelcome to the Custom Calculator.");
            int prompt, num1, num2;
            do {
                System.out.println("Enter two numbers to begin with : ");
                num1 = sc.nextInt();
                num2 = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter the operation you would like to perform :");
                System.out.println("Press 1 : For addition");
                System.out.println("Press 2 : For subtraction");
                System.out.println("Press 3 : For multiplication");
                System.out.println("Press 4 : For division");
                System.out.println("Press 0 : To end the program.");
                System.out.println("Enter your choice :");
                prompt = sc.nextInt();
                sc.nextLine();
                switch (prompt) {
                    case 1 -> {
                        System.out.println("The addition is :" + c.add(num1, num2));
                    }
                    case 2 -> {
                        System.out.println("The subtraction is :" + c.subtract(num1, num2));
                    }
                    case 3 -> {
                        System.out.println("The multiplication is :" + c.multiply(num1, num2));
                    }
                    case 4 -> {
                        System.out.println("The division is :" + c.divide(num1, num2));
                    }
                    case 0 -> {
                        System.out.println("Thank you for using the calculator");
                        System.exit(1);
                    }
                    default -> {
                        System.out.println("Enter a valid choice!");
                    }
                }
            } while (prompt!=0);
        }
    }
}
