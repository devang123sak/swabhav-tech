package com.techlab.test.refactoring;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

import com.techlab.refactoring.Foo;
import com.techlab.refactoring.NeedRefactoring;

public class TestFoo {

	static Class<Foo> a = Foo.class;

	public static void main(String[] args) throws NoSuchMethodException,
			SecurityException {
		Foo f = new Foo();
		// f.m1();
		// f.m2();
		// f.m3();

		Method[] declaredMethods = a.getDeclaredMethods();
		for (Method dmethod : declaredMethods) {
			System.out
					.println("Declared by user method = " + dmethod.getName());

		}

		Foo p = new Foo();
		Method[] methods = p.getClass().getMethods();

		for (Method method : methods) {
			NeedRefactoring annos = method.getAnnotation(NeedRefactoring.class);
			if (annos != null) {
				try {
					System.out.println("Method which used annotation = "
							+ method.getName());
					 method.invoke(p);

				} catch (Exception e) {
					e.printStackTrace();

				}
			}
		}

	}

}
