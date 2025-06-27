import java.util.Scanner;

public class rev_loop {
	public static void main(String[] args) {
		int n,i,d,r=0;
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (i = n; i > 0; i=i/10) {
			d=i%10;
			r=r*10+d;
		}

		System.out.println("The reverse of "+n+" is "+r);
	}
}
