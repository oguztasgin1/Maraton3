package com.oguztasgin;

public interface SubjectOksijen {
	public void attach(ObserverOksijen o);
	public void detach(ObserverOksijen o);
	public void notifyUpdate(MessageOksijen m);
}
