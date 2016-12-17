import java.util.ArrayList;
import java.util.Scanner;

public class ConversionsApp {

	public static void displayMenu()
	{
		System.out.println("\n1 - Convert a length");
		System.out.println("2 - Add a type of conversion");
		System.out.println("3 - Delete a type of conversion");
		System.out.println("4 - Exit");	
	}
	public static void displayFile(ArrayList<Conversion> conversions)
	{
		int i = 1;
		for(Conversion c : conversions){
			System.out.println(i++ + " - " + c.getFromUnit() +" to " + c.getToUnit() + " : " + c.getRatio());
		}	
	}
	public static void main(String[] args) {
	
		ConversionsTextFile file = new ConversionsTextFile();
		
		ArrayList<Conversion> conversions = file.getConversions();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the Length Converter");
		displayMenu();
		
		System.out.print("\nEnter menu number: ");
		int menuNo = sc.nextInt();
		sc.nextLine();
		
		while(menuNo != 4){
			
			if(menuNo == 1){
				displayFile(conversions);
				
				System.out.print("\nEnter conversion number: ");
				int convNo = sc.nextInt();
				while(convNo > conversions.size()){
					System.out.println("\nInvalid choice.Please try again!!!");
					System.out.print("Enter conversion number: ");
					convNo = sc.nextInt();
				}
				String fromUnit = conversions.get(convNo-1).getFromUnit();
				String toUnit = conversions.get(convNo-1).getToUnit();
				
				System.out.print("\nEnter " + fromUnit + ":");
				//double value = sc.nextDouble();
				conversions.get(convNo-1).setFromValue(sc.nextDouble());
				
				//double result = conversions.get(convNo-1).getRatio() * value; 
				
				System.out.println(conversions.get(convNo-1).getFromValue() + " " + fromUnit + " = " + conversions.get(convNo-1).getToValue() + " " + toUnit);
			}
			else if(menuNo == 2){
				System.out.print("Enter 'From' unit : ");
				String fromUnit = sc.nextLine();
				System.out.print("Enter 'To' unit : ");
				String toUnit = sc.nextLine();
				System.out.print("Enter the conversion ratio: "); 
				Double ratio = sc.nextDouble();
				
				Conversion c = new Conversion(fromUnit, toUnit, ratio);
				conversions.add(c);
				
				if(file.saveConversions()){
					System.out.println("\nThis entry has been saved.");
				}
				else {
					System.out.println("This entry could not be saved");
				}	
			}
			else if(menuNo == 3){
				displayFile(conversions);
				System.out.print("\nWhich conversion do you want to delete? : ");
				int convNo = sc.nextInt();
				
				conversions.remove(convNo - 1);
				
				if(file.saveConversions()){
				System.out.println("\nThis conversion has been deleted successfully. Check below!\n");
				displayFile(conversions);
				
				}
				else {
					System.out.println("There is an error while deletion!");
				}
				
			}
				
		displayMenu();	
		System.out.print("\nEnter menu number: ");
		menuNo = sc.nextInt();
		sc.nextLine();
		}
		System.out.println("\nProgram terminated!.Goodbye.");
		
	}
}





