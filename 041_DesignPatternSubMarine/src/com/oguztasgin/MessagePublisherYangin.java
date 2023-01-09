package com.oguztasgin;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisherYangin implements SubjectYangin{
	private List<ObserverYangin> observers = new ArrayList<>();

	@Override
	public void attach(ObserverYangin o) {
		if(!observers.contains(o)) {
			observers.add(o);
		}
		
	}

	@Override
	public void detach(ObserverYangin o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(MessageYangin m) {
		for (ObserverYangin observer : observers) {
			observer.update(m);
		}
	}
}
