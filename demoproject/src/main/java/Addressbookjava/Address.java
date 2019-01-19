package Addressbookjava;


import java.util.*;
public class Address
{
	public int id;
	    public String name;
	    public String street;
	    public String city;
	    public String country;
	    public int Zip;
	    
	    public void setId(int n)
	    {
	        id = n;
	    }

	    public int getId() 
	    {
	        return id;
	    }
	    
	    public void setName(String s)
	    {
	        name = s;
	    }

	    public String getName() 
	    {
	        return name;
	    }
	    public void setStreet(String st)
	    {
	        street = st;
	    }

	    public String getStreet() 
	    {
	        return street;
	    }
	    
	    public void setCity(String ct)
	    {
	        city = ct;
	    }

	    public String getCity() 
	    {
	        return city;
	    }
	    public void setCountry(String count)
	    {
	        country = count;
	    }

	    public String getCountry() 
	    {
	        return country;
	    }
	    public void setZip(int zip_code)
	    {
	        Zip = zip_code;
	    }
	 
	    public int getZip() 
	    {
	        return Zip;
	    }
	  
	

}
