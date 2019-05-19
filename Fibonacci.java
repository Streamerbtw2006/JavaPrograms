package example;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Give number to caculate sum of the terms up to");
		int num = sc.nextInt();	
		int x = 1;
		int y = 1;
		int ans = 0;
		int i = 1;
		int x1 = 0;
		
		while (i < num-2) {
			x1 = 0+x;
			x = x+y;
			y = x1+0;
			System.out.println(x + ", " + y);
			i++;
			
		
		
	}
	System.out.println(x);
		
	}

}
