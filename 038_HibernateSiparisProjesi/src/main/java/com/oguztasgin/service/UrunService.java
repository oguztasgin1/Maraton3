package com.oguztasgin.service;

import java.util.List;

import com.oguztasgin.entity.Urun;
import com.oguztasgin.repository.UrunDao;

public class UrunService implements IService<Urun>{
	private UrunDao urunDao;

	public UrunService() {
		urunDao = new UrunDao();
	}

	@Override
	public void create(Urun entity) {
		urunDao.save(entity);
		
	}

	@Override
	public void delete(long id) {
		urunDao.delete(id);
		
	}

	@Override
	public void update(long id, Urun entity) {
		urunDao.update(entity, id);
		
	}

	@Override
	public List<Urun> listAll() {
		
		return urunDao.findAll();
	}

	@Override
	public Urun find(long id) {
		Urun urun = urunDao.findById(id);
		return urun;
	}
	
	
}
