package demoproject;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Addressbookjava.Address;
import Addressbookjava.AddressCrud;
import Addressbookjava.MySqlAddressStore;

public class MySqlAddressStoreTest
{
	
	 MySqlAddressStore mySqlAddressStoreObj=new MySqlAddressStore();
	
	public static AddressCrud addresscrudobj=new AddressCrud();
	@Before
	public void initialize()
	{
		
		
	}
	@Test
	public void createTest() 
	{	
		Address address=new Address();
		address.id=1;
		address.name="Rajat";
		address.street="kp";
		address.city="Pune";
		address.country="india";
		address.Zip=41001;
	
		int id=mySqlAddressStoreObj.add(address);
		assertTrue(id==1);
		
	}
	@Test
	public void readTest() 
	{	
		Address address=new Address();
		address.id=1;
		address.name="Rajat";
		address.street="kp";
		address.city="Pune";
		address.country="india";
		address.Zip=41001;
		
		Address address1=new Address();
		address1=mySqlAddressStoreObj.read(address.name);
		
		assertTrue(address.id==address1.id);
		assertTrue(address.name.equals(address1.name));
		assertTrue(address.street.equals(address1.street));
		assertTrue(address.city.equals(address1.city));
		assertTrue(address.country.equals(address1.country));
		assertTrue(address.Zip==address1.Zip);
		
	}
@Test
public void updateTest()
	{
	Address address1=new Address();
	address1.id=1;
	address1.name="Rajat";
	address1.street="dp";
	address1.city="Pune";
	address1.country="india";
	address1.Zip=41001;
	
	
	int id=mySqlAddressStoreObj.update(address1.name,address1);
	assertTrue(id==1);
	
	}
@Test
	public void deleteTest()
   {
	Address address1=new Address();
	address1.id=1;
	address1.name="Rajat";
	address1.street="kp";
	address1.city="Pune";
	address1.country="india";
	address1.Zip=41001;

	int id=mySqlAddressStoreObj.add(address1);
	address1.name="rohan";
	int id1=mySqlAddressStoreObj.delete(address1.name);
	assertTrue(id1==0);
		}
}
