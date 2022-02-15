package com.coderscampus;

import java.util.Arrays;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int arraySize = 0;

	@Override
	public boolean add(T item) {
		if (items.length == arraySize) {
			items = increasedArraySize(); 
			//Arrays.copyOf(items, items.length * 2);
		}
		items[arraySize] = item;
		arraySize++;
		return true;
	}

	private Object[] increasedArraySize() {
		Object[] newArray = new Object[items.length * 2];
		for (int i = 0; i < items.length; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return arraySize;
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		return (T) items[index];
	}

}
