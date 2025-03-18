package program;

public class Operators {
	public static void main(String[] args) {
		int a = 5, b = 8;
		
		//Arithmetic
		System.out.println("addition: "+(a+b));
		System.out.println("subtraction: "+(a-b));
		System.out.println("multiplicaion: "+(a*b));
		
		//Relational
		System.out.println("Equal to: "+(a==b));
		System.out.println("Not Equal: "+(a!=b));
		System.out.println("Greater than: "+(a>b));
		System.out.println("Less than equal to: "+(a<=b));
		
		//Logical &&(AND) 																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																															
		boolean condition1 = true, condition2 = false;
		
		System.out.println("Logical AND: "+(condition1 && condition2));
		System.out.println("Logical OR: "+(condition1 || condition2));
		System.out.println("Logical NOT: "+(!condition1));
		
		//unary
		System.out.println("Post Increment: "+(++a));
		System.out.println("Post decrement: "+(--b));
		System.out.println("unary negation: "+(~a));
		System.out.println("unary negation: "+(~b));
		
		//Assignment
		a+=5;
		System.out.println("+=:"+a);
		
		//Ternary
		String res = (a>b)?"a is greater" : "b is greater";
		System.out.println("Result: "+ res);
		
		//Bitwise
		/***
		 * AND-->&
		 * OR-->|
		 * NOT-->~
		 * XOR-->^
		 */
		
		
	}
	
}