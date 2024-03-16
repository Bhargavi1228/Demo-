package javalearning;

public class Parent {
	
	public static void main (String[] args) {
		
		/*Print 
		
		System.out.println("Hi, print in console");
		
		//sum of 2 numbers 
		
		
		int value1 = 2;
		int value2 = 5; 
		int Sum = value1+value2;
		System.out.println("Sum is " + Sum );
		
		*/
		
		System.out.println("Navigated to home page");
		
		Basics2 m = new Basics2();        //Classobject.methodname
		
		System.out.println( m.ValidateHeader());       
		
		
		int i = 11;
		i=i++ + ++i;
		System.out.println(i);
		
	}
}
