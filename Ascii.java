import java.util.*;


public class Ascii
{


	public static void main(String args[]){


		
	Scanner in1 = new Scanner(System.in);

	String input  = in1.nextLine();	

	int length = input.length();

	int sum = 0;

	int i = 0;


		for(i = 0 ; i < length ; i++){
	
  		char test = input.charAt(i);

		sum = sum + (int)test;
		
	       
	      		}

		System.out.println("the sum of the numbers is :" + sum);
		

	}

}
