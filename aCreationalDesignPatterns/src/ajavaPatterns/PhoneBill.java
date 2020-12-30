package ajavaPatterns;

import factoryDesignPattern.SelectNetworkFactory;

public class PhoneBill {

	public static void main(String[] args) {
		System.out.println("hello");
		SelectNetworkFactory snf = new SelectNetworkFactory();
		System.out.println(snf);
	}

}
