package aStateDesignPattern;

public class Robot implements RoboticState{
	private RoboticState roboticOn;
	private RoboticState roboticCook;
	private RoboticState roboticOff;
	private RoboticState state;
	public Robot() {
		this.roboticOn = new RoboticOn(this);
		this.roboticOff = new RoboticOff(this);
		this.roboticCook = new RoboticCook(this);
		this.state=roboticOn;
	}
	

	@Override
	public void walk() {}

	@Override
	public void cook() {}

	@Override
	public void off() {}

}
