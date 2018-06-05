package javaPracticeCoding;

import java.util.Arrays;
import java.util.Scanner;

public class TestRun {

	public static void main(String[] args) {
	
		
		showEvenOrOddNumber();
		sumOfArray();

	}

	
	
	
	
	public static void showEvenOrOddNumber() {
		
	Scanner scan =new Scanner(System.in);
	
	System.out.println("Please enter you number!");
	
	int num =scan.nextInt();
	
	if(num%2==0) {
		System.out.println("this number is Even!");
	}
	else {
		
		System.out.println("this number is Odd!");
	}
		
	}
	
	
	public static void sumOfArray() {
		
		int [] array= {20,30,40};
		
		int sum=5;
		
		for(int num:array) {
			
			sum =sum + num;
			System.out.println(Arrays.toString(array));
		}
	}
}
