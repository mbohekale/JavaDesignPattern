package aProxyDesignPattern;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ReportGeneratorClient {

	public static void main(String[] args) throws Exception{		

		try {
			String host = "localhost";
			int Port = 1234;
			String srvName = "PizzaCoRemoteGenerator";
			String text = "Location Daily report";
			Registry registry = LocateRegistry.getRegistry(host, Port);
			
			String[] registrys = registry.list();
			for(String a:registrys) {
				System.out.println(a);
			}
			
			ReportGenerator appendText = (ReportGenerator)(registry.lookup(srvName));
			
		} catch (Exception e) {
		e.printStackTrace();
		}
		
	}
	

}
