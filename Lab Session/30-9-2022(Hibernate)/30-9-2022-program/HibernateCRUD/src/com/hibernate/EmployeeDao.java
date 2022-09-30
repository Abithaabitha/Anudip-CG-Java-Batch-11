package com.hibernate;

import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;
import com.model.Employee;


public class EmployeeDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Configuration con = new Configuration();
		con.configure("resources/hibernate.cfg.xml");
		SessionFactory sf = con.buildSessionFactory();
		Session session=sf.openSession();
		
		/**inserting data**/
		Employee emp=new Employee();
		emp.setEmpid(10);
		emp.setName("raja");
		emp.setJoingDate(new Date());
		emp.setSalary(5000);
		emp.setDepartment("Development");
		
		session.save(emp);
		session.beginTransaction().commit();
		
		System.out.println("Done");
		
		/**reading data**/
		
		Object readObj=session.get(Employee.class,01);
		
		Employee read=(Employee) readObj;
		System.out.println(read.getEmpid()+","+read.getName()+","+read.getSalary()+","+read.getJoingDate());
		String query="select name from  Employee";
		Query sendq=session.createQuery(query);
		List list=sendq.list();
		System.out.println(list.size());
		list.stream().forEach((t)->System.out.println(t));
		
		/**Delete data from database***/
		Object D_id=session.get(Employee.class,3 );
		Employee d_employee=(Employee)D_id;
		session.delete(d_employee);
		System.out.println(d_employee);
		session.beginTransaction().commit();
		System.out.println(d_employee);
	
		System.out.println("Done");
	}

}
