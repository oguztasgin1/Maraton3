package com.oguztasgin;

import java.util.ArrayList;
import java.util.List;



public class MessagePublisherOksijen implements SubjectOksijen{
	
	private List<ObserverOksijen> observers = new ArrayList<>();
	
	@Override
	public void attach(ObserverOksijen o) {
		if(!observers.contains(o)) {
			observers.add(o);
		}
		
	}

	@Override
	public void detach(ObserverOksijen o) {
		observers.remove(o);
		
	}

	@Override
	public void notifyUpdate(MessageOksijen m) {
		for (ObserverOksijen observer : observers) {
			observer.update(m);
		}
	}

}
