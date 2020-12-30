package aObserverProject;

public class CommentaryObject implements Subject,Commentary{

	@Override
	public void setDesc(String desc) {}

	@Override
	public void subscribeObserver(Observer obs) {}

	@Override
	public void unSubscribeObserver(Observer obs) {}

	@Override
	public void subjectDetails() {}

	@Override
	public void notifyObserver() {}

}
