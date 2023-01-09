package com.oguztasgin;

public class MessageSubscriberTorpidoMerkezi implements ObserverSonar{

	@Override
	public void update(MessageSonar m) {
		System.out.println("MessageSubscriber TorpidoMerkezi: " + m.getMessageContent());
		System.out.println("TorpidoMerkezi ekranında goster alarm cal");
		
	}


}
