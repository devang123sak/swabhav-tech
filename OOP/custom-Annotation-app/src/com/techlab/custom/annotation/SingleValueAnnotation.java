package com.techlab.custom.annotation;

import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
// @Target(ElementType.METHOD)
@interface MyAnnotation {
	int value() default 0;
}

// Applying annotation
public class SingleValueAnnotation {

	@MyAnnotation(10)
	public void myMethod() {
	
	
	try {
		SingleValueAnnotation obj = new SingleValueAnnotation();
		Method m = obj.getClass().getMethod(("myMethod"));
		
		MyAnnotation anno = m.getAnnotation(MyAnnotation.class);
		
		System.out.println(anno.value());      // displays 10
		
	} catch(NoSuchMethodException exc) {
		System.out.println("Method not found..!!");
	}
}
}
