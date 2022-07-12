package com.fundamental.day5;

public class Generic<T> {

	private T obj;
	
	// constructor
	Generic(T obj) {
		this.obj = obj;
	}
	
	public T getData() {
		return obj;
	}
	
	public static void main(String[] args) {
		
		Generic<String> string = new Generic<>("Hello");
		System.out.println(string.getData());
		
		Generic<Integer> integer = new Generic<>(1234);
		System.out.println(integer.getData());
	}

}
