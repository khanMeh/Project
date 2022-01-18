package com.pack;

import org.hibernate.HibernateException;
 
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.*;


public class Main {

	public static void main(String[] args) {

		  Session session=null;
		  Transaction transaction = null;
			 
	try {
		  SessionFactory factory=HibernateUtil.getSessionFactory();
		    session=factory.openSession(); ;
	 
	          
			transaction = session.beginTransaction();
			
			Address address1=new Address();
			address1.setStreet("OTR Road");
			address1.setCity("Chennai");
			address1.setState("Tamil Nadu");
			address1.setZipcode("60087");
			
			Set<Student> hs=new HashSet<Student>();
			
			Student student1=new Student();
			Student student2=new Student();
			
		    student1.setStudentName("priya");
		    student2.setStudentName("Arthy");
		    
		    student1.setStudentAddress(address1);
		    student2.setStudentAddress(address1);
		    
		    hs.add(student1);
			hs.add(student2);
		
			address1.setPeople(hs);
		 
			session.save(student1);
		 	session.save(student2);
		  	   
		 	transaction.commit();
	 	
		  System.out.println("Object Student1's city");
			
			System.out.println(student1.getStudentAddress().getCity());
			
			System.out.println("students who belong to address1");
			
			Set<Student> s1=address1.getPeople();
			
				
			
			for(Iterator itr=s1.iterator();itr.hasNext();)
			{
				Student s=(Student)itr.next();
				System.out.println(s.getStudentName());
			}
			
			String HQL="select a.studentName,b.city from Student a,Address b where a.studentAddress=b.addressId and a.studentAddress=1";
			
			
		 
			  
		     Query<Object[]>  query= session.createQuery(HQL);
		     
		    List<Object[]>  list= query.getResultList();
		    
		    /*Iterator<?> itr=list.iterator();
		    
		    while (itr.hasNext())
		    {
		    	
		    	Object[] obj= (Object[]) itr.next();
		    	System.out.println(obj[0]+" "+obj[1]);
		    }*/
		   
		 for (Object[] obj:list)
		 {
			System.out.println(obj[0]+"  "+obj[1]); 
		 }
				
			} catch (HibernateException e) {
				 
				e.printStackTrace();
			}finally
		{
				session.close();
			}
			 
			
			
			
			
			
			
			
		
			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		 	/* address1=(Address)session.get(Address.class,167L);	 
			 
			System.out.println("Students who belong to address1 object");
			
			Set<Student> s1=address1.getPeople();
			
				for (Iterator itr=s1.iterator();itr.hasNext();)
				{
	 		         Student S=(Student)itr.next();
			         System.out.println(S.getStudentName());
				}
		
				
				
				String sql_query="select a.studentName,b.city from Student a," +
						"Address b where  a.studentAddress=b.addressId  and" +
						" a.studentAddress=167";
		   		 
			    Query q=session.createQuery(sql_query);
			   
			    for(Iterator it=q.iterate();it.hasNext();){
			    	
			    	 
				       Object[] row = (Object[]) it.next();
				       System.out.println("Name: " + row[0]);
				       System.out.println("City: " + row[1]);
				     
				     }*/
				  	 
			    
		/*} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}*/

	}

}
