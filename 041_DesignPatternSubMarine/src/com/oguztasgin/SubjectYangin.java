package com.oguztasgin;


public interface SubjectYangin {
	public void attach(ObserverYangin o);
	public void detach(ObserverYangin o);
	public void notifyUpdate(MessageYangin m);
}
