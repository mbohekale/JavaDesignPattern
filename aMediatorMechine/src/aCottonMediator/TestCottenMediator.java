package aCottonMediator;


import aMediatorMechine.Button;
import aMediatorMechine.Heater;
import aMediatorMechine.Mechine;
import aMediatorMechine.MechineMediator;
import aMediatorMechine.Valve;

public class TestCottenMediator {

	public static void main(String[] args) {
		MechineMediator mediator = null;
		Sensor sensor = new Sensor();
		SoilRemoval soilRemoval = new SoilRemoval();
		Motor motor = new Motor();
		Mechine mechine = new Mechine();
		Heater heater = new Heater();
		Valve valve = new Valve();
		Button button = new  Button();
		
		mediator = new CottonMediator(mechine,heater,motor,sensor,soilRemoval,valve);
		button.setMediator(mediator);
		mechine.setMediator(mediator);
		heater.setMediator(mediator);
		valve.setMediator(mediator);
		button.press();
		
		 
		 

	}

}
