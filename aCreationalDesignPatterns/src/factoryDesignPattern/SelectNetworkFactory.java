package factoryDesignPattern;

public class SelectNetworkFactory {
	public Cellularplan getPlan(String planType) {
		if(planType == null) {
			return null;
		}
		if(planType.equalsIgnoreCase("ABCNetwork")) {
			return new ABCNetworkFactory();
		}
		if(planType.equalsIgnoreCase("PQRNetwork")) {
			return new PQRNetwork();
		}
		if(planType.equalsIgnoreCase("XYZNetwork")) {
			return new XYZNetwork();
		}
		return null;
		}

}
