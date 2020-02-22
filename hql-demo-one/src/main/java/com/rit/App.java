package com.rit;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.rit.domain.Emp;
import com.rit.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Session session = HibernateUtil.getSession();
        Query query = session.createQuery("from Emp");
        List<Emp> list = query.list();
       Iterator<Emp> iterateor = query.iterate();

        System.out.println(list);
        
    }
}
