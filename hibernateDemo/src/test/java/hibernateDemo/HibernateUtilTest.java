package hibernateDemo;

import static org.junit.Assert.*;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.mapping.List;
import org.junit.After;
import org.junit.Test;

import util.HibernateUtil;

public class HibernateUtilTest 
{
	@Test
	public void getSessionTest() 
	{
		Session session= HibernateUtil.getSessionFactory().openSession();
		assertNotNull(session);
	}
	
	@Test
	public void createTest()
	{
		EmpDao empDaoObj=new EmpDao();
		Employee emp=new Employee();
		emp.setId(1);
		emp.setFirstName("Rajat");
		emp.setLastName("Jaee");
		emp.setMiddlename("Suresh");
		int id=(Integer) empDaoObj.create(emp);
		assertTrue(emp.getId()== id);

		// clean database
		cleanDatabase(id);
	}

	public void cleanDatabase(int id) {
		EmpDao empDaoObj=new EmpDao();
		// clean database
		empDaoObj.delete(id);
	}
	@Test
	public void displayTest()
	{
		EmpDao empDaoObj=new EmpDao();
		Employee emp=new Employee();
		emp.setId(5);
		emp.setFirstName("piyush");
		emp.setLastName("Kamble");
		emp.setMiddlename("Ashok");
		int id=(Integer)empDaoObj.create(emp);
		
		Employee emp1=empDaoObj.displayRecord(id);
		assertTrue(emp1.getId() == emp.getId());
		assertTrue(emp1.getFirstName().equals(emp.getFirstName()));
		assertTrue(emp1.getLastName().equals(emp.getLastName()));
		assertTrue(emp1.getMiddlename().equals(emp.getMiddlename()));

		// clean database
		cleanDatabase(id);
	}

	@Test
	public void UpdateTest()
	{
		EmpDao empDaoObj=new EmpDao();
		Employee emp=new Employee();
		emp.setId(45);
		emp.setFirstName("rajat");
		emp.setLastName("pqr");
		emp.setMiddlename("abdhd");
		int id=(Integer) empDaoObj.create(emp);

		emp.setFirstName("abc");
		emp.setLastName("pqr");
		emp.setMiddlename("xyz");
		Employee emp1=empDaoObj.update(emp,id);
		assertTrue(emp1.getFirstName().equals(emp.getFirstName()));
		assertTrue(emp1.getLastName().equals(emp.getLastName()));
		assertTrue(emp1.getMiddlename().equals(emp.getMiddlename()));

		// clean database
		cleanDatabase(id);
	}
	@Test
	public void deleteTest()
	{
		EmpDao empDaoObj=new EmpDao();
		Employee emp=new Employee();
		emp.setId(45);
		emp.setFirstName("rajat");
		emp.setLastName("pqr");
		emp.setMiddlename("abdhd");
		int id=(Integer) empDaoObj.create(emp);
		empDaoObj.delete(id);
		Employee deleObj = empDaoObj.displayRecord(id);
		assertTrue(deleObj == null);
		// clean database
		cleanDatabase(id);
	}


}
