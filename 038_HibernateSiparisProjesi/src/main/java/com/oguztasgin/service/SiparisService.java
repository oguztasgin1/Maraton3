package com.oguztasgin.service;

import java.util.List;

import com.oguztasgin.entity.Siparis;
import com.oguztasgin.repository.SiparisDao;

public class SiparisService implements IService<Siparis>{
	
	private SiparisDao siparisDao;

	public SiparisService() {
		siparisDao = new SiparisDao();
	}

	@Override
	public void create(Siparis entity) {
		siparisDao.save(entity);
		
	}

	@Override
	public void delete(long id) {
		siparisDao.delete(id);
		
	}

	@Override
	public void update(long id, Siparis entity) {
		siparisDao.update(entity, id);
		
	}

	@Override
	public List<Siparis> listAll() {
		return siparisDao.findAll();
				
	}

	@Override
	public Siparis find(long id) {
		Siparis siparis = siparisDao.findById(id);
		return siparis;
	}
	
}
