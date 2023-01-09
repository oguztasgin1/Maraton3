package com.oguztasgin;

public class MessageSubscriberKomutan implements ObserverOksijen, ObserverSonar, ObserverYangin{

	@Override
	public void update(MessageYangin m) {
		System.out.println("MessageSubscriber Komutan: " + m.getMessageContent());
		System.out.println("Komutan ekranında goster alarm cal");
		
	}

	@Override
	public void update(MessageSonar m) {
		System.out.println("MessageSubscriber Komutan: " + m.getMessageContent());
		System.out.println("Komutan ekranında goster alarm cal");
	}

	@Override
	public void update(MessageOksijen m) {
		System.out.println("MessageSubscriber Komutan: " + m.getMessageContent());
		System.out.println("Komutan ekranında goster alarm cal");
		
	}

}
