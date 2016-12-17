import java.util.Scanner;
public class ValidatorTestApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MyValidator vd = new MyValidator(sc);
		
		System.out.println("Welcome to the Validation Tester application");
		
		System.out.println("\nInt Test");
		vd.getIntWithinRange("Enter an integer between -100 and 100: ", -100 , 100);
		
		System.out.println("\nDouble Test");
		vd.getDoubleWithinRange("Enter any number between -100 and 100: ", -100 , 100);
		
		System.out.println("\nRequired String Test");
		vd.getRequiredString("Enter your email address:");
		
		System.out.println("\nString Choice Test");
		vd.getChoiceString("Select one (x/y):", "x", "y");
		
		
		System.out.println("\nProgram terminated!!!!");
	}

}
