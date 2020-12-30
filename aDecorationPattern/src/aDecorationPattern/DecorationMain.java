package aDecorationPattern;

import java.text.DecimalFormat;

import aDecorationPattern.Int.Pizza;
import aDecorationPattern.Int.SimplyVegPizza;

public class DecorationMain {

	public static void main(String[] args) {
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();
		System.out.println(pizza.getDesc());
		System.out.println(pizza.getPrice());
	}

}
