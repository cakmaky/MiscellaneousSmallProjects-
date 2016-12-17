import java.util.Scanner;

public class NumberToString {

	public static void main(String[] args) {

		String[] units = {"zero","one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
		String[] teens ={"ten","eleven", "twelve", "thirteen", "fourteen", "fifteen","sixteen", "seventeen", "eighteen", "nineteen" };
		String[] tens = {"", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Number to Word Converter.");
		String choice = "y";
		while (choice.equalsIgnoreCase("y")){

			System.out.print("\nEnter the number you want to convert to words: ");
			int number = sc.nextInt();

			while(number < 0 || number > 9999){
				System.out.print("Number must be between 0 and 9999. Please enter the number again: ");
				number = sc.nextInt();
			}
			String result = "";
			int firstD = number % 10;
			int secondD = (number % 100) / 10;
			int thirdD = (number % 1000) / 100;
			int forthD = number/1000;

			if(forthD != 0){
				result += units[forthD] + " thousand ";	
			}

			if(thirdD != 0){
				result += units[thirdD] + " hundred ";
			}
			if(secondD != 0 && secondD != 1){
				result += tens[secondD] + " ";
			}

			if(secondD != 1  && firstD != 0 ){
				result += units[firstD];
			}

			if(secondD == 1){
				result += teens[firstD];
			}
			
			if(firstD == 0 && secondD == 0 && thirdD == 0 && forthD == 0){
				result += units[firstD];
			}
			System.out.print(result);
			System.out.print("\n\nConvert another number? (y/n): ");	
			choice = sc.next();
		}
		System.out.println("\nProgram terminated.Thank you!");

	}
}
