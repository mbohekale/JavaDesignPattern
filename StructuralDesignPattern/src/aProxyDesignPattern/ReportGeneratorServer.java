package aProxyDesignPattern;


import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReportGeneratorServer {

	public static void main(String[] args)throws Exception  {
		try {
			final int PORT=1234;
		Registry reg = LocateRegistry.createRegistry(PORT);
		ReportGenerator reportGenerator = new ReportGeneratorImpl();
		reg.rebind("PizzaCoRemoteGenerator", reportGenerator);
		System.out.println("RMIServer is running........");
		} catch (Exception e) {
		e.printStackTrace();
		}
		}

}
