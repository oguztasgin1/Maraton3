package com.oguztasgin;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import com.oguztasgin.entity.Musteri;
import com.oguztasgin.entity.Siparis;
import com.oguztasgin.entity.SiparisKalemi;
import com.oguztasgin.entity.Urun;
import com.oguztasgin.repository.MusteriDao;
import com.oguztasgin.service.MusteriService;
import com.oguztasgin.service.SiparisKalemService;
import com.oguztasgin.service.SiparisService;
import com.oguztasgin.service.UrunService;
import com.oguztasgin.util.HibernateUtil;
import com.oguztasgin.view.MusteriController;

public class Test {
	private MusteriService musteriService;
	private SiparisKalemService siparisKalemService;
	private SiparisService siparisService;
	private UrunService urunService;
	private MusteriDao musteriDao;
	
	public Test() {
		musteriService = new MusteriService();
		siparisKalemService = new SiparisKalemService();
		siparisService = new SiparisService();
		urunService = new UrunService();
		musteriDao = new MusteriDao();
	}

	public static void main(String[] args) {
		//HibernateUtil.getSessionFactory().openSession();
		
		Test test = new Test();
		
//		Musteri m1 = new Musteri("Ali", "Kaya");
//		Musteri m2 = new Musteri("Sezen", "Aksu");
//		
//		Urun u1 = new Urun("Iphone 14", 40000);
//		Urun u2 = new Urun("Samsung S21", 25000);
//		Urun u3 = new Urun("Arcelik Supurge 14", 10000);
//		Urun u4 = new Urun("LG Led TV", 15000);
//			
//		SiparisKalemi sk1 = new SiparisKalemi(u1, 1);
//		SiparisKalemi sk2 = new SiparisKalemi(u2, 2);
//		Siparis s1 = new Siparis(m1, Arrays.asList(sk1, sk2));
//		
//		SiparisKalemi sk3 = new SiparisKalemi(u2, 2);
//		SiparisKalemi sk4 = new SiparisKalemi(u3, 1);
//		Siparis s2 = new Siparis(m2, Arrays.asList(sk3, sk4));
//		
//		SiparisKalemi sk5 = new SiparisKalemi(u4, 2);
//		Siparis s3 = new Siparis(m1, Arrays.asList(sk5));
//		
//		Siparis s4 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u1, 1)));
//		Siparis s5 = new Siparis(m2, Arrays.asList(new SiparisKalemi(u2, 1)));
//		
//		test.siparisService.create(s1);
//		test.siparisService.create(s2);
//		test.siparisService.create(s3);
//		test.siparisService.create(s4);
//		test.siparisService.create(s5);
		
		
		MusteriController musteriController = new MusteriController();
		//musteriController.musterileriListele();
		musteriController.musterileriListele(1);
		
		test.musteriDao.nativeSQLQuery1();
		test.musteriDao.nativeSQLQuery2();
		
		
	}
	
}
