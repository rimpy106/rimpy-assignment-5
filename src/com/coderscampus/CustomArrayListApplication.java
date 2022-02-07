package com.coderscampus;

public class CustomArrayListApplication {

	public static void main(String[] args) {
		CustomList<String> myCustomList = new CustomArrayList<>();
		for(int i=1;i<50;i++) {
			myCustomList.add("Hello:"+i);
		}		
		for (int i=0; i<myCustomList.getSize(); i++) {
		    System.out.println(myCustomList.get(i));    
		}
		System.out.println("----------");
		System.out.println(myCustomList.get(51));

	}

}
