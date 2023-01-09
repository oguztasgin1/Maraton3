package com.oguztasgin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Siparis {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Sql' de otomatik olussun.
	private long siparisId;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Musteri musteri;
	
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<SiparisKalemi> siparislerKalemi;
	
	public Siparis() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Siparis(Musteri musteri, List<SiparisKalemi> siparislerKalemi) {
		super();
		this.musteri = musteri;
		this.siparislerKalemi = siparislerKalemi;
	}

	public Siparis(long siparisId, Musteri musteri, List<SiparisKalemi> siparislerKalemi) {
		super();
		this.siparisId = siparisId;
		this.musteri = musteri;
		this.siparislerKalemi = siparislerKalemi;
	}

	public long getSiparisId() {
		return siparisId;
	}

	public void setSiparisId(long siparisId) {
		this.siparisId = siparisId;
	}

	public Musteri getMusteri() {
		return musteri;
	}

	public void setMusteri(Musteri musteri) {
		this.musteri = musteri;
	}

	public List<SiparisKalemi> getSiparislerKalemi() {
		return siparislerKalemi;
	}

	public void setSiparisler(List<SiparisKalemi> siparisler) {
		this.siparislerKalemi = siparisler;
	}

	@Override
	public String toString() {
		return "Siparis [siparisId=" + siparisId + ", musteri=" + musteri + ", siparislerKalemi=" + siparislerKalemi.size() + "]";
	}
	
	
	
}
