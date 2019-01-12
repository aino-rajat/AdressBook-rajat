package main.java.com.main.java.com.AddressBook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Menu 
{
	
	int id;
	String name;
	
	public Menu(String  name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	ArrayList<MenuItem> al=new ArrayList<MenuItem>();
	public void addMenuIem(MenuItem mobj) 
	{
		
		//MenuItem mobj=new MenuItem();
		//mobj.setItemname(min_name);
		al.add(mobj);
		
	}
	
	public void displayItem()
	{ 
		int j=1;
		System.out.println("The menu name is :"+name);
		for(MenuItem i: al)
		{
			System.out.println( j++ +":"+i.Itemname);
		}
	}
	
	
	

}


		
