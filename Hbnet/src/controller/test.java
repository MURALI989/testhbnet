package controller;

import hbdao.Dao;
import hbdao.dao1;
import hbdao.manytoM;
import hbdao.onetoM;
import pojo.courses;
import pojo.mobile;
import pojo.passport;
import pojo.person;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;




public class test {
	
	public static void main1(String[] args) 
	{
		person p=new person();
		p.setPid(8);
		p.setPname("aarya");
		p.setPage(26);
		
		
		Dao h=new Dao();
		h.insert(p);
		h.update(4);
		h.delete(6);
		h.getAll();
	}
	public static void main2(String[] args) 
	{
		person p=new person();
		
		p.setPname("murali");
		p.setPage(26);
		
		
		passport k=new passport();
		
		k.setPid(3456);
		k.setPisd(2030);
		k.setPexd(2040);
		k.setPloc("hyd");
		k.setPer(p);
		
		p.setPsn(k);
//one to one.....		
		dao1 h=new dao1(); 
		//h.perinsert(k);
		//h.perupdate(13);
		//h.perdelete(13);
			h.pergetAll();
	} 

	public static void main3(String[] args)
	{
        person p=new person();
		
		p.setPname("murali");
		p.setPage(26);
		
		
		mobile m=new mobile();
		
		m.setMnum(9390939);
		m.setMsp("airtel");
      m.setPers(p);
		
		mobile m1=new mobile();
		
		m1.setMnum(8390939);
		m1.setMsp("jio");
		m1.setPers(p);
	
		
		mobile m2=new mobile();  
		
		m2.setMnum(7390939);
		m2.setMsp("voda");
		m2.setPers(p);
		List z= new ArrayList<mobile>();
		z.add(m);
		z.add(m1);
		z.add(m2);
		
		p.setMob(z);
		
		onetoM s=new onetoM();
		//s.persinsert(p);
		//s.persupdate(9);
		//s.persdelete(9);
		s.persgetall();
		
			
	}
	public static void main(String[] args) 
	{
		
			//one person attending multiple courses..
			
			  person p = new person();
			  p.setPname(" teja ");
			  p.setPage(24);
			  
			  
			  
			  courses c = new courses();
			  c.setCname("k data");
			  c.setCdur(60);
			  
			  
			  
			  courses c1 = new courses();
			  c1.setCname("a data");
			  c1.setCdur(45);
			  
			  
			  courses c2 = new courses();
			  c2.setCname("b data");
			  c2.setCdur(50);
			  
			  
			  
			  List<courses> h1 = new ArrayList();
			  h1.add(c);
			  h1.add(c1);
			  h1.add(c2);
			  p.setCer(h1);
			  
			 
			  
			  manytoM y=new manytoM();
			// y.percinsert(p);
			// y.percupdate(14);
			// y.percdelete(14);
			 y.percgetall();
			  

		
	}
	
}
