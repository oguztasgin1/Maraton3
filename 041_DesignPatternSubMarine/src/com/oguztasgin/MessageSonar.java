package com.oguztasgin;

public class MessageSonar {
	final String messageContent;
	final String denizAraciTipi;
	final int denizAraciHizi;
	final int denizAraciYonu;
	final int aciliyet;
	
	public MessageSonar(String m, String denizAraciTipi, int denizAraciHizi, int denizAraciYonu,
			int aciliyet) {
		super();
		this.messageContent = m;
		this.denizAraciTipi = denizAraciTipi;
		this.denizAraciHizi = denizAraciHizi;
		this.denizAraciYonu = denizAraciYonu;
		this.aciliyet = aciliyet;
	}

	@Override
	public String toString() {
		return "MessageSonar [messageContent=" + messageContent + ", denizAraciTipi=" + denizAraciTipi
				+ ", denizAraciHizi=" + denizAraciHizi + ", denizAraciYonu=" + denizAraciYonu + ", aciliyet=" + aciliyet
				+ "]";
	}

	public String getMessageContent() {
		return messageContent;
	}

	public String getDenizAraciTipi() {
		return denizAraciTipi;
	}

	public int getDenizAraciHizi() {
		return denizAraciHizi;
	}

	public int getDenizAraciYonu() {
		return denizAraciYonu;
	}

	public int getAciliyet() {
		return aciliyet;
	}
	
	
}
