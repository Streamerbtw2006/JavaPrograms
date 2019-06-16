package MyMath;
import java.lang.Math; 
import java.util.Scanner;
public class Binary {
	
	public int getDigit(int number, int base, int n) {    
		  return (int) ((number / Math.pow(base, n - 1)) % base);
	}

	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me da loot");
		String num = sc.nextLine();
		int len = num.length();
		int i = 0;
		int fin = 0;
		int intnum = Integer.valueOf(num);
		
		while (len > 0) {
			int dig = getDigit(intnum, 2, i+1);
			if (dig == 1){
				fin = (int) (Math.pow(2, i)+fin);
			}
			if (dig == 0){
				continue;
			}
			else {
				System.exit(0);
				
			}
		i = i+1;
		len = len -1;
			
			
			
		}
	print(fin);
	}
}

	
