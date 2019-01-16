package demoproject;

import static org.junit.Assert.assertNotNull;

import java.util.logging.Logger;

import org.junit.Test;

import Addressbookjava.Menu;
import Addressbookjava.MenuCrudConsoleUtil;

public class MenuCrudConsoleUtilTest {

	static MenuCrudConsoleUtil menuCrudobj=new MenuCrudConsoleUtil();

	Logger mylogger=Logger.getLogger(this.getClass().getName());
	
	@Test 
	public void createMenuTest()
	{
		menuCrudobj.CreateMenu();
		MenuCrudConsoleUtil obj2 =new MenuCrudConsoleUtil();
		menuCrudobj.CreateMenu();	
		
		assertNotNull(menuCrudobj);
	}
	@Test
	public  void addMenuItemTest()
	{
		Menu mobj=new Menu("rajat");
		
		menuCrudobj.addMenuItem(mobj);
		assertNotNull(mobj);
	}

}
