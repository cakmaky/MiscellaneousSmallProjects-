import java.util.Scanner;

public class PigLatin {

	public static boolean isVowel(char c){

		if(c == 'a' || c == 'e' || c == 'i' ||c == 'o' ||c == 'u'){
			return true;
		}
		else 
			return false;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Pig Latin Translator.");
		String choice = "y";

		while (choice.equalsIgnoreCase("y")){
			System.out.println("\nEnter a line to be translated to Pig Latin:");
			String line = sc.nextLine();
			while(line.isEmpty()){
				System.out.println("You did not enter anything. Please Enter a line to be translated to Pig Latin:  ");
				line = sc.nextLine();
			}


			String[] words = line.toLowerCase().split(" ");

			for(int i=0; i<words.length; i++ ){

				if(isVowel(words[i].charAt(0))){

					words[i] += "way";

				}
				else {

					for (int j=1; j< words[i].length(); j++){

						if(isVowel(words[i].charAt(j))){
							String str1 = words[i].substring(0, j);
							String str2 = words[i].substring(j, (words[i].length()));

							words[i] = str2 + str1 + "ay";
							break;	
						}
					}

				}
			}
			for(int i=0; i<words.length; i++ ){	
				System.out.print(words[i] + " ");
			}

			System.out.print("\n\nTranslate another line? (y/n): ");	
			choice = sc.nextLine();

		}
		System.out.println("\nProgram terminated.Thank you!");

	}

}
