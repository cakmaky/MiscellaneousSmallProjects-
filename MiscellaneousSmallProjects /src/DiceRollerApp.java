import java.util.Scanner;

public class DiceRollerApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Paradise Roller application\n");
		
		int rollNo = 0;
		System.out.print("Roll the dice? (y/n): ");	
		String choice = sc.next();	
		
		while (choice.equalsIgnoreCase("y")){
			rollNo++;
			System.out.println("\nRoll " + rollNo + ":");
			
			PairOfDice myDices = new PairOfDice();
			myDices.roll();
			
			System.out.println(myDices.getValue1());
			System.out.println(myDices.getValue2());
			
			if(myDices.getSum() == 2)
				System.out.println("Snake eyes!");
			else if(myDices.getSum() == 7)
				System.out.println("Craps!");
			else if(myDices.getSum() == 12)
				System.out.println("Box cars!");
			
			System.out.print("\nRoll again? (y/n): ");	
			choice = sc.next();	
			
		}
		System.out.println("\nProgram terminated.Thank you!");
		
		
	}

}
