package com.oguztasgin;

public class Main {

	public static void main(String[] args) {
		MessageSubscriberKomutan s1 = new MessageSubscriberKomutan();
		MessageSubscriberHaberlesmeci s2 = new MessageSubscriberHaberlesmeci();
		MessageSubscriberTorpidoMerkezi s3 = new MessageSubscriberTorpidoMerkezi();
		
		MessagePublisherOksijen o = new MessagePublisherOksijen();
		o.attach(s1);
		
		o.notifyUpdate(new MessageOksijen("Oksijen seviyesi normal", 88));
		
		System.out.println("\n * * * * \n");
		
		MessagePublisherSonar so = new MessagePublisherSonar();
		so.attach(s1);
		so.attach(s2);
		so.attach(s3);
		
		so.notifyUpdate(new MessageSonar("Etrafta dusman unsuru yok", "None", 5, 3, 0));
		
		System.out.println("\n * * * * \n");
		
		MessagePublisherYangin y = new MessagePublisherYangin();
		y.attach(s1);
		y.attach(s2);
		
		y.notifyUpdate(new MessageYangin("Yangın yok", "None", 18));
		
	}

}
