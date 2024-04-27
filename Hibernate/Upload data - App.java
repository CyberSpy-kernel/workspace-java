package com.telusko.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        System.out.println("Hello World!");

        Alien telusko = new Alien();
        telusko.setAid(102);
        telusko.setAname("Artist");
        telusko.setColor("LightPink");

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.save(telusko);
        tx.commit();
        session.close();
        sf.close();
    }
}
