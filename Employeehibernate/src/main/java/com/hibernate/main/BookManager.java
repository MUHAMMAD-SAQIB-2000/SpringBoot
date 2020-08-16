package com.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class BookManager {
    protected SessionFactory sessionFactory;
 
    protected void setup() {
        // code to load Hibernate Session factory
    	final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
    	        .configure() // configures settings from hibernate.cfg.xml
    	        .build();
    	try {
    	    sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
    	} catch (Exception ex) {
    	    StandardServiceRegistryBuilder.destroy(registry);
    	}
    	Session session = sessionFactory.openSession();
    	session.beginTransaction();
    	session.getTransaction().commit();
    	session.close();
    	sessionFactory.close();
    }
 
    protected void exit() {
        // code to close Hibernate Session factory
    	sessionFactory.close();
    }
 
    protected void create() {
        // code to save a book
    }
 
    protected void read() {
        // code to get a book
    	Session session = sessionFactory.openSession();
    	 
        long bookId = 20;
        Book book = session.get(Book.class, bookId);
     
        System.out.println("Title: " + book.getTITLE());
        System.out.println("Author: " + book.getAUTHOR());
        System.out.println("Price: " + book.getPRICE());
     
        session.close();
    }
 
    protected void update() {
        // code to modify a book
    }
 
    protected void delete() {
        // code to remove a book
    }
 
    public static void main(String[] args) {
        // code to run the program
    }
}