package com.techlab.starbuzz.test;

import com.techlab.starbuzz.Beverage;
import com.techlab.starbuzz.DarkRoast;
import com.techlab.starbuzz.Espresso;
import com.techlab.starbuzz.Mocha;
import com.techlab.starbuzz.Whip;

public class StarbuzzCoffee {

	public static void main(String[] args) {

		Beverage beverage=new Espresso();
		System.out.println(beverage.getDescription()+" $" +beverage.cost());
		
		Beverage beverage2=new DarkRoast();
		beverage2=new Mocha(beverage2);
		beverage2=new Mocha(beverage2);
		beverage2=new Whip(beverage2);
		System.out.println(beverage2.getDescription()+" $" +beverage2.cost());
		
	}

}
