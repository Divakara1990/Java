package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SportDAO {

	public static void main(String[] args) {
		
		//create the object of DTO class and populate the values
		
		SportDTO sports = new SportDTO();
		sports.setSportName("FootBall");
		sports.setSportType("Outdoor");
		sports.setNoOfPlayers(15);
		sports.setDuration(90);
		
		/*components of Hibernate
		 
			1. Configuration(it is used to load the resources<cfg.xml & mapping file> and to obtain the SessionFactory object.
		*/
		Configuration config = new Configuration();
		//to load the configuration file.
		config.configure();//it searches for the hibernate.cfg.xml file under src
		
		//to load the mapping class
		config.addAnnotatedClass(SportDTO.class);
		
		/* 2. SessionFactory
		 
		 */
		//to obtain SessionFactory Object
		SessionFactory sf = config.buildSessionFactory();
		//to create session using the sessionfactory
	    Session sess = sf.openSession();
	    
	    sess.save(sports);
	    
	    Transaction tx = sess.beginTransaction();
	    tx.commit();
	    
	    	
	}
}
