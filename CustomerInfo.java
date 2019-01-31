public class CustomerInfo {
	private CustomerInfo rightvalue;
	private CustomerInfo leftvalue;
	private String lastName;
	private String firstName;
	private int customerID;
//class CustomerInfo is instantiated with the above attributes 

	public CustomerInfo(int customerID, String firstName, String lastName) {
    this.firstName = firstName;
		this.leftvalue = null;
		this.rightvalue = null;		
		this.customerID = customerID;
		this.lastName = lastName;

	}
//object Customer info is instantiated with the above values for each attribute

//getters and setter methods below for each private attribute. 
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getcustomerID() {
		return this.customerID;
	}

	public void setcustomerID(int customerID) {
		this.customerID = customerID;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public CustomerInfo getLeft() {
		return this.leftvalue;
	}

	public void setLeft(CustomerInfo left) {
		this.leftvalue = leftvalue;
	}

	public CustomerInfo getRight() {
		return this.rightvalue;
	}

	public void setRight(CustomerInfo right) {
		this.rightvalue = rightvalue;
	}

}
