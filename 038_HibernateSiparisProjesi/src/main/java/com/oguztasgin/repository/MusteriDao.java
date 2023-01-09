package com.oguztasgin.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.util.HibernateUtil;

public class MusteriDao implements ICrud<Musteri>{

	@Override
	public void save(Musteri t) {
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
	public void update(Musteri t, long id) {
		Transaction transaction = null;
		try (Session session=databaseConnectionHibernate()){
			transaction =session.beginTransaction();
			t.setMusteriId(id);
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
			Musteri musteri = findById(id);
			if(musteri != null) {
				session.getTransaction().begin();
				session.delete(musteri);
				transaction.commit();
				System.out.println("Musteri bulundu. " + musteri.getMusteriAd() + " " + musteri.getMusteriSoyad());
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
	public List<Musteri> findAll() {
		Transaction transaction = null;
		List<Musteri> list = null;
		try(Session session=databaseConnectionHibernate()){
			transaction = session.beginTransaction();
			list = session.createQuery("FROM Musteri", Musteri.class).list();
			transaction.commit();
		}
		return list;
	}

	@Override
	public Musteri findById(long id) {
		Session session = databaseConnectionHibernate();
		Musteri musteri;
		try {
			musteri = session.find(Musteri.class, id);
			if(musteri != null) {
				System.out.println("Musteri bulundu. " + musteri);
				return musteri;
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
	
	public void nativeSQLQuery1(){
		EntityManager entityManager = new HibernateUtil().getSessionFactory().createEntityManager();
		List<Object[]> musteriList = entityManager.createNativeQuery("SELECT musteri.musteriid, COUNT(DISTINCT musteri_musteriid.siparis) AS siparis_sayisi FROM siparis").getResultList();
		for(Object[] element : musteriList) {
			System.out.println("ID " + element[0] + " siparis_sayisi " + element[1]);
			
		}
		
	}
	
	public void nativeSQLQuery2(){
		EntityManager entityManager = new HibernateUtil().getSessionFactory().createEntityManager();
		List<Object[]> musteriList = entityManager.createNativeQuery("SELECT musteri.musteriad, musteri.musterisoyad, COUNT(DISTINCT musteri_musteriid.siparis) AS siparis_sayisi FROM siparis").getResultList();
		for(Object[] element : musteriList) {
			System.out.println("musteriad " + element[0] + " musterisoyad " + element[1] + " siparis_sayisi " + element[1]);
		}

	}
}
