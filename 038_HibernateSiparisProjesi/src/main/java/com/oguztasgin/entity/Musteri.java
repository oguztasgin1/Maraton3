package com.oguztasgin.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Musteri {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long musteriId;
	
	private String musteriAd;
	private String musteriSoyad;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "musteri")	
	private List<Siparis> siparislerListesi;
	
	public Musteri() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Musteri(String musteriAd, String musteriSoyad) {
		super();
		this.musteriAd = musteriAd;
		this.musteriSoyad = musteriSoyad;
	}
	

	public Musteri(String musteriAd, String musteriSoyad, List<Siparis> siparislerListesi) {
		super();
		this.musteriAd = musteriAd;
		this.musteriSoyad = musteriSoyad;
		this.siparislerListesi = siparislerListesi;
	}

	public Musteri(long musteriId, String musteriAd, String musteriSoyad) {
		super();
		this.musteriId = musteriId;
		this.musteriAd = musteriAd;
		this.musteriSoyad = musteriSoyad;
	}

	public long getMusteriId() {
		return musteriId;
	}

	public void setMusteriId(long musteriId) {
		this.musteriId = musteriId;
	}

	public String getMusteriAd() {
		return musteriAd;
	}

	public void setMusteriAd(String musteriAd) {
		this.musteriAd = musteriAd;
	}

	public String getMusteriSoyad() {
		return musteriSoyad;
	}

	public void setMusteriSoyad(String musteriSoyad) {
		this.musteriSoyad = musteriSoyad;
	}
	
	

	public List<Siparis> getSiparislerListesi() {
		return siparislerListesi;
	}

	public void setSiparislerListesi(List<Siparis> siparislerListesi) {
		this.siparislerListesi = siparislerListesi;
	}

	@Override
	public String toString() {
		return "Musteri [musteriId=" + musteriId + ", musteriAd=" + musteriAd + ", musteriSoyad=" + musteriSoyad
				+ ", siparislerListesi=" + siparislerListesi.size() + "]";
	}

	
}
