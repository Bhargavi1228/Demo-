package javalearning;

public class DataTypes {
	
	public static void main (String[] args) {
		
		/* 
		Class - 8/28/23, Java classes 
		
		1) SUM OF 2 NUMBERS
		
		
		byte K2 = 127; 
		byte K1 = 125;
		int P1 = (K2 + K1);
		System.out.println(P1); 
		
	
		---------------------------
		2) 
		int X = 200; 
		byte U = (byte)128;  //128 is out of range : byte range  -128 to 127 
		
		System.out.println(X+U);
		
		//due to overflow -- output : 72
		// 328-256 = 72
		-------------------------------
		

		
		
		
		
		/*   1. Write a Java program to add two strings:
		 *  String a = “Hello“;

    		String b = “Bhargavi“

    		Expected Output : Hello Bhargavi */
	
	
		String a = "Hello";

        String b = "Bhargavi";
        		
        		System.out.println(a+  " " + b);
       //-------------------------------------------
        		
      /*  	2. Write a Java program to print the sum of two numbers.

        	 			74 + 36 

        				Expected Output: 110 */
        		
        int i = 74;
        int x = 36; 
        System.out.println(i+x);
        
        //--------------------------
        //  Write a Java program to print the division of two numbers. [k = 50/3]
        
        int k= 50/3;
        System.out.println(k);
		
       //----------------------------
        
       /* 4. Write a Java program to compute the specified expressions and print the output. Go to the editor.

    	Test Data:

    	((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))  */

        
        double z = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        
        
        System.out.println(z);
        
        //--------------------------
       
        String s = "Hello Selenium";
        char s1 = 't';
        
        System.out.println(s + " & " + s1);
        
        //--------------------------
        //Create three int variables having values like : 100, 200, 3400. 
        //Add them and concatenate and generate this output String : 
    	// "Your Total  amount is. 3700".
        
        int a1 = 100; 
        int b1 =200; 
        int c = 3400; 
        
        int sum = a1+b1+c; 
        
        System.out.println("Your total amount is. "  + sum);
        
        //--------------------------
        
        char alpha = 'h';
        int ascii  = (int)alpha;
        
        System.out.println("Ascii value of h is " + ascii);
        
        char alpha1 = 'h';
        int x1 = (int)alpha1;
        
        System.out.println(x1);
        
        //--------------------------
        
        // 7. Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character.
        
        
        char s5 ='d';
        int ascii1 = (int) s5;
        
        int newascii =(int) s5+ 3; 
        
        
        System.out.println("the ascii value of d: " + ascii1 );
        
        System.out.println("the new ascii after adding 3: " + newascii );
        
        
       
            
    //-----
        
   //  8.Write a program to find the square of the number 3.9
        
        double number = 3.9;
        
        double result = number * number; 
        
        System.out.println(result);
        
        
        

      
        

        
     

        

        	

        	

        	

        	

        	
	}
}
