
public class Employee extends Person{
	String ssn;

	public Employee(){
		super();
		ssn = "";
	}

	public String getSsn(){
		return ssn;
	}
	public void setSsn(String ssn){
		this.ssn = ssn;
	}
	@Override
	public String getDisplayText(){
		return super.toString() +
				"Social security number : " + ssn + "\n";		
	}

}
