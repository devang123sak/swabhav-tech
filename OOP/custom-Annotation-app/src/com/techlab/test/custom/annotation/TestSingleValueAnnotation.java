package com.techlab.test.custom.annotation;

import java.lang.reflect.Method;


//import com.techlab.custom.annotation.MyAnnotation;
import com.techlab.custom.annotation.SingleValueAnnotation;

public class TestSingleValueAnnotation {

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException {

		SingleValueAnnotation s = new SingleValueAnnotation();
		s.myMethod();

	}

}
