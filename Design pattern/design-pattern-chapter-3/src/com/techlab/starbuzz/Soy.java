package com.techlab.starbuzz;

public class Soy extends condimentDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDiscription() {
		return beverage.getDescription() + ", Soy";
	}

	@Override
	public double cost() {
		return  this.beverage.cost()+.15 ;
	}
}
