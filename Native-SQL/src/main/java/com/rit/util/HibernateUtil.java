package com.rit.util;

import java.io.File;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static SessionFactory sessionFactory;

	static {
		Configuration cfg = null;
		try {
			cfg = new Configuration();
			
			File configFile=new File("hibernate.cfg.xml");
			System.out.println(configFile.exists());
			cfg.configure(configFile);
			
			
 			File mapFile = new File("employee.hbm.xml");
 			if (mapFile.exists()) {
 				System.out.println("map file exists");
 				System.out.println(mapFile.getAbsolutePath());
			}

 			cfg.addFile(mapFile);
 			
 			
			if (cfg != null) {
				sessionFactory = cfg.buildSessionFactory();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}// static

	public static void closeSessionFactory() {
		if (sessionFactory != null)
			sessionFactory.close();
	}

	public static Session getSession() {
		Session session = null;
		if (sessionFactory != null) {
			session = sessionFactory.openSession();
		}

		return session;
	}

	public static void closeSession(Session session) {
		if (session != null)
			session.close();
	}

}
