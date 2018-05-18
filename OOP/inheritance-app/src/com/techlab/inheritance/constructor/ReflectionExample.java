package com.techlab.inheritance.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionExample {

	public static void main(String[] args) throws IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Class<A> a = A.class;
		Class<B> b = B.class;
		String a1 = a.getSimpleName();// to get class name
		System.out.println("Class name = " + a1);

		// // to obtain Constructor.
		Constructor[] cons = a.getConstructors();// for A class
		System.out.println(Arrays.toString(cons));
		Constructor[] cons1 = b.getConstructors();// for B class
		for (Constructor con : cons1) {
			System.out.println(con);
		}

		// to obtain all methods.
		Method[] allmethods = a.getMethods();
		for (Method method : allmethods) {
			System.out.println("method = " + method.getName());
		}

		// to obtain methods declared bt user.
		Method[] declaredMethods = a.getDeclaredMethods();
		for (Method dmethod : declaredMethods) {
			System.out
					.println("Declared by user method = " + dmethod.getName());

		}

		Method[] method = B.class.getMethods();
		B obj = new B();
		if (method[1].getName().equals("setData"))// if method is same then only
													// data is invoke.
			method[1].invoke(obj, " some data..");

		System.out.println(method[0].getName());// to get method name.
		
	}

}
