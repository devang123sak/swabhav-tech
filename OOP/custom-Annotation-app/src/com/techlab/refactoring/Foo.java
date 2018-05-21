package com.techlab.refactoring;

import java.lang.reflect.Method;

public class Foo {

	@NeedRefactoring()
	public void m1() throws NoSuchMethodException, SecurityException {
		Foo obj = new Foo();
		Method m = obj.getClass().getMethod("m1");
		NeedRefactoring anno = m.getAnnotation(NeedRefactoring.class);
		//System.out.println("default value is = " + anno.value());
	}

	public void m2() {
		int a = 1, b = 1;
		int c = a + b;
		System.out.println(c);

	}

	@NeedRefactoring()
	public void m3() throws NoSuchMethodException, SecurityException {

		try {
			Foo obj = new Foo();
			Method m = obj.getClass().getMethod("m3");
			NeedRefactoring anno = m.getAnnotation(NeedRefactoring.class);
			//System.out.println("name = " + anno.name());
		} catch (NoSuchMethodException e) {
			System.out.println("not work");
		}

	}

	public void m4() {
	}

}
