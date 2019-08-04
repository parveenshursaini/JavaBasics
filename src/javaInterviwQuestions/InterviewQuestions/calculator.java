package InterviewQuestions;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		
		Scanner scr=new Scanner(System.in);
		System.out.println("Enter first number");
		int n1=scr.nextInt();
		
		System.out.println("Enter second number");
		int n2=scr.nextInt();
		
		System.out.println("select symbol +,-,*,/");
		String symbol=scr.next();
		int result;
		switch(symbol) {
		
		case "+": result=n1+n2;
		System.out.println("addition is-" + result);
		break;
		
		case "-": result=n1-n2;
		System.out.println("substraction is-"+ result);
		break;
		
		case "*": result=n1*n2;
		System.out.println("multiplication is-"+ result);
		break;
		
		case "/": result=n1/n2;
		System.out.println("division is-"+ result);
		break;
		
		default:
		System.out.println("enter correct symbol please");
		break;
		}

	}

}
