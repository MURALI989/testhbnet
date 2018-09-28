package hbdao;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import pojo.courses;
import pojo.mobile;
import pojo.person;

public class manytoM {
	public void percinsert(person z)
	{
        Session s=connectiondata.getconnection();
		Transaction t= s.beginTransaction();
	    s.save(z);
		t.commit();
		
	}
	public void percupdate(int p) 
	{
	
		{
			   Session s =	connectiondata.getconnection();
			   person per = (person) s.get(person.class, p);
			   System.out.println(per.getPname());
			   List<courses> n = per.getCer();
			   Iterator<courses> k = n.iterator();
			      while(k.hasNext())
			      {
			    	courses b =   k.next();
			    	if(b.getCname().equals("k data") )
			    	{
			    	b.setCname("hibernate");
			    	}
			      }

			   s.update(per); 
			   Transaction t =  s.beginTransaction();
			   t.commit();
			   s.close();	
			}

	}
		public void percdelete(int p) 
		{
			Session s =	connectiondata.getconnection();
			person per  = (person) s.load(person.class, p);
		    s.delete(per);
		    Transaction t =  s.beginTransaction();
		    t.commit();
		    s.close();
			
		}
		public void percgetall() 
		{
			Session s =	connectiondata.getconnection();
		    Query b=    s.createQuery("from person p");
		    Iterator<person> m =  b.iterate();
		   
		    while(m.hasNext())
		    {
			person  n =   m.next();
			
			System.out.println(n.getPname()+"==="+n.getPage());
			
			System.out.println("////////////////course info////////////////////");
			    
			  List<courses> g = n.getCer();
			  
			  Iterator<courses> k = g.iterator();
			  while(k.hasNext())
			  {
				  
				  
				  courses  x  =k.next();
				 System.out.println(x.getCname());
			  }
		
			  
		    }
		}
			
		}
		
	