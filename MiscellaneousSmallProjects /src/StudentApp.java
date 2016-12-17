import java.util.Arrays;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Welcome to the Student Scores Application.\n"); 
		System.out.print("Enter number of students to enter :");
		int number = sc.nextInt();
		sc.nextLine();
		
		Student[] students = new Student[number];
		
		for(int i=0; i< number; i++){
			System.out.print("Student "+ (i+1) + " last name :" );
			String lastName = sc.nextLine();
			System.out.print("Student "+ (i+1) + " first name :" );
			String firstName = sc.nextLine();
			System.out.print("Student "+ (i+1) + " score :" );
			int score = sc.nextInt();
			sc.nextLine();
			
			students[i] = new Student(lastName, firstName, score);
			
			System.out.println();
		}
		
		Arrays.sort(students);

		for(Student s : students){
			System.out.println(s.getLastName() + "," + s.getFirstName() + ":" + s.getScore() );
			
		}
		
	}

}
