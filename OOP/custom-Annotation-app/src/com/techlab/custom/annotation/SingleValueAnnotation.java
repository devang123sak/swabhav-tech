package com.techlab.custom.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)

 @interface MyAnnotation {
	int value();
}

// Applying annotation
public class SingleValueAnnotation {

	@MyAnnotation(value = 10)
	public void sayHello() {
		System.out.println("hello annotation");
	}
}
