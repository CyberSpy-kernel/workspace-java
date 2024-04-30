package com.artist.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

// first level cache

public class App {
	public static void main(String[] args) {
		
		Artist a = null;
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Laptop.class).addAnnotatedClass(Artist.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		a = (Artist) session.get(Artist.class,1);
		System.out.println(a.getAname());
		
		a = (Artist) session.get(Artist.class,2);
		System.out.println(a.getAname());
		
		session.getTransaction().commit();
		session.close();
	}
}
