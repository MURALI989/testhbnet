package hbdao;

import java.util.Iterator;

import org.hibernate.Session;
import org.hibernate.Transaction;
import hbdao.connectiondata1;

import pojo.addressd;




public class daonew {

	public void insert(addressd p)
	{
        Session s=connectiondata1.getconnection();
		Transaction t= s.beginTransaction();
	    s.save(p);
		t.commit();
	}

	public void delete(int i) {
		Session s=connectiondata1.getconnection();
		addressd ad= (addressd) s.get(addressd.class,i);
		s.delete(ad);
		Transaction t=s.beginTransaction();	
		t.commit();
	}

	public void update(int i) {
		Session s=connectiondata1.getconnection();
		addressd ad=(addressd) s.get(addressd.class,i);
		ad.setAmailid("raja@132");
		s.update(ad);
		Transaction t=s.beginTransaction();
		t.commit();
		
	}
	public void getall()
	{
		Session s=connectiondata1.getconnection();
		org.hibernate.Query q=s.createQuery("from addressd a");
		Iterator<addressd> m=q.iterate();
		while(m.hasNext())
		{
			addressd per=(addressd) m.next();
			System.out.println(per.getAid() +"\t"+per.getAloc() +"\t"+per.getAmailid()+"\t"+per.getApincode());
		}
		s.close();
	}
}





