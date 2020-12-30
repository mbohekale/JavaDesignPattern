package aMediatorMechine;

public class Button implements Colleague{
	private MechineMediator mediator;

	@Override
	public void setMediator(MechineMediator mediator) {
		this.mediator=mediator;
	}
	public void press() {
		System.out.println("Button pressed");
		mediator.start();
	}

}
