package Addressbookjava;

import java.util.Scanner;

public class AddressCrud
{
	AddressStore store=new MapAddressStore();
	MySqlAddressStore MySqlAddressStoreObj=new MySqlAddressStore();
Address ad=new Address();
Scanner sc=new Scanner(System.in);
public Address Create()
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
	AddressCrud addrCrudobj=new AddressCrud();
	System.out.println("Enter country");
	ad.setCountry(sc.next());
	
	System.out.println("Enter zip");
	ad.setZip(sc.nextInt());
	store.add(ad);
	MySqlAddressStoreObj.add(ad);
	System.out.println("Adrees created!");
	//return ad.id;
	return ad;
	}

public void Read(String name,Address addr1)
{
   Address obj=store.read(name);
   Address obj1= MySqlAddressStoreObj.read(name);
	System.out.println("Id is:" +obj.getId());
	System.out.println("Name is:" +obj.getName());
	System.out.println("Street is:" +obj.getStreet());
	System.out.println("City is:" +obj.getCity());
	System.out.println("Country is:" +obj.getCountry());
	System.out.println("Zip is:" +obj.getZip());
	//////////////////////////
	
	System.out.println("==============Displaying Data from Database==================");
	
	System.out.println("Id is:" +obj1.getId());
	System.out.println("Name is:" +obj1.getName());
	System.out.println("Street is:" +obj1.getStreet());
	System.out.println("City is:" +obj1.getCity());
	System.out.println("Country is:" +obj1.getCountry());
	System.out.println("Zip is:" +obj1.getZip());
	
	
	
}

	public void Update(String name,Address addrobj)
	{
		
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
		store.update(name,addrobj);
		MySqlAddressStoreObj.update(name,addrobj);
		System.out.println("Address Updated!");
		
		
	}
public void Delete(String name)
	{
	store.remove(name);
	MySqlAddressStoreObj.delete(name);
	System.out.println("Name removed!");
	}

}