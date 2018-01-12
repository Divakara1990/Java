package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateDAO {

	public static void main(String[] args) {
		//configuraton process
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SportDTO.class);
		
		//SessionFactory using configuration object
		SessionFactory sf = config.buildSessionFactory();
		
		//Open Session using Session Factory
		Session sess = sf.openSession();
		
		//Load the record before u update
		SportDTO football = sess.load(SportDTO.class, "FootBall");
		//set the new values
		football.setNoOfPlayers(20);
		football.setDuration(100);
		
		//update to the table
		sess.update(football);
		
		//commit the changes
		Transaction tx = sess.beginTransaction();
		tx.commit();
	}
}
