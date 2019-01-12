package main.java.com.main.java.com.AddressBook;

import java.util.Scanner;

public class AddressBookConsoleManager 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		MenuCrudConsoleUtil obj=new MenuCrudConsoleUtil();
	
		Menu menu;
		AddressCrud addressCrudobj=new AddressCrud();
		Address addobj;
		 addobj=null;
		menu=obj.CreateMenu();
		obj.addMenuItem(menu);
		
		//obj.display(menu);
		
		while(true)
		{
			obj.display(menu);
		/*System.out.println("======Welcome to Address Book========= ");
		System.out.println("1: Create Address Book");
		System.out.println("2: Read Address Book ");
		System.out.println("3: Delete Address Book");
		System.out.println("4: Update Address Book");
		System.out.println("5: For Exit");
		System.out.println("Enter your choice:");*/
		int no=sc.nextInt();
		
		switch(no)
			{
		case 1:
			addressCrudobj.Create();
			//obj.addMenuItem(menu);
			//obj.display(menu);
			break;
		case 2:
			
			System.out.println("Enter the name");
			String name=sc.next();
			addressCrudobj.Read(name,addobj);
				break;
			/*AddressCrud addresscrudobj=new AddressCrud();
			//String name=addresscrudobj.Read(mname);
			System.out.println(name);*/
			
		case 3:
			System.out.println("Which entry name u want to Update?");
			String rname=sc.next();
			addressCrudobj.Update(rname);
			obj.display(menu);
			break;
		case 4:
			System.out.println("Enter the name to be Delete!");
			String upname=sc.next();
			addressCrudobj.Delete(upname);
			break;
		case 5:
			System.exit(0);
			}
		}
		
	}

}
