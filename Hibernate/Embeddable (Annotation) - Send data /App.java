// src\main\java\com\artist\DemoHib\

package com.artist.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {

        ArtistName an = new ArtistName();
        an.setFname("Digambar");
        an.setMname("Chandrakant");
        an.setLname("Kumbhar");
        
        Artist arts = new Artist();
        arts.setAid(101);
        arts.setColor("Green");
        arts.setAname(an);

        Configuration con = new Configuration().configure().addAnnotatedClass(Artist.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

//        arts = (Artist) session.get(Artist.class, 101);
        
        session.save(arts);
        tx.commit();
        session.close();
        sf.close();
        
        System.out.println(arts);
    }
}
