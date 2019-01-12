package main.java.com.main.java.com.AddressBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MenuCrudConsoleUtil 
{

	Scanner sc=new Scanner(System.in);
	
	public Menu CreateMenu()
	{
	System.out.println("Enter menu name");
	String m_name=sc.next();
	Menu m=new Menu(m_name);///creating menu obj
		m.setName(m_name);
		return m;
	}
	
	public void addMenuItem(Menu m)
	{
		String m_name1 = null;
		System.out.println("enter the menu item");
		 m_name1=sc.next();
		
		while(!(m_name1.equals("false")))
		{
		System.out.println("Enter the name for MenuItem or false to exit out off loop:");
		MenuItem mi=new MenuItem(m_name1);
		m.addMenuIem(mi);
		m_name1=sc.next();
		}
		
		
	}
	
	void display(Menu m)
	
		{	//Menu m=new Menu();
			m.displayItem();
		}
}
		

	
