package aObserverProject;

public interface Subject {
	public void subscribeObserver(Observer obs);
	public void unSubscribeObserver(Observer obs);
	public void subjectDetails();
	public void notifyObserver();

}
