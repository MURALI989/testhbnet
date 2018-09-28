package hbdao;
import java.util.Iterator;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import pojo.passport;
import pojo.person;

//one to one operations
public class dao1 
{

	public void perinsert(passport p)
	{
        Session s=connectiondata.getconnection();
		Transaction t= s.beginTransaction();
	    s.save(p);
		t.commit();
	
		
	}

	public void perupdate(int p) 
	{
		Session s=connectiondata.getconnection();
		person per=(person) s.load(person.class,p);
		per.setPname("nani");
		per.getPsn().setPloc("hyd");
	    s.update(per);
	    Transaction t= s.beginTransaction();
		t.commit();
		s.close();
	
		
	}

	public void perdelete(int p) 
	{
		Session s=connectiondata.getconnection();
		person per=(person) s.load(person.class,p);
		per.setPname("nani");
		per.getPsn().setPloc("hyd");
	    s.delete(per);
	    Transaction t= s.beginTransaction();
		t.commit();
		s.close();
	
		
	}

	public void pergetAll() 
	{
		
		Session s=connectiondata.getconnection();
		
		  org.hibernate.Query q=s.createQuery("from person p");
		  Iterator<person> m=q.iterate();
		  while(m.hasNext())
		  {
			person per =(person)m.next();
		        System.out.println(per.getPid()+per.getPname()+per.getPage()+per.getPsn().getPloc());
		  }
		  s.close();

	}
	

}
