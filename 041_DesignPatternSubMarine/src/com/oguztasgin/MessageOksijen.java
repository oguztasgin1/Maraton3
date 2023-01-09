package com.oguztasgin;

public class MessageOksijen {
	final String messageContent; 
	final int oksijenSeviyesi;
	
	public MessageOksijen(String mo, int oksijenSeviyesi) {
		super();
		this.messageContent = mo;
		this.oksijenSeviyesi = oksijenSeviyesi;
	}
	@Override
	public String toString() {
		return "MessageOksijen [messageContent=" + messageContent + ", oksijenSeviyesi=" + oksijenSeviyesi + "]";
	}
	public String getMessageContent() {
		return messageContent;
	}
	public int getOksijenSeviyesi() {
		return oksijenSeviyesi;
	}
	
	
}
