package com.techlab.test.custom.annotation;

@interface SmartPhone {
	String os() default "sym";
}

@SmartPhone
class NokiaSeries {
	String model;

	public NokiaSeries(String model) {
		this.model = model;
	}

}

public class SingleAnnotation {

	public static void main(String[] args) {

		NokiaSeries n = new NokiaSeries("hi");
		Class c=n.getClass();
		
	}

}
