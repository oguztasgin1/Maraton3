package com.oguztasgin.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class SiparisKalemi {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long siparisKalemId;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Urun urun;
	
	private int urunSayisi;
	
	public SiparisKalemi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SiparisKalemi(Urun urun, int urunSayisi) {
		super();
		this.urun = urun;
		this.urunSayisi = urunSayisi;
	}

	public SiparisKalemi(long siparisKalemId, Urun urun, int urunSayisi) {
		super();
		this.siparisKalemId = siparisKalemId;
		this.urun = urun;
		this.urunSayisi = urunSayisi;
	}

	public long getSiparisKalemId() {
		return siparisKalemId;
	}

	public void setSiparisKalemId(long siparisKalemId) {
		this.siparisKalemId = siparisKalemId;
	}

	public Urun getUrun() {
		return urun;
	}

	public void setUrun(Urun urun) {
		this.urun = urun;
	}

	public int getUrunSayisi() {
		return urunSayisi;
	}

	public void setUrunSayisi(int urunSayisi) {
		this.urunSayisi = urunSayisi;
	}

	@Override
	public String toString() {
		return "SiparisKalemi [siparisKalemId=" + siparisKalemId + ", urun=" + urun + ", urunSayisi=" + urunSayisi
				+ "]";
	}
	
	
}
