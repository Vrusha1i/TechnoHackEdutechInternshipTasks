package quizGame.com;
import java.util.Scanner;

public class QuizGame {
		
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Question 1: What is the constructor ");
		System.out.println("A:same name as class name");
		System.out.println("B:can not have return type");
		System.out.println("C:can not be static");
		System.out.println("D:All of the above");
		
		char answer1=sc.next().toUpperCase().charAt(0);
		
		if(answer1=='D') {
			System.out.println("Correct!");
		}else
		{
			System.out.println("Incorrect.correct answer is D:All of the above");
		}
		
		
		System.out.println("Question 2: which is not a feature of java programming language ");
		System.out.println("A:having pointer");
		System.out.println("B:Multithreading");
		System.out.println("C:platform Independent");
		System.out.println("D:OOP");
		
		char answer2=sc.next().toUpperCase().charAt(0);
		
		if(answer2=='A') {
			System.out.println("Correct!");
		}else
		{
			System.out.println("Incorrect.correct answer is A:Having pointer");
		}
	}

	
	}



