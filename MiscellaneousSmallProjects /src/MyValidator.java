import java.util.Scanner;

public class MyValidator extends OOValidator{
	
	public MyValidator(Scanner sc){
		super(sc);
	}
	
	
	public String getRequiredString(String prompt){
		String s;
		while(true){
			System.out.print(prompt);
			s=sc.nextLine();
			if(s.equals("")){
				sc.nextLine();
				System.out.println("Error! This entry is required. Try again.");
			}
			else {
				return s;
			}
		}			
			
		}
	public String getChoiceString(String prompt, String s1, String s2){
		String choice = "";
		boolean isValid = false;
		do{
			
			choice = getRequiredString(prompt);
			if(!choice.equalsIgnoreCase(s1) && !choice.equalsIgnoreCase(s2)){
				System.out.println("Error! Entry must be " + s1 + " or " + s2 + ".Try again.");
			} else {
				isValid = true;
			}
			
		}while(isValid == false);
		return choice;
		
	}

}
