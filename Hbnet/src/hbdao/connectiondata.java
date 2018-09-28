package hbdao;
import java.util.Iterator;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import pojo.person;

public class connectiondata 
{
public static Session getconnection() {
		
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure();
		SessionFactory ses= cfg.buildSessionFactory();
		Session s=ses.openSession();
		return s;
		
}
}
