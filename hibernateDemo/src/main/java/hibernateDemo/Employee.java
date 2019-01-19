package hibernateDemo;


	import javax.persistence.Entity;  
	import javax.persistence.Id;  
	import javax.persistence.Table;  
	  
	@Entity  
	@Table(name= "Employee")   
	public class Employee 
	{    
	  
	@Id   
	private int id;    
	private String firstName,lastName,middlename;
	public void setId(int id) {
		this.id = id;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}
	public int getId() {
		return id;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getMiddlename() {
		return middlename;
	}
	 
	    
	}
	

