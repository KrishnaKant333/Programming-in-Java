import java.util.Scanner;

public class rev_5digit_manual {
	public static void main(String[] args) {

		int n;
		System.out.println("Enter a five digit number :");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // for eg --> n = 12345

		if(n>=10000 && n<=99999){ // check if n is 5 digit number or not
			int n1 ,n2, n3, n4, n5;
			n1 = n/(int)Math.pow(10, 4); // n1 = 12345/10000 = 1
			n2 = (n%10000)/(int)Math.pow(10, 3); // n2 = 2345/1000 = 2
			n3 = (n%1000)/(int)Math.pow(10, 2); // n3 = 345/100 = 3
			n4 = (n%100)/(int)Math.pow(10, 1); // n4 = 45/10 = 4
			n5 = (n%10)/(int)Math.pow(10, 0); // n5 = 5/1 = 5

			int r = n5*(int)Math.pow(10, 4) + n4*(int)Math.pow(10, 3) + n3*(int)Math.pow(10, 2) + n2*(int)Math.pow(10, 1) + n1*(int)Math.pow(10, 0);

			System.out.println("The reverse of "+n+" is "+r);
		}
		else{
			System.out.println("Please enter a 5 digit number only!");
		}
	}
}
