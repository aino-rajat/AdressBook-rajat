package main.java.com.main.java.com.AddressBook;

import java.util.Scanner;

public class MenuItem 
{
	public int id;
	public String Itemname;
	
	
	
	public MenuItem(String Itemname)
	{
		this.Itemname=Itemname;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getItemname()
	{
		return Itemname;
	}
	public void setItemname(String menuname) 
	{
		Itemname = menuname;
	}
	
	
		
}	
	
