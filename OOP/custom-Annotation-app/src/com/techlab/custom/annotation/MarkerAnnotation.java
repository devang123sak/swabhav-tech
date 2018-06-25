package com.techlab.custom.annotation;

import java.lang.annotation.*;
import java.lang.reflect.*;

// marker annotation 
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker {
}

public class MarkerAnnotation {

	@MyMarker
	public static void myMethod1() {
		MarkerAnnotation obj = new MarkerAnnotation();

		try {

			Method m = obj.getClass().getMethod("myMethod");

			
			// if the annotation is present
			if (m.isAnnotationPresent(MyMarker.class))
				System.out.println("MyMarker is present");

		} catch (NoSuchMethodException exc) {

			System.out.println("Method not found..!!");
		}
	}
}