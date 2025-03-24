package Session_5;

public class Calculator {
	
	public int add(int a, int b) {
		return 0;
	}
	public int add(int a, int b, int c) {
		return a+b+c;
	}
	
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println(calc.add(5, 10));
		System.out.println(calc.add(8, 16, 24));
	}
	
	
}
