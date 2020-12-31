package aObserverProject;

import java.util.ArrayList;
import java.util.List;

public class CommentaryObject implements Subject,Commentary{
	private final List<Observer> observers;
	private String desc;
	private String subjectDetails ;
	
	public CommentaryObject(List<Observer> observers,String subjuctDetails) {		
		this.observers= observers;
		this.subjectDetails=subjectDetails;
	}

	@Override
	public void setDesc(String desc) {
		this.desc=desc;
		notifyObserver();
	}

	@Override
	public void subscribeObserver(Observer obs) {
		observers.add(obs);
	}

	@Override
	public void unSubscribeObserver(Observer obs) {
		int index = observers.indexOf(obs);
		observers.remove(index);
	}

	@Override
	public String subjectDetails() {
		return subjectDetails ;
		}

	@Override
	public void notifyObserver() {
		System.out.println();
		for(Observer observer: observers) {
			observer.update(desc);
		}
	}

}
