package com.oguztasgin;

import java.util.ArrayList;
import java.util.List;

public class MessagePublisherSonar implements SubjectSonar{
	private List<ObserverSonar> observers = new ArrayList<>();

	@Override
	public void attach(ObserverSonar o) {
		if(!observers.contains(o)) {
			observers.add(o);
		}
	}

	@Override
	public void detach(ObserverSonar o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(MessageSonar ms) {
		for (ObserverSonar observer : observers) {
			observer.update(ms);
		}
		
	}
}
