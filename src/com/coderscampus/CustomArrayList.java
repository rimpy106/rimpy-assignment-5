package com.coderscampus;

public class CustomArrayList<T> implements CustomList<T> {
	Object[] items = new Object[10];
	int arraySize = 0;

	@Override
	public boolean add(T item) {
		if (items.length == arraySize) {
			items = increasedArraySize(arraySize);
		}
		items[arraySize] = item;
		arraySize++;

		return true;
	}

	private Object[] increasedArraySize(int oldArraySize) {
		Object[] newArray = new Object[oldArraySize * 2];
		for (int i = 0; i < oldArraySize; i++) {
			newArray[i] = items[i];
		}
		return newArray;
	}

	@Override
	public int getSize() {
		return arraySize;
	}


	public T get(int index) {
		return (T) items[index];
	}

}
