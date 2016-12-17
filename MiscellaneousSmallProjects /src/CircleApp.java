import java.util.Scanner;

public class CircleApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")){

			double radius = Validator.getDouble(sc, "\nEnter radius:  ");
			Circle myCircle = new Circle(radius);

			System.out.println("Circumference  : "+ myCircle.getFormattedCircumference());
			System.out.println("Area           : "+ myCircle.getFormattedArea());

			System.out.print("\nContinue? (y/n): ");	
			choice = sc.next();	
		}
		System.out.println("\nGoodbye. You created " + Circle.getObjectCount() + " Circle object(s)." );  
	}
}
