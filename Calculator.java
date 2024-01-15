package simpleCalculator.com;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		boolean x=true;
		
			
		
		System.out.println("Enter any two numbers");
		
		while(x) {
			System.out.println("Enter first number");
			int a=sc.nextInt();
			
			System.out.println("Enter operation");
	    char operator=sc.next().charAt(0);
	    
	  
	    System.out.println("Enter second number");
	    int b=sc.nextInt();
		switch(operator) {
		
		case '+':
       System.out.println("Addition ="+(a+b));
       break;
		
		case '-':
		System.out.println("substraction ="+(a-b));
		break;
		
		case '*':
		System.out.println("multiplication ="+(a*b));
		break;
		
		case '/':
			if(b!=0) {
				System.out.println("division ="+(a/b));
			}
			else {
				System.out.println("can not divide by zero");
			}
		
		break;
		
		 default:
			System.out.println("invalid operator");
			x=false;
			
		}
		
	}
		
 }

}
