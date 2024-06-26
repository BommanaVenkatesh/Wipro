package com.venky.util;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DbUtil {
public static Session getSession() {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();
		return factory.openSession();
	}

}
