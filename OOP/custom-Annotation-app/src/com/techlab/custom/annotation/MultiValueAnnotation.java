package com.techlab.custom.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
@interface MyAnnotation1 {
	int value() default 0;

	String name() default "null";
}

public class MultiValueAnnotation {

	// Applying annotation

	@MyAnnotation1()
	public void myMethod() {

		try {
			MultiValueAnnotation obj = new MultiValueAnnotation();
			Method m = obj.getClass().getMethod(("myMethod"));

			MyAnnotation1 anno = m.getAnnotation(MyAnnotation1.class);

			System.out.println(anno.value()); // displays 10
			System.out.println(anno.name()); // displays sachin

		} catch (NoSuchMethodException exc) {
			System.out.println("Method not found..!!");
		}
	}
}
