package com.artist.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        
        Laptop laptop = new Laptop();
        laptop.setLid(101);
        laptop.setLname("Dell");
        
        Student s = new Student();
        s.setName("Artist");
        s.setRollno(1);
        s.setMarks(50);
        s.setLaptop(laptop);
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);// Create Hibernate configuration
        SessionFactory sf = con.buildSessionFactory();// Create Hibernate configuration
        Session session = sf.openSession();// Open session
        Transaction tx = null;// Begin transaction
        try {
            tx = session.beginTransaction();
            session.save(laptop);// Save the student and laptop entities
            session.save(s);
           
            tx.commit(); // Commit transaction
        } catch (Exception e) {
            if (tx != null) {// Rollback transaction if an exception occurs
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {// Close session and session factory
                session.close();
            }
            sf.close();
        }
    }
}
