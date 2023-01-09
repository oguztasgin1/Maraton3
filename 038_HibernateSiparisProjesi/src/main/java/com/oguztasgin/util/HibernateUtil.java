package com.oguztasgin.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.entity.Siparis;
import com.oguztasgin.entity.SiparisKalemi;
import com.oguztasgin.entity.Urun;


public class HibernateUtil {
	//Configuration configuration = new Configuration().addResource("hibernate.cfg.xml");
	// SONRA BURAYI DENE.
	
	private static final SessionFactory SESSION_FACTORY = sessionFactoryHibernate();

	private static SessionFactory sessionFactoryHibernate() {
		try {
			Configuration configuration = new Configuration();
			configuration.addAnnotatedClass(Musteri.class);
			configuration.addAnnotatedClass(Urun.class);
			configuration.addAnnotatedClass(SiparisKalemi.class);
			configuration.addAnnotatedClass(Siparis.class);
			SessionFactory factory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
			return factory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}

}
