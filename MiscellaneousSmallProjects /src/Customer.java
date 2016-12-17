
public class Customer extends Person {

	private String customerNo;

	public Customer(){
		super();
		customerNo = "";
	}
	public String getCustomerNo(){
		return customerNo;
	}
	public void setCustomerNo(String customerNo){
		this.customerNo = customerNo;
	}
	@Override
	public String getDisplayText(){
		return super.toString() + 
				"Customer number :" + customerNo + "\n";
	}	

}
