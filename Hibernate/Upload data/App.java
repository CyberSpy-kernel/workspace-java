// src\main\java\com\artist\DemoHib

package com.artist.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        System.out.println("Hello World!");

        Alien arts = new Artist();
        arts.setAid(102);
        arts.setAname("Artist");
        arts.setColor("LightPink");

        Configuration con = new Configuration().configure().addAnnotatedClass(Artist.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(arts);
        tx.commit();
        session.close();
        sf.close();
    }
}
