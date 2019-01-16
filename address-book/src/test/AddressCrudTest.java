package test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

import jUnit.Address;
import jUnit.AddressCrud;

public class AddressCrudTest
{
	public static AddressCrud addrcrudobj=new AddressCrud();
	public static Address addobj=new Address();

	@Before
	public void initialize()
	{
		
	}
@Test
public void CreateTest()
	{
	/*addobj=new Address();
	addobj=obj.Create();
	 assertNotNull(addobj);*/
	
	addobj.id=1;
	addobj.name="Rajat";
	addobj.street="MG";
	addobj.city="pune";
	addobj.country="India";
	addobj.Zip=411001;
	//hobj2.put("rajat",addobj);
	
	
	Address address=new Address();
	addrcrudobj.Create();
	//addrcrudobj.hobj.get("rajat",addobj);
	//AddressCrud addoCrudObj2=new AddressCrud();
	//addoCrudObj2.Create();
	
//	assertTrue(addrcrudobj.

	/*assertTrue((addr.hobj.get(addobj.name).equals(hobj2.get(addobj.name));
	assertTrue((addoCrudObj2.hobj.get("Rajat").street) equals (hobj2.get("MG")));
	assertTrue((addoCrudObj2.hobj.get(city)) == (hobj2.get("Pune")));
	assertTrue((addoCrudObj2.hobj.get(Country)) == (hobj2.get("India")));
	assertTrue((addoCrudObj2.hobj.get(Zip)) == (hobj2.get("411001)));*/
	}

@Test
 public void updateTest()
 {
	addrcrudobj.Create();
	
	addobj.setId(1);
	addobj.setName("Pratik");
	addobj.setStreet("MG");
	addobj.setCity("Pune");
	addobj.setCountry("India");
	addobj.setZip(411001);
	//hobj2.replace("Rajat",addobj);
	addrcrudobj.Update("Rajat");
	
	Address addobj2=new Address();
	//addobj2=hobj2.replace("Rajat",addobj);
	assertNotNull(addobj2);
 
 }

	
}


