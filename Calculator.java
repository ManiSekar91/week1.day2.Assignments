package week1.day2;

public class Calculator {
	
	public void add() {
	
		int a = 15;
		int b = 10;
		int c= 5;
		int d = a+b+c;
		
		System.out.println("Addition: " + d);

	}
	
	public void sub() {
		int a = 78;
		int b = 18;
		int c = a-b;
		System.out.println("Subtraction: " + c);
	}
	
	public void mul() {
		double a = 5.5;
		double b = 2.5;
		System.out.println("Multiplication: "+ a*b);
	}
	public void div() {
		float a = 55f;
		float b = 25;
		System.out.println("Divide:" + a/b);
	}

}
