package hbdao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class connectiondata1
{
public static Session getconnection() {
		
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("hibernate.cfg1.xml");
		SessionFactory ses= cfg.buildSessionFactory();
		Session s=ses.openSession();
		return s;
		
}
}
