package factoryDesignPattern;

public class ABCNetworkFactory extends Cellularplan {

	@Override
	public void getRate() {
		rate=1.50;
		System.out.println(rate);
	}
	public void processBill(int min){
		System.out.println(min * rate);
		
	}

}
