/**
 * 
 */
package com.hiber.impl;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.envers.reader.FirstLevelCache;

import com.hiber.vo.Address;
import com.hiber.vo.UserDetail;

/**
 * @author Amit Jha
 *
 */
public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDetail user=new UserDetail();
		user.setUserName("First User");
		Address fistadd=new Address();
		fistadd.setCity("Ranchi");
		fistadd.setPincode("835217");
		fistadd.setStreet("ABC");
		
		Address secadd=new Address();
		secadd.setCity("Ranchi");
		secadd.setPincode("835217");
		secadd.setStreet("ABC");
		
		user.getListofAddr().add(fistadd);
		user.getListofAddr().add(secadd);
		
		SessionFactory sessionfac=new Configuration().configure().buildSessionFactory();
		Session session=sessionfac.openSession();
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
		session.close();
		
		session=sessionfac.openSession();
		session.beginTransaction();
		user=(UserDetail)session.get(UserDetail.class, 1);
		session.close();
		System.out.println("Retriving the user "+ user.getListofAddr().size());
		//We want size of list even though the session hs been closed 
		//by default it is Lazy so it will give us the exception
		//We will go for Eger initialization
		

	}

}
