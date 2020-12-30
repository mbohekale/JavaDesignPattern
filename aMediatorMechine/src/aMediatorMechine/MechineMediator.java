package aMediatorMechine;

public interface MechineMediator {
	public void start();
	public void wash();
	public void open();
	public void closed();
	public void off();
	public void on();
	public boolean checkTemperature(int temp);

}
