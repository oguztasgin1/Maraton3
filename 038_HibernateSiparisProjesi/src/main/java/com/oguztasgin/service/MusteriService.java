package com.oguztasgin.service;

import java.util.List;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.repository.MusteriDao;

public class MusteriService implements IService<Musteri>{
	
	private MusteriDao musteriDao;

	public MusteriService() {
		musteriDao= new MusteriDao();
	}

	@Override
	public void create(Musteri entity) {
		musteriDao.save(entity);
		
	}

	@Override
	public void delete(long id) {
		musteriDao.delete(id);
		
	}

	@Override
	public void update(long id, Musteri entity) {
		musteriDao.update(entity, id);
		
	}

	@Override
	public List<Musteri> listAll() {
		// TODO Auto-generated method stub
		return musteriDao.findAll();
	}

	@Override
	public Musteri find(long id) {
		Musteri musteri = musteriDao.findById(id);
		return musteri;
	}
	
	

}
