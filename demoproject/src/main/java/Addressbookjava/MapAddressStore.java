package Addressbookjava;

import java.util.HashMap;

public class MapAddressStore implements AddressStore
{
	

	//Address addobj;
	public HashMap<String,Address> hobj= new HashMap<String,Address>();
	public String name;
	
	public int add(Address address)
	{
	hobj.put(address.name,address);
	return address.id;
	}

	public Address read(String name) 
	{
		
		return hobj.get(name);
		
		
	}
	public void update(String name,Address addrobj)
	{
		
		hobj.replace(name,addrobj);
	}
	
	
	public int remove(String name)
	{
		hobj.remove(name);
		return 0;
	}

	

	

}
