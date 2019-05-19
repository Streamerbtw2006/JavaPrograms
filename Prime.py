package example;
import java.util.Scanner;

public class Prime {   
		 public static void main(String args[]){  
		 Scanner sc = new Scanner(System.in);
		  int factor,half=0,YoN=0;      
		  int check = sc.nextInt();
		  half=check/2;      
		  if(check==0||check==1){  
		   System.out.println(check+" is not prime number");      
		  }else{  
		   for(factor=2;factor<=half;factor++){      
		    if(check%factor==0){      
		     System.out.println(check+" is not prime number");      
		     YoN=1;      
		     break;      
		    }      
		   }      
		   if(YoN==0)  { System.out.println(check+" is prime number"); }  
		  } 
		}    
		}   

