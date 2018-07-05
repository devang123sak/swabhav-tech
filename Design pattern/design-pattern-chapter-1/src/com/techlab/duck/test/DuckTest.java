package com.techlab.duck.test;

import com.techlab.duck.Duck;
import com.techlab.duck.FlyRocketPowered;
import com.techlab.duck.MallardDuck;
import com.techlab.duck.ModelDuck;

public class DuckTest {

	public static void main(String[] args) {

		MallardDuck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
		
		Duck	 model = new ModelDuck();
		model.performFly();	
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}

}
