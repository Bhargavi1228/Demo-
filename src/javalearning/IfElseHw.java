package javalearning;

import java.util.Scanner;

public class IfElseHw {

	public static void main(String[] args) {
		
		
//	1.	Find out the greatest number out of four different given numbers:

//			Input the 1st number: 25 
//
//			Input the 2nd number: 78 
//
//			Input the 3rd number: 87
//
//			Input the 4th number: 97



//		int s = 97;
//		if(s >= 95) {
//			System.out.println("the greatest number is" + " " + s);
//		}
//		else if(s <= 25) {
//			System.out.println("print 25");
//			
//		}
//		else if(s <= 78) {
//			System.out.println("print 78");
//	}
//		else if(s >= 87) {
//			System.out.println("print 87");
//		}
//}



//-----------




//2. Write a Java program to test a number is positive or negative.
//
//Test Data
//
//Input number: 35 -- positive number
//
//Input number: -11 -- negative number


   
//Scanner scanner = new Scanner(System.in);
//
//System.out.println("enter a digit:");
//  
//  int n = scanner.nextInt();
//  
//  if(n > 0)
//  {
//	  System.out.println("Positive");
//	 
//  }  else if(n < 0){
//	  System.out.println("Negative ");
//  
//  }  else {
//	  System.out.println("zero ");
//  
//  }
//  
//
//}
//}

		
	//	WAP to check number is odd or even using If - Else
		//---------

		Scanner scanner = new Scanner(System.in);
	
		System.out.println("enter a digit:");
		  
		  int number = scanner.nextInt();
		  
		  if (number % 2 == 0) {
	            System.out.println(number + " is an even number.");
	        } else {
	            System.out.println(number + " is an odd number.");
	        }
	}
}





