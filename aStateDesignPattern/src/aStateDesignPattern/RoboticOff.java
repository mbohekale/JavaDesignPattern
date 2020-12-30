package aStateDesignPattern;

public class RoboticOff implements RoboticState {
	public RoboticOff(Robot robotic) {}

	@Override
	public void walk() {}

	@Override
	public void cook() {}

	@Override
	public void off() {}

}
