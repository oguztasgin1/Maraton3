package com.oguztasgin;

public class MessageYangin {
	final String messageContent;
	final String lokasyon;
	final int sicaklik;
	public MessageYangin(String my, String lokasyon, int sicaklik) {
		super();
		this.messageContent = my;
		this.lokasyon = lokasyon;
		this.sicaklik = sicaklik;
	}
	@Override
	public String toString() {
		return "MessageYangin [messageContent=" + messageContent + ", lokasyon=" + lokasyon + ", sicaklik=" + sicaklik
				+ "]";
	}
	public String getMessageContent() {
		return messageContent;
	}
	public String getLokasyon() {
		return lokasyon;
	}
	public int getSicaklik() {
		return sicaklik;
	}
	
	
	
}
