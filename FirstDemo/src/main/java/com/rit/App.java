package com.rit;

import java.io.File;
import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.rit.vo.EmpVO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("START");

		String configFile = "hibernate.cfg.xml";
		String mappingFile = "hibernate-mappings.xml";

		File  file=new File(configFile);
		if(file.exists()) {
			System.out.println("conf file exists");
			System.out.println(file.getAbsolutePath());
		}
		
		
		File mapFile=new File(mappingFile);
		if(mapFile.exists()) {
			System.out.println("map file exists");
			System.out.println(mapFile.getAbsolutePath());
		}
		
		
		Configuration configuration = new Configuration();
		
		//configuration.configure(file);
		  configuration.addFile(mapFile);
		SessionFactory sessionFactory = configuration
				.configure(file)
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction txn = session.beginTransaction();
		txn.begin();

		EmpVO empVO = new EmpVO("Radhe", "Choudhary", 20000);
		Serializable save = session.save(empVO);
		txn.commit();

		System.out.println("END");

	}
}
