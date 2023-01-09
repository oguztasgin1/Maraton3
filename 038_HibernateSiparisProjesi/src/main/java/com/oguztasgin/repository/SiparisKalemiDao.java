package com.oguztasgin.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.entity.SiparisKalemi;
import com.oguztasgin.util.HibernateUtil;

public class SiparisKalemiDao implements ICrud<SiparisKalemi>{

	@Override
	public void save(SiparisKalemi t) {
		Transaction transaction = null;
		try (Session session = new HibernateUtil().getSessionFactory().openSession()){
			transaction = session.beginTransaction();
			session.save(t);
			transaction.commit();
			session.close();
		}catch (Exception e) {
			if(transaction != null) {
				transaction.rollback();
				System.out.println("Saved error");
			}
		}
		
	}

	@Override
	public void update(SiparisKalemi t, long id) {
		Transaction transaction = null;
		try (Session session=databaseConnectionHibernate()){
			transaction =session.beginTransaction();
			t.setSiparisKalemId(id);
	        session.update(t);
	        transaction.commit();
	        session.close();
		}catch (Exception e) {
			System.out.println("update error");
			if(transaction != null) {
				transaction.rollback();
			}
		}
		
		
	}

	@Override
	public void delete(long id) {
		Transaction transaction = null;
		try (Session session=databaseConnectionHibernate()){
			SiparisKalemi siparisKalemi = findById(id);
			if(siparisKalemi != null) {
				session.getTransaction().begin();
				session.delete(siparisKalemi);
				transaction.commit();
				System.out.println("SiparisKalemi bulundu. " + siparisKalemi.getSiparisKalemId());
			}else {
				System.out.println("Id kontrol ediniz.");
			}
		}catch (Exception e) {
			e.printStackTrace();
			if(transaction != null) {
				transaction.rollback();
			}
		}
		
	}

	@Override
	public List<SiparisKalemi> findAll() {
		Transaction transaction = null;
		List<SiparisKalemi> list = null;
		try(Session session=databaseConnectionHibernate()){
			transaction = session.beginTransaction();
			list = session.createQuery("FROM SiparisKalemi", SiparisKalemi.class).list();
			transaction.commit();
		}
		return list;
	}

	@Override
	public SiparisKalemi findById(long id) {
		Session session = databaseConnectionHibernate();
		SiparisKalemi siparisKalemi;
		try {
			siparisKalemi = session.find(SiparisKalemi.class, id);
			if(siparisKalemi != null) {
				System.out.println("SiparisKalemi bulundu. " + siparisKalemi.getSiparisKalemId());
				return siparisKalemi;
			}else {
				System.out.println("Id kontrol ediniz.");
			}
		}catch (Exception e) {
			System.out.println("Something Wrong");
		}finally {
			session.close();
		}
		return null;
	}

}
