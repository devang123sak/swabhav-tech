package com.techlab.swabhavQ;

import java.util.Iterator;
import java.util.LinkedList;

public class SaveQ2cart<T> implements SwabhavQ, Iterable<T> {

	LinkedList<T> nosQ = new LinkedList<>();

	@Override
	public T deque() {

		return nosQ.removeFirst();
	}

	@Override
	public void enque(Object t) {

		nosQ.add((T) t);
	}

	public int size() {
		return nosQ.size();
	}

	@Override
	public Iterator<T> iterator() {
		return nosQ.iterator();
	}
}
