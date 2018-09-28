package hbdao;

import java.util.Iterator;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import pojo.person;

public class Dao 
{
	public void insert(person p)
	{
		Session s=connectiondata.getconnection();
		
		//Configuration cfg=new AnnotationConfiguration();
		//cfg.configure();
		//SessionFactory ses= cfg.buildSessionFactory();
		//Session s=ses.openSession();
		Transaction t= s.beginTransaction();
		 s.save(p);
		t.commit();
		

		
	}


	
public void update(int p) {
	
	
	Session s=connectiondata.getconnection();
	//Configuration cfg=new AnnotationConfiguration();
	//cfg.configure();
	//SessionFactory ses= cfg.buildSessionFactory();
	//Session s=ses.openSession();
	person per =(person) s.get(person.class, p);
	per.setPname("sony");
	s.update(per);
	Transaction t=s.beginTransaction();
	t.commit();
	//s.close();
	
	
}
public void delete(int p) {
	Session s=connectiondata.getconnection();
	//Configuration cfg=new AnnotationConfiguration();
	//cfg.configure();
	//SessionFactory ses= cfg.buildSessionFactory();
	//Session s=ses.openSession();
	person per =(person) s.get(person.class, p);
	s.delete(per);
	Transaction t=s.beginTransaction();
	t.commit();
	s.close();
	
	
}
public void getAll() 
{
	Session s=connectiondata.getconnection();
	// Configuration cfg = new AnnotationConfiguration().configure();
	//  SessionFactory ses = cfg.buildSessionFactory();
	 // Session s=ses.openSession();
	  org.hibernate.Query q=s.createQuery("from person p");
	  Iterator<person> m=q.iterate();
	  while(m.hasNext())
	  {
		person per =(person)m.next();
	        System.out.println(per.getPid()+per.getPname()+per.getPage());
	  }
	  s.close();

	
}

}
