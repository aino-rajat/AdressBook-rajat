package main.java.com.main.java.com.AddressBook;

import java.util.HashMap;
import java.util.Scanner;

public class AddressCrud
{
HashMap<String,Address> hobj= new HashMap<String,Address>();

Address ad=new Address();
Scanner sc=new Scanner(System.in);
public void Create()
	{
	
	System.out.println("Enter the id for Menu:");
	ad.setId(sc.nextInt());
	
	System.out.println("Enter the name");
	String name=sc.next();
			ad.setName(name);
	
	System.out.println("Enter Street");
	ad.setStreet(sc.next());
	
	System.out.println("Enter City");
	ad.setCity(sc.next());
	
	System.out.println("Enter country");
	ad.setCountry(sc.next());
	
	System.out.println("Enter zip");
	ad.setZip(sc.nextInt());
	hobj.put(name,ad);
	System.out.println("Adrees created!");
	}

public void Read(String name,Address addr1)
{
   hobj.get(name);
	System.out.println("Id is:" +ad.getId());
	System.out.println("Name is:" +ad.getName());
	System.out.println("Street is:" +ad.getStreet());
	System.out.println("City is:" +ad.getCity());
	System.out.println("Country is:" +ad.getCountry());
	System.out.println("Zip is:" +ad.getZip());
	
//	return name;
}

	public void Update(String name)
	{
		Address addrobj=hobj.get(name);
		
		System.out.println("Enter the id for Menu:");
		addrobj.setId(sc.nextInt());
		
		System.out.println("Enter the name");
		String upname=sc.next();
				addrobj.setName(upname);
		
		System.out.println("Enter Street");
		addrobj.setStreet(sc.next());
		
		System.out.println("Enter City");
		addrobj.setCity(sc.next());
		
		System.out.println("Enter country");
		addrobj.setCountry(sc.next());
		
		System.out.println("Enter zip");
		addrobj.setZip(sc.nextInt());
		
		hobj.replace(name,addrobj);
		System.out.println("Address Updated!");
	}
public void Delete(String name)
	{
	hobj.remove(name);
	System.out.println("Name removed!");
	}

}