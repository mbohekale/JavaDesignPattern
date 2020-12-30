package aMediatorMechine;

public class Heater implements Colleague{
	private MechineMediator mediator;
	//public Heater() {}

	@Override
	public void setMediator(MechineMediator mediator) {
		this.mediator=mediator;		
	}
	public void on(int temp) {
		System.out.println("Heater is On......");
		if(mediator.checkTemperature(temp)) {
			System.out.println("Tempeartor is set to "+ temp);
			mediator.off();
		}
		
	}
	public void off() {
		System.out.println("Heater is Off ");
		mediator.wash();
	}

}
