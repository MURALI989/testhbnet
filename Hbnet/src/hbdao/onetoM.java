package hbdao;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import pojo.mobile;
import pojo.passport;
import pojo.person;


public class onetoM 
{


		public void persinsert(person z) 
		{
			 Session s=connectiondata.getconnection();
				Transaction t= s.beginTransaction();
			    s.save(z);
				t.commit();
				
			
		}

		public void persupdate(int p)
		{
			Session s=connectiondata.getconnection();
			person pers=(person) s.load(person.class,p);
			pers.setPname("nani");

			List<mobile> k=pers.getMob();
			Iterator<mobile> ab=k.iterator();
			while(ab.hasNext())
			{
				mobile m=ab.next();
				System.out.println(m.getMid()+m.getMnum()+m.getMsp());
				
			}
		    s.update(pers);
		    Transaction t= s.beginTransaction();
			t.commit();
			s.close();
		
			
		}

		
			public void persdelete(int p)
			{
				Session s=connectiondata.getconnection();
				person pers=(person) s.load(person.class,p);
				pers.setPname("nani");

				List<mobile> k=pers.getMob();
				Iterator<mobile> ab=k.iterator();
				while(ab.hasNext())
				{
					mobile m=ab.next();
					System.out.println(m.getMid()+m.getMnum()+m.getMsp());
					
				}
			    s.delete(pers);
			    Transaction t= s.beginTransaction();
				t.commit();
				s.close();

			
		}

			public void persgetall()
			{
				Session s=connectiondata.getconnection();
				
				  org.hibernate.Query q=s.createQuery("from person p");
				  Iterator<person> m=q.iterate();
				  while(m.hasNext())
				  {
					person per =(person)m.next();
					System.out.println(per.getPid()+per.getPname()+per.getPage());
					
					List<mobile> k=per.getMob();
					Iterator<mobile> ab=k.iterator();
					while(ab.hasNext())
					{
						mobile ms=ab.next();
						System.out.println(ms.getMid()+ms.getMnum()+ms.getMsp());
					}
			
     
				  }
				  s.close();

				
			}

}