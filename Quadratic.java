package example;
import java.util.Scanner;
public class Quadratic {

	public static void main(final String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("give A");
		int a = sc.nextInt();
		System.out.print("give B");
		int b = sc.nextInt();
		System.out.print("give C");
		int c = sc.nextInt();
		
		int lsqrt = 0;
		int sqrt = 0;
		int prans1 = 0;
		int prans2 = 0;
		int ans1 = 0;
		int ans2 = 0;
		
		lsqrt = b*b - 4 * a * c;
		sqrt = (int) Math.sqrt(lsqrt);
		
		if (sqrt < 0) {
			System.out.print("Your number is invalid");
		}
		else {
			prans1 = -b + sqrt;
			prans2 = -b - sqrt;
			
			ans1 = prans1/(2*a);
			ans2 = prans2/(2*a);
			System.out.println("Your answers are" + ans1 + "and" +ans2);
	}
}}
