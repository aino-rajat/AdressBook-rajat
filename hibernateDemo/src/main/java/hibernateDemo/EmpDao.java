package hibernateDemo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import org.hibernate.mapping.List;
import org.hibernate.query.Query;

import util.HibernateUtil;

public class EmpDao
{

	public static Session getSession()
	{
		return HibernateUtil.getSessionFactory().openSession();

	}
	public Serializable  create(Employee empobj)
	{
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		Integer id = null;
		try {

			id=(Integer) session.save(empobj);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {


			session.close();
		}
		return id;

	}
	public Employee displayRecord(int id)
	{
		Employee employeeObject=null;
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try {
			Query query = session.createQuery("from Employee where id= :id");
			query.setParameter("id", id);
			Object object = (Object)query.uniqueResult();
			employeeObject= (Employee)object;

			transaction.commit();
			return employeeObject;
		} catch(Exception sqlException){
		}   
		finally {
			session.close();
		}
		return employeeObject;
	}


	public Employee update(Employee empobj,int id)
	{
		Employee employeeObject;
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		try 
		{
			Query query = session.createQuery("update Employee e set e.firstname = :firstname , e.lastname=:lastname, e.middlename=:middlename " + " where e.id = :id");
			query.setParameter("firstname",empobj.getFirstName());
			query.setParameter("lastname",empobj.getLastName());
			query.setParameter("middlename",empobj.getMiddlename());
			query.setParameter("id",id);


			Object object = (Object)query.uniqueResult();
			employeeObject= (Employee)object;
			transaction.commit();

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		return empobj;
	}

	public int delete(int id)
	{
		Session session=getSession();
		Transaction transaction=session.beginTransaction();
		int status=0;
		try {
			Query query=session.createQuery("delete Employee where id=:id");  
			query.setParameter("id",id);

			status=query.executeUpdate(); 

		} catch (Exception e) {
			// TODO: handle exception
		}
		finally {
			session.close();
		}
		return status;
	}

}
