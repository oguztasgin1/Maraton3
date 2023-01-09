package com.oguztasgin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Urun {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long urunId;
	
	private String urunIsmi;
	private int urunFiyat;
	
	public Urun() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Urun(String urunIsmi, int urunFiyat) {
		super();
		this.urunIsmi = urunIsmi;
		this.urunFiyat = urunFiyat;
	}

	public Urun(long urunId, String urunIsmi, int urunFiyat) {
		super();
		this.urunId = urunId;
		this.urunIsmi = urunIsmi;
		this.urunFiyat = urunFiyat;
	}

	public long getUrunId() {
		return urunId;
	}

	public void setUrunId(long urunId) {
		this.urunId = urunId;
	}

	public String getUrunIsmi() {
		return urunIsmi;
	}

	public void setUrunIsmi(String urunIsmi) {
		this.urunIsmi = urunIsmi;
	}

	public int getUrunFiyat() {
		return urunFiyat;
	}

	public void setUrunFiyat(int urunFiyat) {
		this.urunFiyat = urunFiyat;
	}

	@Override
	public String toString() {
		return "Urun [urunId=" + urunId + ", urunIsmi=" + urunIsmi + ", urunFiyat=" + urunFiyat + "]";
	}
	
	
}
