package com.oguztasgin;

public class MessageSubscriberHaberlesmeci implements ObserverYangin, ObserverSonar{
	@Override
	public void update(MessageYangin m) {
		System.out.println("MessageSubscriber Haberlesmeci: " + m.getMessageContent());
		System.out.println("Haberlesmeci ekranında goster alarm cal");
		
	}

	@Override
	public void update(MessageSonar m) {
		System.out.println("MessageSubscriber Haberlesmeci: " + m.getMessageContent());
		System.out.println("Haberlesmeci ekranında goster alarm cal");
	}
}
