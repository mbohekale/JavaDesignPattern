package aCottonMediator;

import aMediatorMechine.Heater;
import aMediatorMechine.Mechine;
import aMediatorMechine.MechineMediator;
import aMediatorMechine.Valve;

public class CottonMediator implements MechineMediator{
	private final Mechine mechine;
	private final Heater heater;
	private final Motor motor;
	private final Sensor sensor;
	private final SoilRemoval soilRemoval;
	private final Valve valve;
	
	public CottonMediator(Mechine mechine,Heater heater,
			Motor motor,Sensor sensor,SoilRemoval soilRemoval,Valve valve) {
		this.mechine=mechine;
		this.heater=heater;
		this.motor=motor;
		this.sensor=sensor;
		this.soilRemoval=soilRemoval;
		this.valve=valve;
		System.out.println("Setting up for cotton Program");
	}

	@Override
	public void start() {
		mechine.start();
	}

	@Override
	public void wash() {
		motor.startMotor();
	}

	@Override
	public void open() {
		valve.open();
	}

	@Override
	public void closed() {
		valve.closed();
	}

	@Override
	public void off() {
		heater.off();
	}

	@Override
	public void on() {
		heater.on(40);
	}

	@Override
	public boolean checkTemperature(int temp) {
		return sensor.checkTemperature(temp);
	}

}
