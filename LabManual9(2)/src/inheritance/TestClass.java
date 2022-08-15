package inheritance;

public class TestClass {
public static void main(String[] args) {
	   PartTimeEmployee p1=new PartTimeEmployee("Rahim",52,"Dhaka","ECE","Faculty",35,20);
	   System.out.println("Salary of part time employee is: "+p1.salary());
	   
       FullTimeEmployee f1=new FullTimeEmployee("Karim",32,"Dhaka","BBA","Faculty",0,0,15000,25);
       System.out.println("Salary of full time employee is: "+f1.salary());
      
}
}
