package com.oguztasgin.service;

import java.util.List;

import com.oguztasgin.entity.SiparisKalemi;
import com.oguztasgin.repository.MusteriDao;
import com.oguztasgin.repository.SiparisKalemiDao;

public class SiparisKalemService implements IService<SiparisKalemi>{
	
	private SiparisKalemiDao siparisKalemiDao;
	
	

	public SiparisKalemService() {
		siparisKalemiDao = new SiparisKalemiDao();
	}

	@Override
	public void create(SiparisKalemi entity) {
		siparisKalemiDao.save(entity);
		
	}

	@Override
	public void delete(long id) {
		siparisKalemiDao.delete(id);
		
	}

	@Override
	public void update(long id, SiparisKalemi entity) {
		siparisKalemiDao.update(entity, id);
		
	}

	@Override
	public List<SiparisKalemi> listAll() {
		return siparisKalemiDao.findAll();
	}

	@Override
	public SiparisKalemi find(long id) {
		SiparisKalemi siparisKalemi = siparisKalemiDao.findById(id);
		return siparisKalemi;
	}

}
