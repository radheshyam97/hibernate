package com.rit;

import java.util.List;

import org.hibernate.SQLQuery;
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
    	System.out.println( "START" );
    	
    	Session session = HibernateUtil.getSession();
    	

    	
    	//Get all the employee details
    	String query="select * from emp";
    	SQLQuery empDtlsQuery = session.createSQLQuery(query);
    	empDtlsQuery.addEntity(Emp.class);
    	List<Emp> empList = empDtlsQuery.list();
    	empList.forEach(row->{
    		System.out.println(row);
    	});
    	
    	
    	
    	
    	System.out.println( "END" );
        
        
        
        
    }
}
