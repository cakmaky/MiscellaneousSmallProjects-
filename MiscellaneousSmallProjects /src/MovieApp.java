import java.util.Arrays;
import java.util.Scanner;

public class MovieApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the Movie List Application.\n");
		System.out.println("There are 100 movies in the list.");

		Movie[] movies = new Movie[100];
		for(int i=0;i<movies.length; i++){
			movies[i] = MovieIO.getMovie(i+1);
		}
		Arrays.sort(movies); 
		String choice = "y";
		while(choice.equals("y")){

			System.out.print("\nWhat category are you interested in? : \n");
			System.out.println("1 - drama \n2 - musical \n3 - scifi \n4 - horror \n5 - comedy \n6 - animated  ");
			System.out.print("\nSelection :");
			String selection = sc.nextLine();
			System.out.println("\nMovies in alphabetical order.\n");
			String category = "";
			switch(selection){
			case "1": 
				category = "drama"; break;
			case "2": 
				category = "musical"; break;
			case "3": 
				category = "scifi"; break;
			case "4": 
				category = "horror"; break;
			case "5":
				category = "comedy"; break;
			case "6":
				category = "animated"; break;
			default: 
				category = "";		
			}

			int counter = 0;
			for(int i=0;i<movies.length; i++){
				if(movies[i].getCategory().equals(category)){
					System.out.println(movies[i].getTitle());
					counter++;
				}
			}
			System.out.println("\nThere are " + counter + " movies in " + category + " category");
			System.out.print("\nContinue? (y/n) :");
			choice = sc.nextLine();
			if(!(choice.equals("y")||choice.equals("n"))){
				System.out.print("Invalid choice. Please try again (y/n):");
				choice = sc.nextLine();
			}

		}
		System.out.println("Program terminated.!!!");

	}

}
