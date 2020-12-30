package aMediatorMechine;

public class Valve implements Colleague{
	private MechineMediator mediator;
	//public Valve() {}

	@Override
	public void setMediator(MechineMediator mediator) {
		this.mediator=mediator;
	}
	public void open() {
		System.out.println("Valve is opened......");
		System.out.println("Filling in water......");
		mediator.closed();
	}
	public void closed() {
		System.out.println("Valve is closed......");
		mediator.on();
	}
		

}
