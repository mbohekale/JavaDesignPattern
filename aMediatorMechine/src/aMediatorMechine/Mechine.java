package aMediatorMechine;

public class Mechine implements Colleague{
	private MechineMediator mediator;

	@Override
	public void setMediator(MechineMediator mediator) {
		this.mediator=mediator;
	}
	public void start() {
		mediator.open();
	}
	public void wash() {
		mediator.wash();
	}	

}
