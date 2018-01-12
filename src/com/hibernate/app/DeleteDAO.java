package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteDAO {
public static void main(String[] args) {
	Configuration config = new Configuration();
	config.configure();
	config.addAnnotatedClass(SportDTO.class);
	
	SessionFactory sf = config.buildSessionFactory();
	Session sess = sf.openSession();
	
	SportDTO football = sess.load(SportDTO.class, "FootBall");
	sess.delete(football);
	
	Transaction tx = sess.beginTransaction();
	tx.commit();
	
}
}
