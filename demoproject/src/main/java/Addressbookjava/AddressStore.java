/**
 * 
 */
package Addressbookjava;

/**
 * @author intern3
 *
 */
public interface AddressStore 
{
public int add(Address address);
public Address read(String name);
public void update(String name,Address addrobj);
public int remove(String name);


}
