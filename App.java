package numberGuessingGame.com;

import java.util.Random;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		int lowerlimit=1;
		int upperlimit=100;
		int numberOfAttempt=0;
		int target=random.nextInt(upperlimit-lowerlimit+1)+lowerlimit;
		
		while(true) {
		System.out.println("Guess the number");
		int a=sc.nextInt();
		numberOfAttempt++;
		
		if(a<target){
			System.out.println("Too low,Try Again");
			
		}
		else if(a>target){
			System.out.println("Too high,Try Again");
		}
		else if(a==target) {
			System.out.println("you win ! you choose correct number with "+numberOfAttempt+" attempts");
			break;
		}
		else {
			System.out.println("Invalid input");
		}
	}
	}
}
