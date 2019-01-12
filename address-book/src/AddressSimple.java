import java.util.Scanner;
public class AddressSimple 
{
	private int id;
    private String name;
    private String street;
    private String city;
    public String country;
    public int Zip;
 
    public void get()
    {
    	Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter ID: ");
		id=sc.nextInt();
		
		System.out.print("Enter Name: ");
		name=sc.next();
		
		System.out.print("Enter Street: ");
		street=sc.next();
		
		System.out.print("Enter City: ");
		city=sc.next();
		
		System.out.print("Enter Country: ");
		country=sc.next();
		
		System.out.print("Enter Zip: ");
		Zip=sc.nextInt();

    }
    public void set()
    {
    	System.out.println("=============Displaying Details ==========");
    	System.out.println(id);
    	System.out.println(name);
    	System.out.println(street);
    	System.out.println(city);
    	System.out.println(country);
    	System.out.println(Zip);
    	
    }
    	public static void main(String[] args) 
  
	{
		// TODO Auto-generated method stub
    		AddressSimple obj1=new AddressSimple();
    		
    		obj1.get();
    		obj1.set();
    		
    		
	}

}
