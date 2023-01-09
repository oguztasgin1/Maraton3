package com.oguztasgin.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.entity.Siparis;
import com.oguztasgin.util.HibernateUtil;

public class SiparisDao implements ICrud<Siparis>{

	@Override
	public void save(Siparis t) {
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
	public void update(Siparis t, long id) {
		Transaction transaction = null;
		try (Session session=databaseConnectionHibernate()){
			transaction =session.beginTransaction();
			t.setSiparisId(id);
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
			Siparis siparis = findById(id);
			if(siparis != null) {
				session.getTransaction().begin();
				session.delete(siparis);
				transaction.commit();
				System.out.println("Siparis bulundu. " + siparis.getSiparisId());
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
	public List<Siparis> findAll() {
		Transaction transaction = null;
		List<Siparis> list = null;
		try(Session session=databaseConnectionHibernate()){
			transaction = session.beginTransaction();
			list = session.createQuery("FROM Siparis", Siparis.class).list();
			transaction.commit();
		}
		return list;
	}

	@Override
	public Siparis findById(long id) {
		Session session = databaseConnectionHibernate();
		Siparis siparis;
		try {
			siparis = session.find(Siparis.class, id);
			if(siparis != null) {
				System.out.println("Siparis bulundu. " + siparis.getSiparisId());
				return siparis;
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
