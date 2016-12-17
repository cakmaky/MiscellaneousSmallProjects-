import java.util.*;
public class StackApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		StackCalculator stack = new StackCalculator();

		System.out.println("Welcome to the Stack Calculator.\n" 
				+ "\nCommands: push n, add, sub, mult, div, clear, or quit.");   

		String request = "";
		double[] Array;

		while(!(request.equals("quit"))){

			System.out.print("? : ");
			request = sc.nextLine();

			if(request.startsWith("push")){
				double number = Double.parseDouble(request.substring(4));
				stack.push(number);
			}
			else if(request.equals("add")){
				stack.add();	
			}
			else if(request.equals("sub")){
				stack.subtract();
			}
			else if(request.equals("mult")){
				stack.multiply();
			}
			else if(request.equals("div")){
				stack.divide();
			}
			else if(request.equals("clear")){
				stack.clear();
			}
			else if(request.equals("quit")){
				continue;
			}
			else { 
				System.out.println("Invalid input. Please try again.");
				continue;
			}

			Array = stack.getValues();
			if(Array.length == 0){
				System.out.println("Empty");
			}
			for(int i=0; i<Array.length; i++){
				System.out.println(Array[i]);
			}

		}
		System.out.println("Program terminated.!!!");
	}

}
