/**
 * 
 */
package com.hiber.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hiber.vo.UserDetails;
import com.hiber.vo.Vehicle;

/**
 * @author Amit Jha
 *
 */
public class OneToOneTest {
	public static void main(String[] args) {
		UserDetails user=new UserDetails();
		user.setUserName("First User");
		Vehicle vehicle=new Vehicle();
		vehicle.setName("My Car");
		user.setVehicle(vehicle);
		
		SessionFactory sessionfac=new Configuration().configure().buildSessionFactory();
		Session session=sessionfac.openSession();
		session.beginTransaction();
		session.save(user);
		session.save(vehicle);
		session.getTransaction().commit();
		session.close();
		
}}
