package com.hibernate.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class LoadSportsDAO {

	public static void main(String[] args) {
		//configuraton process
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(SportDTO.class);
		
		//SessionFactory using configuration object
		SessionFactory sf = config.buildSessionFactory();
		
		//Open Session using Session Factory
		Session sess = sf.openSession();
		
		//Load the record 
		SportDTO footbal = sess.load(SportDTO.class, "FootBall");
		//display the contents of the object
		System.out.println(footbal);
		System.out.println(footbal.getSportName());
		System.out.println(footbal.getSportType());
		System.out.println(footbal.getNoOfPlayers());
		System.out.println(footbal.getDuration());
	}
}
