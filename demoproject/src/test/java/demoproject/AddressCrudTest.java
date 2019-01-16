package demoproject;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import Addressbookjava.Address;
import Addressbookjava.AddressCrud;

public class AddressCrudTest 
{
	Logger mylogger=Logger.getLogger(this.getClass().getName());
	public static Address addobj=new Address();
	AddressCrud addrcrudobj=new AddressCrud();
	
@Test
public void CreateTest()
	{

	addrcrudobj.Create();
	
	//assertTrue(addrcrudobj.hobj.get("Rajat").name.equals("Rajat"));
	//assertTrue(addrcrudobj.hobj.get("kp").street.equals("kp"));
	//assertTrue(addrcrudobj.hobj.get("pune").city.equals("pune"));
	//ssertTrue(addrcrudobj.hobj.get("india").country.equals("india"));
	}


@Test
public void updateTest()
	{
	Address addressobj;
	//addressobj=addrcrudobj.Create();
	//System.out.println(addressobj.name);
	//addrcrudobj.Update(addressobj.name);
	
	//assertTrue(addrcrudobj.hobj.get("Rajat").name.equals("Rajat"));
	//assertTrue(addrcrudobj.hobj.get("Rajat").street.equals("mg"));
	//assertTrue(addrcrudobj.hobj.get("Rajat").city.equals("bombay"));
	//assertTrue(addrcrudobj.hobj.get("Rajat").country.equals("AUS"));
	//assertTrue(addrcrudobj.hobj.get("Rajat").Zip == (12345));
	}

@Test
public void deleteTest()
	{
	addrcrudobj.Create();
	addrcrudobj.Delete("Rajat");
	//assertFalse(addrcrudobj.hobj.containsKey("Rajat"));
	
	}

@AfterClass
public void afterExecute()
	{
	addrcrudobj=null;
	}

}