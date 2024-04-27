// src\main\java\com\artist\DemoHib\

package com.Artist.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        Artist arts = new Artist();

        Configuration con = new Configuration().configure().addAnnotatedClass(Artist.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        arts = (Artist) session.get(Artist.class, 101);
        
        session.save(arts);
        tx.commit();
        session.close();
        sf.close();
        
        System.out.println(arts);
    }
}
