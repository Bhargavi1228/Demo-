package javalearning;

public class Homework911 {
	
	String name; 
	int age;
	String city;

	public static void main(String[] args) {
		
		Homework911 u1 = new Homework911();
		u1.name = "Rahul";
		u1.age = 25;
		u1.city = "Pune";

		Homework911 u2 = new Homework911();
		u2.name = "Pooja";
		u2.age = 35;
		u2.city = "LA";

		Homework911 u3 = new Homework911();
		u3.name = "Satish";
		u3.age = 30;
		u3.city = "Bangalore";

		
		Homework911 u4 = new Homework911();
		u4.name = "Uday";
		u4.age = 30;
		u4.city = "Bangalore";
		
		//-----------
		System.out.println(u1.name + " " + u1.age + " " + u1.city); //Rahul
		System.out.println(u2.name + " " + u2.age + " " + u2.city); //Pooja
		System.out.println(u3.name + " " + u3.age + " " + u3.city); //Satish
		System.out.println(u4.name + " " + u4.age + " " + u4.city); //Uday
		
		
		System.out.println("------------");
		
		u1 = u2;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Pooja
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Satish 
		System.out.println(u4.name + " " + u4.age + " " + u4.city); //Uday
		
		System.out.println("------------");
		
		u2 = u3;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Satish
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Satish
		System.out.println(u4.name + " " + u4.age + " " + u4.city); //Uday
		
		System.out.println("------------");
		
		u3 = u4;
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Satish
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Uday
		System.out.println(u4.name + " " + u4.age + " " + u4.city); //Uday
		
		
		
		System.out.println("------------");
		
		u4=u1;
		
		System.out.println(u1.name + " " + u1.age + " " + u1.city);//Pooja
		System.out.println(u2.name + " " + u2.age + " " + u2.city);//Satish
		System.out.println(u3.name + " " + u3.age + " " + u3.city);//Uday
		System.out.println(u4.name + " " + u4.age + " " + u4.city); //Pooja
		
		System.out.println("------------");
		
	}
	

}
