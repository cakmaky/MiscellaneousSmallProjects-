import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String choice = "y";
		String ochoice = "";

		System.out.println("Welcome to the Person Tester application");

		while (choice.equalsIgnoreCase("y")){
			System.out.print("\nCreate customer or employee? (c/e): ");
			ochoice = sc.nextLine();

			if(ochoice.equals("c")){
				Customer cm = new Customer();	
				System.out.print("\nEnter first Name: ");
				cm.setFirstName(sc.nextLine());

				System.out.print("Enter last Name: ");
				cm.setLastName(sc.nextLine());

				System.out.print("Enter email adress: ");
				cm.setEmail(sc.nextLine());

				System.out.print("Customer number: ");
				cm.setCustomerNo(sc.nextLine());

				System.out.println("\nYou entered:\n" + cm.getDisplayText());
			}
			else if(ochoice.equals("e")){
				Employee em = new Employee();
				System.out.print("\nEnter first Name: ");
				em.setFirstName(sc.nextLine());

				System.out.print("Enter last Name: ");
				em.setLastName(sc.nextLine());

				System.out.print("Enter email adress: ");
				em.setEmail(sc.nextLine());

				System.out.print("Social security number: ");
				em.setSsn(sc.nextLine());

				System.out.println("\nYou entered:\n" + em.getDisplayText());
			}
			else {
				System.out.println("Invalid choice. Please try again.");
				continue;
			}
			System.out.print("Continue? (y/n): ");	
			choice = sc.nextLine();	
		}	
		System.out.println("Program terminated!!!");	
	}
}


