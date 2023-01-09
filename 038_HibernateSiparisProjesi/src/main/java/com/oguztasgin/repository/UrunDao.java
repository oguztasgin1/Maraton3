package com.oguztasgin.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.oguztasgin.entity.Urun;
import com.oguztasgin.util.HibernateUtil;

public class UrunDao implements ICrud<Urun>{

	@Override
	public void save(Urun t) {
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
	public void update(Urun t, long id) {
		Transaction transaction = null;
		try (Session session=databaseConnectionHibernate()){
			transaction =session.beginTransaction();
			t.setUrunId(id);
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
			Urun urun = findById(id);
			if(urun != null) {
				session.getTransaction().begin();
				session.delete(urun);
				transaction.commit();
				System.out.println("User bulundu. " + urun.getUrunIsmi());
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
	public List<Urun> findAll() {
		Transaction transaction = null;
		List<Urun> list = null;
		try(Session session=databaseConnectionHibernate()){
			transaction = session.beginTransaction();
			list = session.createQuery("FROM Urun", Urun.class).list();
			transaction.commit();
		}
		return list;
	}

	@Override
	public Urun findById(long id) {
		Session session = databaseConnectionHibernate();
		Urun urun;
		try {
			urun = session.find(Urun.class, id);
			if(urun != null) {
				System.out.println("Urun bulundu. " + urun.getUrunIsmi());
				return urun;
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
