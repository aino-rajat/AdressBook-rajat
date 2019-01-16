package test;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Test.*;
import org.junit.Test.*;
import org.junit.Test.*;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import jUnit.Menu;
import jUnit.MenuCrudConsoleUtil;


public class MenuCrudConsoleTest 
{
	static MenuCrudConsoleUtil menuCrudobj=new MenuCrudConsoleUtil();;

	Logger mylogger=Logger.getLogger(this.getClass().getName());
	
	/*@BeforeClass
	public static void  Initailize()
	{
		  menuCrudobj=new MenuCrudConsoleUtil();
	}
	*/
	
	@Test
	public void createMenu()
	{
		menuCrudobj.CreateMenu();
		assertNotNull(menuCrudobj);
	}
	
	@Test
	public  void addMenuItem()
	{
		Menu mobj=new Menu("rajat");
		assertNotNull(mobj);
	}
	
	@AfterClass
	public void afterExecution()
	{
		menuCrudobj=null;
	
	}
}
