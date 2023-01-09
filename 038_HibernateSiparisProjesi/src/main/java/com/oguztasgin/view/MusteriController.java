package com.oguztasgin.view;

import java.util.List;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.service.MusteriService;

public class MusteriController {
	private MusteriService musteriService;
	
	public MusteriController() {
		musteriService = new MusteriService();
	}
	
	public void musterileriListele() {
		List<Musteri> musteriListesi = musteriService.listAll();
		for (int i = 0; i < musteriListesi.size()-1; i++) {
			
			System.out.println("Siparis ID " + musteriListesi.get(i).getSiparislerListesi().get(i).getSiparisId()+ 
					" Musteri Id: "+ musteriListesi.get(i).getMusteriId() + " Ad: " + musteriListesi.get(i).getMusteriAd() + " Soyad: " 
					+ musteriListesi.get(i).getMusteriSoyad() + "\n"
					+ " Urun Ismi: " + musteriListesi.get(i).getSiparislerListesi().get(i).getSiparislerKalemi().get(i).getUrun().getUrunIsmi()
					+ " Urun Fiyat:" + musteriListesi.get(i).getSiparislerListesi().get(i).getSiparislerKalemi().get(i).getUrun().getUrunFiyat()
					+ " Urun Adeti: " + musteriListesi.get(i).getSiparislerListesi().get(i).getSiparislerKalemi().get(i).getUrunSayisi() + "\n"
					+ " Siparis Toplam: " + (musteriListesi.get(i).getSiparislerListesi().get(i).getSiparislerKalemi().get(i).getUrunSayisi())
					* musteriListesi.get(i).getSiparislerListesi().get(i).getSiparislerKalemi().get(i).getUrun().getUrunFiyat());
		}
		
	}
	public void musterileriListele(int musteriId) {
		List<Musteri> musteriListesi = musteriService.listAll().stream().filter(musteri -> musteri.getMusteriId() == musteriId).toList();
		
		System.out.println("Musteri Id " + musteriId + " Musteri Adi: " +
				musteriListesi.get(0).getMusteriAd() + " Musteri Soyadi: " + musteriListesi.get(0).getMusteriSoyad() + "\n"
				+  " Siparis ID: "+ musteriListesi.get(0).getSiparislerListesi().get(0).getSiparisId() + "\n"
				+  "Urun Adi "+ musteriListesi.get(0).getSiparislerListesi().get(0).getSiparislerKalemi().get(0).getUrun().getUrunIsmi()
				+ " Urun Fiyati " +  musteriListesi.get(0).getSiparislerListesi().get(0).getSiparislerKalemi().get(0).getUrun().getUrunFiyat());
	}
	
}
