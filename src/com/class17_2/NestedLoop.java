package com.class17_2;

public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 3; i++) {

			for (int y = 0; y < 3; y++) {
				System.out.println("I am inner Loop");
			}
			System.out.println("-------I am outer loop--------");
		}
	}

}