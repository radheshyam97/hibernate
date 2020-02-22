package com.rit.util;

import java.io.File;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateUtil {
	private static ThreadLocal<Session> local = new ThreadLocal<Session>();
	private static SessionFactory sessionFactory;
	static {
		String configFile = "hibernate.cfg.xml";
		///String mappingFile = "hibernate-mappings.xml";

		File file = new File(configFile);
		if (file.exists()) {
			System.out.println("conf file exists");
			System.out.println(file.getAbsolutePath());
		}

//		File mapFile = new File(mappingFile);
//		if (mapFile.exists()) {
//			System.out.println("map file exists");
//			System.out.println(mapFile.getAbsolutePath());
//		}

		Configuration configuration = new Configuration();

		// configuration.configure(file);
		//configuration.addFile(mapFile);
		sessionFactory = configuration.configure(file).buildSessionFactory();

	}

	public static Session getSession() {

		Session session = local.get();
		if (session == null) {

			session = sessionFactory.openSession();
			local.set(session);
		}
		return session;
	}

	public static void closeSession() {
		Session session = local.get();
		if (session != null) {
			session.close();
			local.remove();
		}
	}

	public static void close() {
		sessionFactory.close();
	}

}
