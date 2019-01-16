package Addressbookjava;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;  
public class MySqlAddressStore
{  
	 Connection con=null;
	 Statement stmt=null;
	 public MySqlAddressStore() 
	 {
		
	 try	
	{  
		Class.forName("com.mysql.jdbc.Driver");  
		con=DriverManager.getConnection(  
				"jdbc:mysql://localhost:3306/address_book","root","root");  
 
			//System.out.println("Connected to DB!");
			
	}	
	catch(Exception e)	
		{ 	
		System.out.println(e);
		}  
	 
	 
	 }
	 
	 public int add(Address address)
	 {
		 
		 try
		 {
			 stmt = con.createStatement(); 
			 String sql = "INSERT INTO Addition " +
	                  " VALUES ('"+address.getId()+"','"+address.getName()+"','"+address.getStreet()+"','"+address.getCity()+"','"+address.getCountry()+"','"+address.getZip()+"')";
	      stmt.executeUpdate(sql);
	      System.out.println("Inserted records into the table...");
		 }
		 catch(SQLException se)
		 {
		      
		      se.printStackTrace();
		 }
		 return address.id;
	 
	 }
	 public Address read(String name)
	 {
		 Address addr=new Address();
		 try
		 {	
			
			 stmt = con.createStatement();

		      String sql = "SELECT * FROM Addition where name='"+name+"'";
		      ResultSet rs = stmt.executeQuery(sql);
		      while(rs.next())
		      {
		          //Retrieve by column name
		          addr.id = rs.getInt("id");
		          addr.name = rs.getString("name");
		          addr.street = rs.getString("street");
		          addr.city = rs.getString("city");
		          addr.country=rs.getString("country");
		          addr.Zip=rs.getInt("Zip");
		      }
		      rs.close();
		 }
		 catch (SQLException se)
		 {
			se.printStackTrace();
			
		}
		 return addr;
	 }
	 
	 public int update(String name,Address addrobj)
	 {
		
		 try
		 {
			 stmt = con.createStatement(); 
			 String sql = "UPDATE Addition SET  country='"+addrobj.getCountry()+"' , street='"+addrobj.getStreet()+"' , city='"+addrobj.getCity()+"' , zip='"+addrobj.getZip()+"' where name='"+name+"'  ";
	         stmt.executeUpdate(sql);
	      System.out.println("Updated records into the table...");
		 }
		 catch(SQLException se)
		 {
		      
		      se.printStackTrace();
		 }
		 return addrobj.id;
	 }
	 public int delete(String name)
	 {	
		 int id=0;
		 try
		 {
			 stmt = con.createStatement(); 
			 id=stmt.executeUpdate("Delete from Addition where name='"+ name +"' ");
	      System.out.println("Deleted records into the table...");
		 }
		 catch(SQLException se)
		 {
		      
		      se.printStackTrace();
		 }
	
	 return id;
	
	 }
}