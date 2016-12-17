//import java.util.*;
public class Student implements Comparable {
	
	private String lastName;
	private String firstName;
	private int score;
	
	public Student(String lastName,String firstName,int score){
		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
		
	}
	public String getFirstName(){
		return firstName;
	}
	public void setFirstName(String name){
		firstName = name;
	}
	public String getLastName(){
		return lastName;
	}
	public void setLastName(String name){
		lastName = name;
	}
	public int getScore(){
		return score;
	}
	public void setScore(int score){
		this.score = score;
	}
	
	@Override
	public int compareTo(Object o) {
		Student st = (Student) o;
		int compare = this.getLastName().compareTo( st.getLastName());
		if(compare == 0){
		compare = this.getFirstName().compareTo(st.getFirstName());
		}
		return compare;
		}	
}
