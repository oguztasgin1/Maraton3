package com.oguztasgin.repository;

import java.util.List;

import org.hibernate.Session;

import com.oguztasgin.util.HibernateUtil;

public interface ICrud<T> {
	void save(T t);
	void update(T t, long id);
	void delete(long id);
	List<T> findAll();
	T findById(long id);
	
	default Session databaseConnectionHibernate() {
		
		return HibernateUtil.getSessionFactory().openSession();
	}
}
