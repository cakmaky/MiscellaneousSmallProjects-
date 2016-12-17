import java.util.Scanner;
import java.util.ArrayList;
public class CountriesApp {

	//private static CountriesTextFile file = null;
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		CountriesTextFile file = new CountriesTextFile();
		
		System.out.println("Welcome to the Countries Maintenance application\n");
		System.out.println("1 - List countries \n2 - Add a country \n3 - Delete a country \n4 - Exit\n");
		System.out.print("Enter menu number: ");
		int choice = sc.nextInt();
		while(choice != 4){
			if(choice == 1){
				ArrayList<String> countries = file.getCountries();
				for(String s: countries){
					System.out.println(s);
				}	
			}
			else if(choice == 2){
				System.out.print("Enter country: ");
				String country = sc.nextLine();
			
				file.addCountry(country);
				System.out.println("\nThis country has been saved");
			}
			else if(choice == 3){
				System.out.print("Enter country: ");
				String country = sc.nextLine();
				
				file.deleteCountry(country);
				System.out.println("\nThis country has been deleted");	
			}
			else {
				System.out.print("Invalid choice!");
				
			}
			System.out.println("\n1 - List countries \n2 - Add a country \n3 - Delete a country \n4 - Exit\n");
			System.out.print("Enter menu number: ");
			choice = sc.nextInt();
			sc.nextLine();
		}
		System.out.println("\nGoodbye.");
	

	}

}
