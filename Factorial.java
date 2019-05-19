package example;

import java.util.Scanner;

public class Factorial {
	public static void main(final String[] args){
		
		int t = 1;
		int i = 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("give your number");
		int n = sc.nextInt();
		while (i < n+1) {
			t = t * i;
			i++;
		}
		System.out.println(t);	
		}


}
